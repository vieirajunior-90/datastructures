package recursion;

public class MinimumSquare {

    /**
     * Given an area with a width and a length, find how many squares can be fit in the area.
     * @param length the length of the area
     * @param width the width of the area
     * @return the total number of squares that can be fit in the area
     */
    public static String calcSquares(int length, int width){
        int square = findSquare(length, width);
        int squaresInLength = length / square;
        int squaresInWidth = width / square;
        int totalOfSquares = squaresInLength * squaresInWidth;
        
        return "Square: " + square + "m² - " + "Quantity: " + totalOfSquares;
    }

    /**
     * Find the smallest square that can fit in the area.
     * @param length the length of the area
     * @param width the width of the area
     * @return the function itself if not reached the base case
     */
    private static int findSquare(int length, int width) {
        if (width == 0) {
            System.out.println();
            return length;
        }

        return findSquare(width, length % width);
    }

    public static void main(String[] args) {
        System.out.println(calcSquares(150000, 48000));
    }
}
