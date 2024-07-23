package Loops;

// Main method
class returnKeyword {

    // Method 1
    // Since return type of RR method is double
    // so this method should return double value
    double RR(double a, double b) {
        double sum = 0;
        sum = (a + b) / 2.0;

        // Return statement as we already above have declared
        // return type to be double
        return sum;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Print statement
        double result = new returnKeyword().RR(5.5, 6.5);
        System.out.println(result);
    }


    /*
    Time Complexity of the above Method:
    Time Complexity: O(1)
    Auxiliary Space : O(1)
    */
}
