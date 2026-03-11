import java.util.*;

public class Maps {
    public static void main(String[] args) {
        System.out.print("HashMap : ");

        Map<String, Integer> student = new HashMap<>();
        student.put("Abhay", 95);
        student.put("Amit", 59);
        student.put("Manish", 78);
        student.put("Vikas", 69);
        student.put("Sameer", 24);

        System.out.println(student);

        student.remove("Abhay");
        System.out.println(student);
    }
}
