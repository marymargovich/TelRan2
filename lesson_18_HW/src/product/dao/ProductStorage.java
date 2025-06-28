package product.dao;

import product.model.Product;

import java.util.function.Predicate;

public interface ProductStorage {

    boolean addProduct (Product product);

    int size();

    Product removeProduct (String id);

    Product findProductById (String id);

    Product [] findProductsByName (String name);

    Product [] findProductsByCategory (String category);

    Product [] findProductsByPrice(double min, double max);

    Product [] findProductsByQuantity (int min, int max);

    Product [] findProductsByPredicate (Predicate <Product> predicate);




}
