import java.util.Scanner;

class DollarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        printSquareBoxPattern(height);
    }

    private static void printSquareBoxPattern(int height) {
        /**
         *  $ $ $ $
         *  $     $
         *  $     $
         *  $ $ $ $
         */

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < height; j++) {
                if(i == 0 || i == height - 1) {
                    System.out.print("$ ");
                } else {
                    if(j == 0 || j == height - 1) {
                        System.out.print("$ ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}