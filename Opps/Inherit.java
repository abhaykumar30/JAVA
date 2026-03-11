class cal{
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}

class Adcal extends cal{
    public int multi(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int per(int a, int b){
        return a % b;
    }
}

public class Inherit {
    public static void main(String[] args) {
        Adcal obj = new Adcal();

       int r1 = obj.add(7,5);
       int r2 = obj.sub(7,5);
       int r3 = obj.multi(7,5);
       int r4 = obj.div(15,5);
       int r5 = obj.per(7,5);

       System.out.println(r1 + ":" + r2 + ":" + r3 + ":" +r4 + ":" + r5);

    }
}
