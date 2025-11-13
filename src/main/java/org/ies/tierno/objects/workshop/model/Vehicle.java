package org.ies.tierno.objects.workshop.model;

public class Vehicle {
    private String type;
    private int maxSpeed;
    private String color;
    private String licensePlate;

    public Vehicle(String type, int maxSpeed, String color, String licensePlate) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.licensePlate = licensePlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


}
