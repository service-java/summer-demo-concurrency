package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test27 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Object[] objectArray = list.toArray();

        for (int i = 0; i < objectArray.length; i++) {
            System.out
                    .println(Integer.parseInt(objectArray[i].toString()) + 100);
        }
    }
}
