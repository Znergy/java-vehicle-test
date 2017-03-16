import java.io.Console;

public class App{
  public static void main(String[] args) {
    Console userInput = System.console();

    Vehicle myNewCar = new Vehicle (1955, "Ford", "Edsel", 500, 4120);


    System.out.println("What's your budget?");
    Integer userBudget = Integer.parseInt(userInput.readLine());

    boolean myNewCarWorthIt = myNewCar.worthBuying(userBudget);
    System.out.println("Is the car worth it? " + myNewCarWorthIt);
    System.out.println(myNewCar.worthBuying(userBudget));
  }
}
