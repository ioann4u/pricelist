import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class PricelistTest {

    Id incorrectId = new Id(-1, "Oranges");

    private Id firstId = new Id(0, "Apples");
    private Id secondId = new Id(1, "Bananas");
    private Id anotherId = new Id(0, "Oranges");

    private Price firstPrice = new Price(150, 50);
    private Price secondPrice = new Price(200, 00);

    String name = "Oranges";

    @Test
    void add() {
        Pricelist actualInfo = new Pricelist();
        actualInfo.add(firstId, firstPrice);
        actualInfo.add(secondId, secondPrice);
        Pricelist expectedInfo = new Pricelist();
        expectedInfo.getPriceList().put(firstId, firstPrice);
        expectedInfo.getPriceList().put(secondId, secondPrice);
        assertEquals(actualInfo, expectedInfo);
        System.out.println(actualInfo.toString());

        //Assertions.assertThrows();
    }

    @Test
    void dell() {
        Pricelist actualInfo = new Pricelist();
        actualInfo.add(firstId, firstPrice);
        actualInfo.add(secondId, secondPrice);
        actualInfo.del(firstId);
        Pricelist expectedInfo = new Pricelist();
        expectedInfo.getPriceList().put(secondId, secondPrice);
        assertEquals(actualInfo, expectedInfo);
        System.out.println(actualInfo.toString());

        //Assertions.assertThrows();
    }

    @Test
    void changePrice() {
        Pricelist actualInfo = new Pricelist();
        actualInfo.add(firstId, firstPrice);
        actualInfo.add(secondId, secondPrice);
        actualInfo.changePrice(firstId, secondPrice);
        Pricelist expectedInfo = new Pricelist();
        expectedInfo.getPriceList().put(firstId, secondPrice);
        expectedInfo.getPriceList().put(secondId, secondPrice);
        assertEquals(actualInfo, expectedInfo);
        System.out.println(actualInfo.toString());

        //Assertions.assertThrows();
    }


    @Test
    void changeName() {
        Pricelist actualInfo = new Pricelist();
        actualInfo.add(firstId, firstPrice);
        actualInfo.add(secondId, secondPrice);
        actualInfo.changeName(firstId, firstPrice, name);
        Pricelist expectedInfo = new Pricelist();
        expectedInfo.getPriceList().put(anotherId, firstPrice);
        expectedInfo.getPriceList().put(secondId, secondPrice);
        assertEquals(expectedInfo, actualInfo);
        System.out.println(actualInfo.toString());

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                actualInfo.changeName(incorrectId, firstPrice, name));
        //System.out.print(actualInfo.toString() + System.lineSeparator());
    }



    @Test
    void sum() {
        HashMap<Integer, Integer> actual = new HashMap<>();
        Pricelist information = new Pricelist();
        information.add(firstId, firstPrice);
        information.add(secondId, secondPrice);

        Sum sum = new Sum();
        information.sum(firstId,2, sum);
        information.sum(secondId,2, sum);

        assertEquals(701.0, sum.getSum());
        System.out.print(sum.getSum());
        sum.clear();
    }


}