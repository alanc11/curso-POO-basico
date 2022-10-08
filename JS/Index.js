var car = new Car("FYE660B", new Account("Alan Castor", "INE458"));
car.printDataCar();

var uberX = new UberX("FOE730L", new Account("Alan Peña", "JUO520"), "Seat", "Ibiza");
uberX.passenger = 4;
uberX.printDataCar();

var user1 = new Driver(new Account("Dayan Gomez", "INE"), "day@gmail.com");
user1.printAccountDatils();