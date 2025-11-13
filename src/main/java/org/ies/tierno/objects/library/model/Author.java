package org.ies.tierno.objects.library.model;

import java.util.Objects;

public class Author {
    private String nif;
    private String name;
    private String surnames;

    public Author(String nif, String name, String surnames) {
        this.nif = nif;
        this.name = name;
        this.surnames = surnames;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nif, author.nif) && Objects.equals(name, author.name) && Objects.equals(surnames, author.surnames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surnames);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                '}';
    }
}
