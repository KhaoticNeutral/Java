public class Main {
    public static void main(String[] args) {

        int x = add(1,2, 3);
                System.out.println(x);

    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method 1");
        return a + b;
    }

    static int add (int a, int b, int c){
        System.out.println("This is overloaded method 2");
        return a + b + c;
    }

    static int add (int a, int b, int c, int d){
        System.out.println("This is overloaded method 3");
        return a + b + c + d;
    }
}
//Are methods that share the same name but have diffrent paremeters
//they can share the same name but need diffrent paremeters to be diffrent
//you'll notice that even when you have the same amount of paremters it's still not happy, you can fix this by adding more paremeters or changing the name
//but changing the name defeats the purpose of over-loaded methods
//we can also use over-loaded methods with doubles for example but this will allow you to add more arguments remeber when we were talking about size