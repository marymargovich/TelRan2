package product.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import product.dao.ProductStorage;
import product.dao.ProductStorageImpl;
import product.model.Product;

public class ProductStorageTest {
    ProductStorage storage;
    Product[] products;

    @BeforeEach
    void setUp() {
        storage = new ProductStorageImpl(15);
        products = new Product[]{
                new Product("P001", "Notebook", "Stationery", 4.50, 120),       // Stationery, Notebook, 4.50
                new Product("P002", "Notebook", "Stationery", 5.00, 80),        // Stationery, Notebook, 5.00
                new Product("P003", "Wireless Mouse", "Computers", 19.99, 70), // Computers, Mouse, 19.99
                new Product("P004", "USB Cable", "Electronics", 3.20, 200),     // Electronics, Cable, 3.20
                new Product("P005", "USB Cable", "Electronics", 2.99, 150),     // Electronics, Cable, 2.99
                new Product("P006", "Desk Lamp", "Home", 22.50, 25),            // Home, Lamp, 22.50
                new Product("P007", "Desk Lamp", "Home", 21.00, 30),            // Home, Lamp, 21.00
                new Product("P008", "Notebook", "Office", 4.75, 90),            // Office, Notebook, 4.75
                new Product("P009", "Wireless Mouse", "Computers", 17.99, 60),  // Computers, Mouse, 17.99
                new Product("P010", "Water Bottle", "Fitness", 9.99, 50)        // Fitness, Bottle, 9.99

        };
        for (int i = 0; i < products.length; i++) {
            storage.addProduct(products[i]);
        }
    }


    @Test
    void addProduct() {
        assertFalse(storage.addProduct(products[4]));

        Product product = new Product("P011", "Coffee Mug", "Kitchen", 7.49, 110);
        assertTrue(storage.addProduct(product));
        assertEquals(11,storage.size());

        Product duplicate = new Product("P011", "Coffee Mug", "Kitchen", 7.49, 110);
        assertFalse(storage.addProduct(duplicate));

        assertFalse(storage.addProduct(null));

        storage.addProduct(new Product("P011", "Coffee Mug", "Kitchen", 7.49, 110));
        storage.addProduct(new Product("P012", "Yoga Mat", "Fitness", 24.99, 40));
        storage.addProduct(new Product("P013", "Mechanical Pencil", "Stationery", 1.99, 300));
        storage.addProduct(new Product("P014", "Monitor Stand", "Computers", 29.99, 15));
        storage.addProduct(new Product("P015", "LED Strip", "Electronics", 12.49, 85));
        assertEquals(15, storage.size());

        assertFalse(storage.addProduct(new Product("P016", "Bluetooth Speaker", "Electronics", 45.99, 60)));
    }

    @Test
    void removeProduct() {
        int originalSize = storage.size();

        Product remove = storage.removeProduct("P008");
        assertNotNull(remove);
        assertEquals("P008", remove.getId());//удалился правильный объект
        assertEquals(originalSize-1, storage.size());


        Product removeAgain = storage.removeProduct("P008");
        assertNull(removeAgain);

        assertNull(storage.removeProduct("P999"));//несуществующий

    }

    @Test
    void findProductById() {
        Product product = storage.findProductById("P001");
        assertNotNull(product);
        assertEquals("Notebook", product.getName());
        assertEquals("Stationery", product.getCategory());

        assertNull(storage.findProductById("not exist"));

    }

    @Test
    void findProductsByName() {
        Product[] expected = {
                products[0], // P001 Notebook
                products[1], // P002 Notebook
                products[7]  // P008 Notebook
        };

        Product [] nameNotebook = storage.findProductsByName("Notebook");
        assertNotNull(nameNotebook);
        assertEquals(expected.length, nameNotebook.length);
        assertArrayEquals(expected, nameNotebook);

        printProducts(nameNotebook);

        Product [] noProducts = storage.findProductsByName("NonExistentName");
        assertNotNull(noProducts);
        assertEquals(0,noProducts.length);

        Product [] notNull = storage.findProductsByName(null);// не нул
        assertNotNull(notNull);
        assertEquals(0, noProducts.length);

        Product [] notEmptyInput = storage.findProductsByName("");// не пустой стринг
        assertNotNull(notEmptyInput);
        assertEquals(0, notEmptyInput.length);


    }

    @Test
    void findProductsByCategory() {
        Product[] expected = {
                products[3], // P004 USB Cable
                products[4]  // P005 USB Cable
        };

        Product [] categoryElectronics = storage.findProductsByCategory("Electronics");
        assertNotNull(categoryElectronics);
        assertEquals(expected.length, categoryElectronics.length);
        assertArrayEquals(expected, categoryElectronics);

        printProducts(categoryElectronics);

        Product [] noProduct = storage.findProductsByCategory("NotExistentCategory");
        assertNotNull(noProduct);
        assertEquals(0, noProduct.length);

        Product[] notNull = storage.findProductsByCategory(null);
        assertNotNull(notNull);
        assertEquals(0, notNull.length);

        Product[] notEmptyInput = storage.findProductsByCategory("");
        assertNotNull(notEmptyInput);
        assertEquals(0, notEmptyInput.length);

    }

    @Test
    void findProductsByPrice() {
        Product freeProduct = new Product("P011", "Free Sample", "Promo", 0.0, 10);
        storage.addProduct(freeProduct);

        Product[] expected = {
                products[0], // 4.50
                products[1], // 5.00
                products[3], // 3.20
                products[4], // 2.99
                products[7],// 4.75
                freeProduct  // 0.0
        };
        Product [] smallPrice = storage.findProductsByPrice(0.0, 5.0);
        assertNotNull(smallPrice);
        assertEquals(expected.length, smallPrice.length);

        printProducts(smallPrice);

        Product [] noProduct = storage.findProductsByPrice(100, 200);
        assertNotNull(noProduct);
        assertEquals(0, noProduct.length);

        Product [] nullResult = storage.findProductsByPrice(0.0, 0.0);// цена 0
        assertNotNull(nullResult);
        assertEquals(1, nullResult.length);
        assertEquals(freeProduct, nullResult[0]);
        
        Product [] reversedPrice= storage.findProductsByPrice(10.0, 5.0);// min. max
        assertNotNull(reversedPrice);
        assertEquals(0, reversedPrice.length);
        
        Product [] negativePrice = storage.findProductsByPrice(-1, -10); //минусовые
        assertNotNull(negativePrice);
        assertEquals(0, negativePrice.length);

        Product[] exactMatch = storage.findProductsByPrice(4.50, 4.50); // совпадение
        assertNotNull(exactMatch);
        assertEquals(1, exactMatch.length);
        assertEquals(products[0], exactMatch[0]);

        Product [] allProducts = storage.findProductsByPrice(0.0, 1000 );//все продукты
        assertNotNull(allProducts);
        assertEquals(products.length+ 1 , allProducts.length);//+1 из-за свежедобавленного

    }

    @Test
    void findProductsByQuantity() {
        Product[] expected = {
                products[1], // 80
                products[2], // 70
                products[8], // 60
                products[9]  // 50
        };
        Product [] quantity5080 = storage.findProductsByQuantity(50, 80);
        assertNotNull(quantity5080);
        assertEquals(expected.length, quantity5080.length);
        assertArrayEquals(expected, quantity5080);

        printProducts(quantity5080);

        Product[] noProducts = storage.findProductsByQuantity(1000, 2000); //не существуют
        assertNotNull(noProducts);
        assertEquals(0, noProducts.length);

        Product[] reversedQuantity = storage.findProductsByQuantity(90, 70);// обратный диапазон
        assertNotNull(reversedQuantity);
        assertEquals(0, reversedQuantity.length);

        Product [] negativeQuantity = storage. findProductsByQuantity(-10, -100);//минусовые
        assertNotNull(negativeQuantity);
        assertEquals(0, negativeQuantity.length);

        Product [] exactQuantity = storage.findProductsByQuantity(70, 70);//мин и макс совпадают
        assertNotNull(exactQuantity);
        assertEquals(1, exactQuantity.length);
        assertEquals(products[2],exactQuantity[0]);

        Product[] zeroQuantity = storage.findProductsByQuantity(0, 0);
        assertNotNull(zeroQuantity);
        assertEquals(0, zeroQuantity.length);


        Product [] allProducts = storage.findProductsByQuantity(0, 1000);// все продукты
        assertNotNull(allProducts);
        assertEquals(products.length, allProducts.length);


    }

    private void printProducts(Product[] products) {
        System.out.println("__________Products fount: "+ products.length+ "______________");
        for (Product product : products){
            System.out.println(product.toString());
            System.out.println("-------------");
        }
        System.out.println("============================\n");

    }


}
