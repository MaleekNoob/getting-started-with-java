package Lab3;
import java.util.LinkedList;
import java.util.Scanner;


public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");
        linkedList.add("five");

        int start = 0;
        System.out.println("Enter the start position: ");
        Scanner input = new Scanner(System.in);
        start = input.nextInt();

        for (int i = start; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
