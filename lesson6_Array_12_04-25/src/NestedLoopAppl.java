public class NestedLoopAppl {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Pitagoras();
        System.out.println("Task 2");
        figure(5);
        System.out.println();
        System.out.println("Task 3");
        figure2(5);
        System.out.println();
        System.out.println("Task 4");
        figure3(5);
        System.out.println();
        System.out.println("Task 5");
        figure4(5);
        System.out.println("Task 6");
        figure5(5);



    }


    private static void figure5(int n) {
        for (int i = 1; i <= n; i++){
            for ( int j = 1; j <= n; j++){
                if (i >= n-j+1 && i >=j){
                    System.out.print("*" + "\t");
                } else{
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }


    private static void figure4(int n) {
        for (int i = 1; i <= n; i++){
            for ( int j = 1; j <= n; j++){
                if (i <= n-j+1 && i <=j){
                    System.out.print("*" + "\t");
                } else{
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }


    private static void figure3(int n) {
        for (int i = 1; i <= n; i++){
            for ( int j = 1; j <= n; j++){
                if (i >= j){
                    System.out.print("*" + "\t");
                } else{
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }


    private static void figure2 (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n - j + 1) {
                    System.out.print("*" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }


    private static void figure(int n) {
        for (int i = 1; i <= n; i ++){
            for (int j = 1; j<= n;  j ++){
                System.out.print("*"+ "\t");
            }
            System.out.println();
        }
    }


    private static void Pitagoras() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
