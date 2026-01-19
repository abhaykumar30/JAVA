class Human {
    private int age;
    private String name;

    // Default Constructor
    public Human() {
        age = 18;
        name = "Akhil";
    }

    // Parameterized Constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // getter and setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // This keyword
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class GetSet {
    public static void main(String a[]) {
        Human obj = new Human();
        Human obj1 = new Human(16, "rajpoot");
        obj.setAge(20);
        obj.setName("Abhay");

        System.out.println(obj.getAge() + ":" + obj.getName());
        System.out.println(obj1.getAge() + ":" + obj1.getName());

    }
}
