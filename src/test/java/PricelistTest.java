import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class PricelistTest {

    private Id firstId = new Id(0, "Apples");
    private Id secondId = new Id(1, "Bananas");

    private Data firstData = new Data(150, 50);
    private Data secondData = new Data(200, 00);

    @Test
    void add() {
        Pricelist actualInfo = new Pricelist();
        actualInfo.add(firstId, firstData);
        actualInfo.add(secondId, secondData);
        Pricelist expectedInfo = new Pricelist();
        expectedInfo.getPriceList().put(firstId, firstData);
        expectedInfo.getPriceList().put(secondId, secondData);
        assertEquals(actualInfo, expectedInfo);
        System.out.println(actualInfo.toString());

        //Assertions.assertThrows();
    }

    @Test
    void dell() {
        Pricelist actualInfo = new Pricelist();
        actualInfo.add(firstId, firstData);
        actualInfo.add(secondId, secondData);
        actualInfo.del(firstId);
        Pricelist expectedInfo = new Pricelist();
        expectedInfo.getPriceList().put(secondId, secondData);
        assertEquals(actualInfo, expectedInfo);
        System.out.println(actualInfo.toString());

        //Assertions.assertThrows();
    }

    @Test
    void changePrice() {
        Pricelist actualInfo = new Pricelist();
        actualInfo.add(firstId, firstData);
        actualInfo.add(secondId, secondData);
        actualInfo.changePrice(firstId, secondData);
        Pricelist expectedInfo = new Pricelist();
        expectedInfo.getPriceList().put(firstId, secondData);
        expectedInfo.getPriceList().put(secondId, secondData);
        assertEquals(actualInfo, expectedInfo);
        System.out.println(actualInfo.toString());

        //Assertions.assertThrows();
    }

    ///**
    @Test
    void changeName() {
        Pricelist actualInfo = new Pricelist();
        actualInfo.add(firstId, firstData);
        actualInfo.add(secondId, secondData);
        actualInfo.changeName(firstId, secondData);
        Pricelist expectedInfo = new Pricelist();
        expectedInfo.getPriceList().put(firstId, firstData);
        expectedInfo.getPriceList().put(firstId, secondData);
        assertEquals(expectedInfo, actualInfo);
        System.out.println(actualInfo.toString());

        //Assertions.assertThrows();
    }
    // */

    @Test
    void sum() {
        Map<Integer, Integer> actual = new HashMap<>();
        Pricelist information = new Pricelist();
        information.add(firstId, firstData);
        information.add(secondId, secondData);
        actual.put(0, 1);
        actual.put(1, 2);

        assertEquals("350,50", information.sum(actual));
        System.out.print(true);
    }


}