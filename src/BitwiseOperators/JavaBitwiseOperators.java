package BitwiseOperators;

public class JavaBitwiseOperators {
    public static void main(String[] args) {
        int p =9, q = 10;

        //  |  Bitwise OR
        System.out.println(p | q);  //11

        //  &  Bitwise AND
        System.out.println(p & q);  //8

        //  ^  Bitwise exclusive OR
        System.out.println(p ^ q);  //3

        //  ~ Bitwise Complement
        System.out.println(~p);     //-10
        System.out.println(~q);     //-11

        //  << Left Shift               //a<<b = a*(2^b)
        System.out.println(p << 1); //18
        System.out.println(q << 2); //40

        //  >> Right Shift              //a<<b = a/(2^b)
        System.out.println(p >> 1); //4
        System.out.println(q >> 2); //2
    }
}
