package model;

public class Contrevenant {
    private String name;
    private String address;
    private String driverLicenseNumber;

    public Contrevenant(String name, String address, String driverLicenseNumber) {
        this.name = name;
        this.address = address;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getDriverLicenseNumber() { return driverLicenseNumber; }
    public void setDriverLicenseNumber(String driverLicenseNumber) { this.driverLicenseNumber = driverLicenseNumber; }

    @Override
    public String toString() {
        return "Contrevenant: " + name + ", License: " + driverLicenseNumber;
    }
}
