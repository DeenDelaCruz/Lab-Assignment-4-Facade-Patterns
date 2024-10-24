public class FrontDesk {

    public void requestValetService(String plateNumber) {

        Valet valet = new Valet(plateNumber);
        valet.doThis();
    }

    public void requestHouseKeepingService(int roomNumber) {

        HouseKeeping housekeep = new HouseKeeping(roomNumber);
        housekeep.doThis();
    }

    public void requestCartService(int numberOfCarts) {

        Cart cart = new Cart(numberOfCarts);
        cart.doThis();
    }
}