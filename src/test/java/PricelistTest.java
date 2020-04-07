import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

 /**   @Test
    void changeName() {
        Pricelist information = new Pricelist();
        information.add(firstId, firstData);
        information.add(secondId, secondData);
        information.changeName(secondId, secondData, firstData);
        assertEquals("0: Apples - 150 руб. 50 коп.\n" + "1: Apples - 200 руб. 0 коп.\n", information.toString());

        //Assertions.assertThrows();
    }



 @Test void sum() {
 Pricelist information = new Pricelist();
 information.add(firstId, firstData);
 information.add(secondId, secondData);
 information.sum(firstId, firstData)
 }
 */

}