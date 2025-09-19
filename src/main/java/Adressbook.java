import java.util.ArrayList;
public class Addressbook {

    ArrayList<> myList = new ArrayList<>();
    public void addBuddy(BuddyInfo buddyinfo) {
        myList.add(buddyinfo);
    }

    public void removeBuddy(BuddyInfo buddyinfo) {
        myList.remove(buddyinfo);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new  BuddyInfo("Daniel Esenwa", "Carleton", "99");
        Addressbook addressBook = new Addressbook();
        addressbook.addBuddy(buddy);
        addressbook.removeBuddy(buddy);
    }
}