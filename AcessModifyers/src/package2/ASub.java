package package2;
import package1.*;

public class ASub extends A {

    public static void main(String[] args) {
        //C c = new C();
        //System.out.println(c.defaultMessage); //see that when we run it in the same package it's able to acess it

        ASub a = new ASub();
        System.out.println(a.protectedMessage);
    }

}
