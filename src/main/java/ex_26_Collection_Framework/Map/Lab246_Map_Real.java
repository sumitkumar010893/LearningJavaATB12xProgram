package ex_26_Collection_Framework.Map;

import java.util.*;

public class Lab246_Map_Real {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap<>();
        student1.put("name","Ramesh");
        student1.put("phone", 987653210);
        student1.put("address","BLR");
        student1.put("home_address","DLI");

        System.out.println(student1);

        Map<String,Object> student2 = new LinkedHashMap<>();
        student2.put("name", "Diksha");
        student2.put("phone","9876543210");
        student2.put("address", "DLI");
        student2.put("home_address","RAJ");

        System.out.println(student2);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad poor dad");
        book_read_items.add("Sapiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");
        System.out.println(book_read_items);
    }
}
