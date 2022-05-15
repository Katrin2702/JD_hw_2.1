public class Seller {

    private CarShowroom carShowroom;
    private int sellTime = 1000;

    public Seller(CarShowroom carShowroom) {
        this.carShowroom = carShowroom;
    }

    public synchronized void receiveCar() {
        System.out.println("Производитель Toyota выпустил 1 авто");
        carShowroom.getCars().add(new Car());
        notify();
    }

    public synchronized Car sellCar() {
        System.out.println(Thread.currentThread().getName() + " зашел в автосалон");
        try {
            while (carShowroom.getCars().size() == 0) {
                System.out.println("Машин нет");
                wait();
            }
            Thread.sleep(sellTime);
            System.out.println(Thread.currentThread().getName() + " уехал на новеньком авто");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return carShowroom.getCars().remove(0);

    }

}
