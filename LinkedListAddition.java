import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListAddition {

    public static LinkedList addLinkedLists(LinkedList firstLL, LinkedList secondLL) {
        // First, convert linked lists in to integer values
        Iterator<Integer> firstDescendingIterator = firstLL.descendingIterator();

        int firstLLasInt = 0;
        int unit = 1;
        while (firstDescendingIterator.hasNext()) {
            firstLLasInt += unit * firstDescendingIterator.next();
            unit *= 10;
        }

        Iterator<Integer> secondDescendingIterator = secondLL.descendingIterator();

        int secondLLasInt = 0;
        // reassign unit to 1
        unit = 1;
        while (secondDescendingIterator.hasNext()) {
            secondLLasInt += unit * secondDescendingIterator.next();
            unit *= 10;
        }

        int sum = firstLLasInt + secondLLasInt;

        // Create a string from the sum
        String s = String.valueOf(sum);

        // Create a new linked list from the string
        LinkedList<Integer> summedLL = new LinkedList<Integer>();

        for (int i = 0; i < s.length(); i += 1) {
            summedLL.add(Character.getNumericValue(s.charAt(i)));
        }

        return summedLL;
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();

        ll1.add(3);
        ll1.add(2);
        ll1.add(1);

        ll2.add(6);
        ll2.add(5);
        ll2.add(4);

        System.out.println(addLinkedLists(ll1, ll2));

    }
}