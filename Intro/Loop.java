package Intro;
public class Loop {
    public static void main(String a[]){
        
        //While Loop
        int i = 1;
        while(i<=5){
            System.out.println(i + " Hi");
            i++;
        }
        System.out.println(i + " Bye While");


        // For Loop;
        for(int k = 1; k <= 10; k++){
            System.out.println(k*2);
        }


        //Do-while
        System.out.println("Do-While Loop");
        int j = 1;
        do{
            System.out.println(j*3);
            j++;
        }while(j < 10);

    }
}
