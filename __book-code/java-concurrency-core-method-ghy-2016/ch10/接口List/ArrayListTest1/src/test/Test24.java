package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test24 {

    public static void main(String[] args) {
        ArrayList deleteList = new ArrayList();
        deleteList.add("a");
        deleteList.add("b");
        deleteList.add("z");

        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        // ڴ collection бָ collection Ԫ
        list.retainAll(deleteList);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
