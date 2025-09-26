import java.util.ArrayList;
public class Addressbook {

    ArrayList<Buddyinfo> myList = new ArrayList<>();
    public void addBuddy(Buddyinfo buddyinfo) {
        myList.add(buddyinfo);
    }

    public void removeBuddy(Buddyinfo buddyinfo) {
        myList.remove(buddyinfo);
    }
    public void clearBuddy() {
        myList.clear();
    }
    public static void main(String[] args) {
        Buddyinfo buddy = new  Buddyinfo("Samuel", "Cambridge", "100");
        Addressbook addressBook = new Addressbook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        addressBook.clearBuddy();
    }
}
