package Basic.OOP;

public class Static {
    public static void main(String[] args) {
        // static - is a modifiery.
        //        - A single copy of a variable/method os created and shared.
        //        - The class "owns" that static memeber
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");

        // We dont need to create a friend object to access the numberOfFriends 
        // bc thorugh the clas itself its available
        System.out.println(Friend.numberOfFriends);

        // We can asscess from an object but not recommended 
        // System.out.println(friend1.numberOfFriends);

        Friend.displayFriends();

        Friend friend3 = new Friend("Squid");
        Friend.displayFriends();
        System.out.println("names: " + "\n" + friend1.name + friend2.name + "\n" + friend3.name);

    }
}