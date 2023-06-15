package pharmacy.Json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrescriptionItem {
       @JsonProperty("item_id")
        private int itemId;
        private Product product;
        private int quantity;

        public PrescriptionItem() {}

    public PrescriptionItem(int itemId, Product product, int quantity) {
        this.itemId = itemId;
        this.product = product;
        this.quantity = quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "PrescriptionItem{" +
                "itemId=" + itemId +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}


