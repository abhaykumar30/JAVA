package Array;
public class Array {
    public static void main(String a[]){

        // // Method 1
        // int[] arr = {6,7,8,9};
        // System.out.println("Sout " + arr[3]);

        // for(int i = 0; i < arr.length; ++i){
        //     System.out.println(arr[i]);
        // }


        // //Method 2
        // int[] num = new int[5];
        // num[0] = 3;
        // num[1] = 4;
        // num[2] = 5;

        // for(int j = 0; j < num.length; ++j){
        //     System.out.println(num[j]);
        // }


        //Multi-Dimensional Array
        int[][] ar = new int[3][4];

        for(int i=0; i<3; i++){
            for(int j = 0; j < 4; j++){
                ar[i][j] = (int)(Math.random()*10);
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
