package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;

public class LabInterview {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println(a1);
        Collections.sort(a1,Collections.reverseOrder());

        for (Integer o: a1){
            System.out.println(6*o);
        }
        // 1,2,3,4 -> 24,18,12,6
    }
}
