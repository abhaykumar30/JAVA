public class Switch {

    public static void main(String[] args) {
        int n = 8;

        // switch (n) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thrusday");
        //         break;
        //     case 5:
        //         System.out.println("friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Number is invalid Kindly give the valid number as input");
        //         break;


            switch(n){
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4-> System.out.println("Saturday");
                case 5 -> System.out.println("Sunday");

                default -> System.out.println("Invalid");
            }
        }
    }
