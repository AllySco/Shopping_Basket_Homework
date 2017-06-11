package basket;
import java.util.*;

public class Checkout {

  private Customer customer;

  public Checkout(Customer customer) {
    this.customer = customer;
  }

  public int getTotalCost() {
    ShoppingBasket shoppingBasket = customer.getShoppingBasket();
    ArrayList<Productible> allProducts = shoppingBasket.getProducts();

    int total = 0;
    for (Productible product : allProducts) {
      total += product.getProductCost();
    }
  }




}