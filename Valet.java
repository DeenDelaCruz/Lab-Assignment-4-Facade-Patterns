public class Valet implements HotelService {
    
    private String plateNumber;

    public Valet(String plateNumber) {

        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle() {
        
        System.out.println("Plate of vehicle to be picked up: " + plateNumber);
    }

    @Override
    public void doThis() {

        pickUpVehicle();
    }
}