
public class HotelApp {
    public static void main(String[] args) {

        FrontDesk fDesk = new FrontDesk();

        fDesk.requestValetService("ASD 1123");
        fDesk.requestHouseKeepingService(11);
        fDesk.requestCartService(5);
    }
}
