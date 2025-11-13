package org.ies.tierno.objects.highschool.model;

import java.util.Arrays;
import java.util.Objects;

public class Highschool {
    private String name;
    private Student[] studens;

    public Highschool(String name, Student[] studens) {
        this.name = name;
        this.studens = studens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudens() {
        return studens;
    }

    public void setStudens(Student[] studens) {
        this.studens = studens;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Highschool that = (Highschool) o;
        return Objects.equals(name, that.name) && Objects.deepEquals(studens, that.studens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(studens));
    }

    @Override
    public String toString() {
        return "Highschool{" +
                "name='" + name + '\'' +
                ", studens=" + Arrays.toString(studens) +
                '}';
    }
}
