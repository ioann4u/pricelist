import java.util.Objects;

public class Id {

    private int id;
    private String name;

    Id(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        if (id < 0) throw new IllegalArgumentException("Id cannot be less than zero");
        return id;
    }

    public String getName() {
        if (name.equals("") || name.equals(" ")) throw new IllegalArgumentException("Name cannot be empty");
        return name;
    }

    @Override
    public String toString() {
        return id + ": " + name + " - ";
    }

    @Override
    public boolean equals(Object identity){
        if (identity == this) {
            return true;
        }
        if (identity == null || identity.getClass() != this.getClass()) {
            return false;
        }
        Id newId = (Id) identity;
        return id == newId.id  && Objects.equals(name, newId.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
