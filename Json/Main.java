package pharmacy.Json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class Main {
    private static final Logger logger = LogManager.getLogger(String.valueOf(Customer.class));

    public static void main(String[] args) throws IOException {
        try {

            ObjectMapper objectMapper = new ObjectMapper();

            Customer customer = objectMapper.readValue(new File("C:\\Users\\balaj\\IdeaProjects\\SolvdIntern\\src\\main\\java\\pharmacy\\Json\\customer.json"), Customer.class);
            logger.info(customer);
            for (PrescriptionItem prescriptionItem : customer.getPrescription_items()) {
                logger.info("Customer Prescription details: ");
                logger.info("Item id: " + prescriptionItem.getItemId());
                logger.info("Product details:");
                logger.info("Product Id: " + prescriptionItem.getProduct().getProductId());
                logger.info("Product Name: " +prescriptionItem.getProduct().getName());
                logger.info("Quantity: " +prescriptionItem.getQuantity());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



