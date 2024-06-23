package AulasDoYoutube.broCode.oop.part12_staticKeyword;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Sponegbob");
        Friend friend2 = new Friend("bob");
        Friend friend3 = new Friend("Patrick");

        Friend.displayFriends();
    }
}
