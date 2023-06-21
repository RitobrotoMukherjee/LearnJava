import java.util.Scanner;

class AlphabetPatterns {
    public static void main(String[] args) {
        /*
         * 
         * A
         * A B
         * A B C
         * A B C D
         * 
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Height of pyramind: ");

        int height = sc.nextInt();

        if(height > 0 && height <= 26) {
            printPyramid(height);
        }
        return;
    }

    private static void printPyramid(int height) {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < i+1; j++) {
                char c = 'A';
                System.out.print((char)(c + j) + " ");
            }
            System.out.println();
        }
    }
}