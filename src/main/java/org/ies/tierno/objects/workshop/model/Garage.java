package org.ies.tierno.objects.workshop.model;

public class Garage {
    private String name;
    private String address;
    private Vehicle[] vehicles;

    public Garage(String name, String address, Vehicle[] vehicles) {
        this.name = name;
        this.address = address;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
}
