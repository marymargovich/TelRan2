package product.dao;

import product.model.Product;

import java.util.function.Predicate;

public class ProductStorageImpl implements ProductStorage {
    Product[] products;
    int size;

    public ProductStorageImpl(int capacity){
        products = new Product[capacity];
    }


    @Override
    public boolean addProduct(Product product) {
        if( product == null || size == products.length){
            return false;
        }
        for (int i = 0; i < size; i++) {
            if(products[i].getId().equalsIgnoreCase(product.getId())){
                return false;
            }
        }
        products[size++] = product;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Product removeProduct(String id) {
        for (int i = 0; i < size; i++) {
            if(products[i].getId().equalsIgnoreCase(id)){
                Product removed = products[i];
                products[i] = products[size-1];
                products[size-1] = null;
                size--;
                return removed;
            }

        }
        return null;
    }

    @Override
    public Product findProductById(String id) {
        for (int i = 0; i < size; i++) {
            if(products[i].getId().equalsIgnoreCase(id)){
                return products[i];
            }
        }

        return null;
    }

    @Override
    public Product[] findProductsByName(String name) {
        return findProductsByPredicate(pr ->pr.getName().equalsIgnoreCase(name) );
    }

    @Override
    public Product[] findProductsByCategory(String category) {
        return findProductsByPredicate( pr ->pr.getCategory().equalsIgnoreCase(category) );
    }

    @Override
    public Product[] findProductsByPrice(double min, double max) {
        return findProductsByPredicate(pr->pr.getPrice()>= min && pr.getPrice()<= max);
    }

    @Override
    public Product[] findProductsByQuantity(int min, int max) {
        return findProductsByPredicate(pr -> pr.getQuantity()>= min && pr.getQuantity()<= max);
    }

    @Override
    public Product[] findProductsByPredicate(Predicate <Product> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(products[i])){
                count++;
            }
        }
       Product[] result =  new Product[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(products[i])){
                result[j++] = products[i];
            }
        }
        return result;
    }
}
