package priceList;

import java.util.Objects;

public class Id {

    private int id;
    private String name;

    Id(int id, String name) {
        if (id < 0) throw new IllegalArgumentException("Id cannot be less than zero");
        if (name.equals("") || name.equals(" ")) throw new IllegalArgumentException("Name cannot be empty");

        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + ": " + name + " - ";
    }

    @Override
    public boolean equals(Object identity) {
        if (identity == this) {
            return true;
        }
        if (identity == null || identity.getClass() != this.getClass()) {
            return false;
        }
        Id newId = (Id) identity;
        return id == newId.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
