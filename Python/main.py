from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")
    car = Car("AMS745", Account("Alan Castor", "FRD423"))
    print(vars(car))
    print(vars(car.driver))