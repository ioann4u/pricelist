import static org.junit.jupiter.api.Assertions.*;
import priceList.*;

import org.junit.jupiter.api.Test;

//@RunWith(value = Price.class)

class PriceListTest {

    //incorrect values
    //private Id incorrectId = new Id(-1, "Oranges");
    //private Id incorrectName = new Id(0, "");
    //private Price incorrectRubles = new Price(-150, 50);
    //private Price incorrectPenny = new Price(150, -10);
   // private Price incorrectPrice = new Price(0, 0);

    //correct values
    private Id firstId = new Id(0, "Apples");
    private Id secondId = new Id(1, "Bananas");
    private Id anotherId = new Id(0, "Oranges");

    private Price firstPrice = new Price(150, 50);
    private Price secondPrice = new Price(200, 0);

    private String name = "Oranges";

    @Test
    void add() {
        PriceList actualInfo = new PriceList();
        actualInfo.add(firstId, firstPrice);
        actualInfo.add(secondId, secondPrice);
        PriceList expectedInfo = new PriceList();
        expectedInfo.getPriceList().put(firstId, firstPrice);
        expectedInfo.getPriceList().put(secondId, secondPrice);
        assertEquals(actualInfo, expectedInfo);
        System.out.println(actualInfo.toString());

        //Assertions.assertThrows();
    }

    @Test
    void dell() {
        PriceList actualInfo = new PriceList();
        actualInfo.add(firstId, firstPrice);
        actualInfo.add(secondId, secondPrice);
        actualInfo.del(firstId);
        PriceList expectedInfo = new PriceList();
        expectedInfo.getPriceList().put(secondId, secondPrice);
        assertEquals(actualInfo, expectedInfo);
        System.out.println(actualInfo.toString());

        //Assertions.assertThrows();
    }

    @Test
    void changePrice() {
        PriceList actualInfo = new PriceList();
        actualInfo.add(firstId, firstPrice);
        actualInfo.add(secondId, secondPrice);
        actualInfo.changePrice(firstId, secondPrice);
        PriceList expectedInfo = new PriceList();
        expectedInfo.getPriceList().put(firstId, secondPrice);
        expectedInfo.getPriceList().put(secondId, secondPrice);
        assertEquals(actualInfo, expectedInfo);
        System.out.println(actualInfo.toString());

        //Assertions.assertThrows();
    }


    @Test
    void changeName() {
        //correct inputs
        PriceList actualInfo = new PriceList();
        actualInfo.add(firstId, firstPrice);
        actualInfo.add(secondId, secondPrice);
        actualInfo.changeName(firstId, firstPrice, name);
        PriceList expectedInfo = new PriceList();
        expectedInfo.getPriceList().put(anotherId, firstPrice);
        expectedInfo.getPriceList().put(secondId, secondPrice);
        assertEquals(expectedInfo, actualInfo);
        System.out.println(actualInfo.toString());

        //incorrect inputs
        //Assertions.assertThrows(IllegalArgumentException.class, () ->
        //        actualInfo.changeName(incorrectId, firstPrice, name));
        //System.out.print(actualInfo.toString() + System.lineSeparator());
        //Assertions.assertThrows(IllegalArgumentException.class, () ->
        //        actualInfo.changeName(incorrectName, firstPrice, name));
        //Assertions.assertThrows(IllegalArgumentException.class, () ->
        //      actualInfo.changeName(anotherId, incorrectRubles, name));
        //Assertions.assertThrows(IllegalArgumentException.class, () ->
        //        actualInfo.changeName(firstId, incorrectPenny, name));
        //Assertions.assertThrows(IllegalArgumentException.class, () ->
        //        actualInfo.changeName(firstId, incorrectPrice, name));
    }


    @Test
    void sum() {
        PriceList information = new PriceList();
        information.add(firstId, firstPrice);
        information.add(secondId, secondPrice);

       // Sum sum = new Sum();
        information.sum(firstId, 2);
        information.sum(secondId, 2);

        assertEquals(701.0, information.getSum());
        System.out.print(information.getSum());
        information.clearSum();
    }


}