package JavaMethods;

class Algebra{
    int a ;
    int b ;
    Algebra(int x , int y){
        System.out.println("Constructor Algebra is called");
        a = x;
        b = y;
    }

    int sum(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}

public class ConstructorMain {
    public static void main(String[] args) {
        Algebra obj1 = new Algebra(12,34);
        System.out.println(obj1.sum());
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());

        Algebra obj2 = new Algebra(4,7);
        System.out.println(obj2.sum());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());

    }
}
