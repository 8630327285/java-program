package Function;

public class Hallow_rectangles {
    public static void hollow_rectangles(int totRows, int totColoumns) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totColoumns; j++) {
                if (i == 1 || i == totRows || j ==1 || j == totColoumns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangles(10, 20);
    }
}


