public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Eben");
        Friend friend2 = new Friend("Remi");
        Friend friend3 = new Friend("Glenny");

        //System.out.println(Friend.numberFriends); //It's always best practice to call the class the holds the friend object when trying to access static method
        //numberFriends is the statsic member that all the friends share
        //if you were to remove the static in the other class it would no longer be a static refrence
        //then you'd have to call it using friend1

        Friend.showFriends();

        //the math class is also a static class

    }
}
//static is a key word modifier, it's a single copy of a var/method is created and shared
//The class "owns" the static member