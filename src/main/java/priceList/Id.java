package priceList;

import java.util.Objects;

public class Id {

    private int id;
    private String name;

    Id(int id, String name) {
        try {
            //if (id < 0); //throw new NullPointerException("Id cannot be less than zero");
            //if (name.equals("") || name.equals(" ")); //throw new NullPointerException("Name cannot be empty");
            if (id >= 0 && (!name.equals("") || !name.equals(" "))) {
                this.id = id;
                this.name = name;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
