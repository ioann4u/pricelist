import java.util.Objects;

public class Id {

    public int id;
    private String name;

    public Id(int id, String name) {
        this.id = id;
        this.name = name;
        if (id < 0) return;
    }

    public int getId() {
        return id;
    }

    public String getName() {
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
