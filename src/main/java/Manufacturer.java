public class Manufacturer implements Runnable {

    private CarShowroom carShowroom;
    private int manufactureTime = 5000;

    public Manufacturer(CarShowroom carShowroom) {
        this.carShowroom = carShowroom;
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            try {
                Thread.sleep(manufactureTime);
                carShowroom.acceptCar();
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
