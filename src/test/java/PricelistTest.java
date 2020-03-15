import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PricelistTest {

    Id firstId = new Id(0, "Apples");
    Id secondId = new Id(1, "Bananas");

    Data firstData = new Data( 150, 50);
    Data secondData = new Data( 200, 00);

    @Test
    void add() {
        Pricelist information = new Pricelist();
        information.add(firstId, firstData);
        information.add(secondId, secondData);
        assertEquals("0: Apples - 150 руб. 50 коп.\n" + "1: Bananas - 200 руб. 0 коп.\n", information.toString());
    }

    @Test
    void dell() {

    }
}