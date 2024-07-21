package ag.bookst.manager.client;

import ag.bookst.manager.entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;


public interface ProductsRestClient {

    List<Product> findAllProducts();

    Product createProduct(String title, String details);

    Optional<Product> findProduct(int productId);

    void updateProduct(int productId, String title, String details);

    void deleteProduct(int productId);
}
