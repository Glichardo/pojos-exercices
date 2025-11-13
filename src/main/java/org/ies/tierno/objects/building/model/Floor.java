package org.ies.tierno.objects.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Floor {
    private int story;
    private String door;
    private Owner[] owners;

    public Floor(int story, String door, Owner[] owners) {
        this.story = story;
        this.door = door;
        this.owners = owners;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Floor floor = (Floor) o;
        return story == floor.story && Objects.equals(door, floor.door) && Objects.deepEquals(owners, floor.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(story, door, Arrays.hashCode(owners));
    }

    @Override
    public String toString() {
        return "Floor{" +
                "story=" + story +
                ", door='" + door + '\'' +
                ", owners=" + Arrays.toString(owners) +
                '}';
    }
}
