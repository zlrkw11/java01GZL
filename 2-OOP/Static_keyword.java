public class Static_keyword {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Nate");

        Friend friend2 = new Friend("Andy");

        Friend friend3 = new Friend("Gavin");

        Friend friend4 = new Friend("Sunny");
        
        System.out.println(Friend.numberOfFriends);
    }
}
