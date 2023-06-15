package pharmacy.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Doctor {
    @JsonProperty("doctor_id")
    private int doctorId;
    private String name;

    public Doctor() {}

    public Doctor(int doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
    }

    // getters and setters
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", name='" + name + '\'' +
                '}';
    }
}

