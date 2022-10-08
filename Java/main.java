class Main{
    public static void main (String[] args){
        Uberx uberx = new Uberx("FYE660B", new Account("Alan Cast", "INE"), "Fiat", "UNO");
        
        uberx.setPassenger(4);
        uberx.printDataCar();
        
        UberXL uberXL = new UberXL ("NHD458S", new Account("ALAN GOOOd", "INE"));
        uberXL.setPassenger(6);
        uberXL.printDataCar();
        // Uberx uberx = new Car("HTS785G", new Account("Alondra Bebe", "DAY226"));
        // car2.printDataCar();
    }
}

