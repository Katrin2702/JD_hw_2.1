public class Main {

    public static void main(String[] args) {
        final CarShowroom carShowroom = new CarShowroom();
        Consumer consumer = new Consumer(carShowroom);
        Manufacturer manufacturer = new Manufacturer(carShowroom);
        new Thread(manufacturer).start();

        for (int i = 1; i < 4; i++) {
            new Thread(consumer, "Покупатель " + i).start();
        }
    }

}
