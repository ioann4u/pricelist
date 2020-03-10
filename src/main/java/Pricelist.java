import java.util.HashMap;


public class Pricelist {
    private static HashMap<Id, Data> priceCurrent = new HashMap<Id, Data>();

    //add - добавляет запись по заданным id и продуктам
    private static void add(Id identify, Data data) {
        priceCurrent.put(identify, data);
    }

    //del - удаляет записи по id
    private static void del(Id identify) {
        priceCurrent.remove(identify);
    }


    public static void change(Id identify, Data newData){
        priceCurrent.replace(identify,newData);
    }


    public static String find(Id identify) {
        Data result = priceCurrent.get(identify);
        if (result == null) return "Такого продукта нет";
        return result.toString();
    }

}
