class Consumer implements Runnable {

    CarShowroom store;

    Consumer(CarShowroom store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {
            store.sellCar();
        }
    }
}
