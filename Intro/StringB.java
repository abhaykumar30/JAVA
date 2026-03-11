package Intro;
class StringB{
    public static void main(String a[]){

        //String Buffer
        StringBuffer str = new StringBuffer("Abhay");

        System.out.println(str);
        str.append(" Rajpoot");
        System.out.println(str);

        //String Builder
        StringBuilder s = new StringBuilder("Rajpoot");
        System.out.println(s);
        
        s.append(" Abhay");
        System.out.println(s);
    }
}