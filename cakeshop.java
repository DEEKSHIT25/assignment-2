import java.util.*;

class Order{
    String customerNme;
    String cakeType;
    int quantity;
    double pricePerCake;
    Order(String cName, String cType, int qn){
        customerNme = cName;
        cakeType = cType;
        quantity = qn;

        if (cakeType.equalsIgnoreCase("Chocolate")) pricePerCake = 350;
        
        else if (cakeType.equalsIgnoreCase("Vanilla")) pricePerCake = 300;
        
        else pricePerCake = 250;
    }

    public double calculateTotalPrice() {
        return quantity * pricePerCake;
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Customer Name: " + customerNme);
        System.out.println("Cake Type: " + cakeType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Cake: " + pricePerCake);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}
public class CakeShop{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String customerName = scanner.nextLine();

        String cakeType = scanner.nextLine();

        int quantity = scanner.nextInt();

        Order order = new Order(customerName, cakeType, quantity);

        order.displayOrderDetails();


        scanner.close();
    }
}
