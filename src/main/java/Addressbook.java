import java.util.ArrayList;
public class Addressbook {

    ArrayList<Buddyinfo> myList = new ArrayList<>();
    public void addBuddy(Buddyinfo buddyinfo) {
        myList.add(buddyinfo);
    }

    public void removeBuddy(Buddyinfo buddyinfo) {
        myList.remove(buddyinfo);
    }

    public static void main(String[] args) {
        Buddyinfo buddy = new  Buddyinfo("Samuel", "UOttawa", "100");
        Addressbook addressBook = new Addressbook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}