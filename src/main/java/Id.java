import java.util.Objects;

public class Id {

    public int id;

    public Id(int id) {
        this.id = id;
        if (id < 0) return;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ": ";
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
        return id == newId.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
