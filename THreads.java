// class A extends Thread
// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println(" Hi ");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread
// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println(" Hello ");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class THreads {
    public static void main(String[] args) {
        // use of Lamda expression and Annonamus class
        Runnable obj = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println(" Hi ");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println(" Hello ");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        // obj.start();
        // obj1.start();

        t1.start();
        t2.start();
    }
}
