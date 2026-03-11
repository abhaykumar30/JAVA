interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Run, code, Complete");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Run, code, Complete, faster!");
    }
}

class Developer {
    void code(Computer lap) {
        lap.code();
    }
}

public class Dev {
    public static void main(String a[]) {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();

        Developer dev = new Developer();
        dev.code(desk);
        dev.code(lap);
    }
}