public class Friend {

    String name;
    static int numberFriends;

    Friend(String name) {
        this.name = name;
        numberFriends++;
    }

    static void showFriends() {
        System.out.println("you have "+numberFriends+ " friends");
    }
        //this static method with return the number of friends you have
}
