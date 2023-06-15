package pharmacy.Json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Customer {
    @JsonProperty("customer_id")
    private int customerId;
    private String name;
    private Address address;
    private Doctor doctor;
    private List<PrescriptionItem> prescription_items;

    public Customer() {}

    public Customer(int customerId, String name, Address address, Doctor doctor, List<PrescriptionItem> prescription_items) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.doctor = doctor;
        this.prescription_items = prescription_items;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public List<PrescriptionItem> getPrescription_items() {
        return prescription_items;
    }

    public void setPrescription_items(List<PrescriptionItem> prescription_items) {
        this.prescription_items = prescription_items;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", doctor=" + doctor +
                ", prescription_items=" + prescription_items +
                '}';
    }
}





