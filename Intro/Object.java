package Intro;
class calculator{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
    public int sub(int n1, int n2){
        int p = n1 - n2;
        return p;
    }
    public int multi(int n1, int n2){
        int o = n1 * n2;
        return o;
    }
    public int devide(int n1, int n2){
        int i = n1 / n2;
        return i;
    }
}

public class Object {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        calculator cal = new calculator();
        
        int rAdd = cal.add(num1, num2);
        int rSub = cal.sub(num1, num2);
        int rMulti = cal.multi(num1, num2);
        int rDe = cal.devide(num1, num2);
       
        System.out.println("Addition: " + rAdd);
        System.out.println("Substraction: " + rSub);
        System.out.println("Multiplication: " + rMulti);
        System.out.println("Devide: " + rDe);
    }
}
