
public class AdvancedAstrology {

    

    public static void printStars(int number) {
        int counter = 0;
        for (int i = counter; i < number; i++) {
            System.out.print("*");  
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int counter = 0;
        for (int i = counter; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // for printing the rows
        for (int i = 0; i < size; i++) {
            // for printing the spaces
            for (int j = 1; j < size-i; j++) {
                System.out.print(" ");
            }
            /// for printing the stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // for looping the rows
        int num = height;
        for (int i = 0; i < height; i++) {
            // for looping the spaces
            for (int j = 1; j < height-i; j++) {
                // for printing the spaces
                System.out.print(" ");
            }
            // for looping the stars
            for (int k = 0; k <= i; k++) {
                // for printing the stars
                System.out.print("*");
            }
            // for printing the spaces and cycling to next row (println does this)
            for(int p = 0; p < i; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // ***** START OF TRUNK CODE *****
            // for printing both the height and width of trunk
        for (int i = 0; i < num-2; i++) {
            System.out.print(" ");
        }
        System.out.println("***");
        for (int i = 0; i < num-2; i++) {
            System.out.print(" ");
        }
        System.out.println("***");
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(1);;
    }
}
