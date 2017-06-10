package basket;
import java.util.*;

public class ShoppingBasket {

  private int accountNumber;
  private ArrayList<Productible> products;
  private int totalCost;
  private int discountCost;

  public ShoppingBasket(int accountNumber) {

    this.accountNumber = accountNumber;
    this.products = new ArrayList<Productible>();
    this.totalCost = totalCost;
    this.discountCost = discountCost;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public int productCount() {
    return this.products.size();
  }
}