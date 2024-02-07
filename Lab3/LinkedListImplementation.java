package Lab3;

// package Question1;

import java.util.LinkedList;

public class LinkedListImplementation {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("first ");
        linkedList.addFirst("second ");
        linkedList.addLast("third ");
        linkedList.addLast("fourth ");
        for (String element : linkedList) {
            System.out.print(element);
        }
    }
}
