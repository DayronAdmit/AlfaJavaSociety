package CoffeMachine;

public class CoffeeMaker {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("LavAzza",CoffeeType.GROUND);
        CoffeeMachine deLonghi3000 = new CoffeeMachine();
        deLonghi3000.makeCoffee(0.5, 250);
        deLonghi3000.addWater(1000);
        deLonghi3000.makeCoffee(0.5, 250);
        deLonghi3000.addCoffee(200, coffee);
        deLonghi3000.makeCoffee(0.7, 250);
        deLonghi3000.showCountOfWater();
        deLonghi3000.showCountOfCoffee();
    }
}
