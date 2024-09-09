package package1;
import package2.*;

public class A {

    //protected String protectedMessage = "This is a protected message";

    /*public static void main(String[] args) {
        C c = new C();
        //System.out.println(c.defaultMessage);    This wont be able to acess because anything with the default modiferyer will only be able to be acessed within it's own package
        System.out.println(c.publicMessage); //because it has the public it's able to be acessed across packages

    }*/

    public static void main(String[] args) {
        B b = new B();
        //System.out.println(b.privateMessage);    If you try to do this you wont be able to get it
    }

}
