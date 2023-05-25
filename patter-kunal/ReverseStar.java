import java.util.Scanner;

class ReverseStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int inp = sc.nextInt();

        ReverseTriangle(inp);

    }

    private static void ReverseTriangle(int n) {
        /**
         * 
         * * * * * * *
         *  * * * * *
         *   * * * *
         *    * * *
         *     * *
         *      *
         * 
         */

        // row = 0; space = 0; col = n;
        // row = 1; space = 1; col = n - 1;
        // row = 2; space = 2; col = n - 2;
        
        for(int rows = 0; rows < n; rows++) {
            int spaceInCol = rows;
            int starInCol = n - spaceInCol;

            for(int space = 0; space < spaceInCol; space++) {
                System.out.print(' ');
            }

            for(int col = 0; col < starInCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}