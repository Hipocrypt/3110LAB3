public class Buddyinfo {
    private String name;
    private String address;
    private String phone;

    public String getName() {return name;}
    public String getAddress() { return address;}
    public String getPhone() { return phone;}

    public Buddyinfo(){
        this("unknown", "unknown", "unknown");
    }
    public Buddyinfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

    }


    public static void main(String[] args) {
        Buddyinfo req = new Buddyinfo("", "unknown", "unknown");
        System.out.println("Hello, "+ req.getName()) ;

    }

}
