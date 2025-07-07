package ex_26_Collection_Framework.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LabLinkedAsQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        Iterator<Integer> itr = queue.iterator();
        while (itr.hasNext()){
            Integer value = itr.next();
            System.out.println(value);
        }
    }
}
