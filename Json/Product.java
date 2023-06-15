package pharmacy.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Product {
    @JsonProperty("product_id")
    private int productId;
    private String name;

    public Product() {}

    public Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    // getters and setters

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                '}';
    }
}



