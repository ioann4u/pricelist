package priceList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//@RunWith(value = priceList.Price.class)

class PriceListTest {

    //incorrect values
    private priceList.Id incorrectId = new priceList.Id(-1, "Oranges");
    private priceList.Id incorrectName = new priceList.Id(0, "");
    private priceList.Id incorrectNamePt2 = new priceList.Id(1, "Apples");
    private priceList.Price incorrectRubles = new priceList.Price(-150, 50);
    private priceList.Price incorrectPenny = new priceList.Price(150, -10);
    private priceList.Price incorrectPrice = new priceList.Price(0, 0);

    //correct values
    private Id firstId = new Id(0, "Apples");
    private Id secondId = new Id(1, "Bananas");
    private Id anotherId = new Id(0, "Oranges");

    private Price firstPrice = new Price(150, 50);
    private Price secondPrice = new Price(200, 0);

    private String name = "Oranges";

    @Test
    void add() {
        boolean thrown = false;
        try {
            PriceList actualInfo = new PriceList();
            actualInfo.add(firstId, firstPrice);
            actualInfo.add(secondId, secondPrice);
            PriceList expectedInfo = new PriceList();
            expectedInfo.getPriceList().put(firstId, firstPrice);
            expectedInfo.getPriceList().put(secondId, secondPrice);
            assertEquals(actualInfo, expectedInfo);
            System.out.println(actualInfo.toString());
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertFalse(thrown);
    }


    @Test
    void exception() {
        PriceList actualInfo = new PriceList();
        actualInfo.add(this.incorrectId, this.firstPrice);
        actualInfo.add(this.incorrectName, this.firstPrice);
        actualInfo.add(this.firstId, this.incorrectRubles);
        actualInfo.add(this.firstId, this.incorrectPenny);
        actualInfo.add(this.firstId, this.incorrectPrice);
        actualInfo.add(this.incorrectNamePt2, this.firstPrice);
    }




    @Test
    void dell() {
        boolean thrown = false;
        try {
            PriceList actualInfo = new PriceList();
            actualInfo.add(firstId, firstPrice);
            actualInfo.add(secondId, secondPrice);
            actualInfo.del(firstId);
            PriceList expectedInfo = new PriceList();
            expectedInfo.getPriceList().put(secondId, secondPrice);
            assertEquals(actualInfo, expectedInfo);
            System.out.println(actualInfo.toString());

        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertFalse(thrown);
    }

    @Test
    void changePrice() {
        boolean thrown = false;
        try {
            PriceList actualInfo = new PriceList();
            actualInfo.add(firstId, firstPrice);
            actualInfo.add(secondId, secondPrice);
            actualInfo.changePrice(firstId, secondPrice);
            PriceList expectedInfo = new PriceList();
            expectedInfo.getPriceList().put(firstId, secondPrice);
            expectedInfo.getPriceList().put(secondId, secondPrice);
            assertEquals(actualInfo, expectedInfo);
            System.out.println(actualInfo.toString());

        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertFalse(thrown);
    }


    @Test
    void changeName() {
        //correct inputs
        boolean thrown = false;
        try {
            PriceList actualInfo = new PriceList();
            actualInfo.add(firstId, firstPrice);
            actualInfo.add(secondId, secondPrice);
            actualInfo.changeName(firstId, firstPrice, name);
            PriceList expectedInfo = new PriceList();
            expectedInfo.getPriceList().put(anotherId, firstPrice);
            expectedInfo.getPriceList().put(secondId, secondPrice);
            assertEquals(expectedInfo, actualInfo);
            System.out.println(actualInfo.toString());

        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertFalse(thrown);
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
        boolean thrown = false;
        try {
            PriceList information = new PriceList();
            information.add(firstId, firstPrice);
            information.add(secondId, secondPrice);

            // Sum sum = new Sum();
            information.sum(firstId, 2);
            information.sum(secondId, 2);

            assertEquals(701.0, information.getSum());
            System.out.print(information.getSum());
            information.clearSum();

        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertFalse(thrown);
    }


}