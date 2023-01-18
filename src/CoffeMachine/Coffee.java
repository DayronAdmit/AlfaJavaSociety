package CoffeMachine;

public class Coffee {
   private String coffeeName;
   private CoffeeType coffeeType;

   public Coffee(String coffeeName, CoffeeType coffeeType) {
      this.coffeeName = coffeeName;
      this.coffeeType = coffeeType;
   }

   public String getCoffeeInfo() {
      return (coffeeName+" "+coffeeType.getDescription());
   }

}
