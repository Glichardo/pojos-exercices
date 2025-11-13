package org.ies.tierno.objects.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String address;
    private String town;
    private Floor[] floors;

    public Building(String address, String town, Floor[] floors) {
        this.address = address;
        this.town = town;
        this.floors = floors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(town, building.town) && Objects.deepEquals(floors, building.floors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, town, Arrays.hashCode(floors));
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", town='" + town + '\'' +
                ", floors=" + Arrays.toString(floors) +
                '}';
    }
}
