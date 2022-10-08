class Main{
    public static void main (String[] args){
        System.out.println("Hola mundo");
        Car car = new Car("FYE660B", new Account("Alan Castor", "ALC123"));
        car.printDataCar();
        
        Car car2 = new Car("HTS785G", new Account("Alondra Bebe", "DAY226"));
        car2.printDataCar();
    }
}

