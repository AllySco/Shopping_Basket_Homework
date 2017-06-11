package basket;
import java.util.*;

public class ShoppingBasket {

  private int accountNumber;
  private ArrayList<Productible> products;

  public ShoppingBasket(int accountNumber) {

    this.accountNumber = accountNumber;
    this.products = new ArrayList<>();

  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public int productCount() {
    return this.products.size();
  }

  public void addProduct(Productible product) {
    this.products.add(product);
  }

  public void removeProduct(Productible product) {
    this.products.remove(product);
  }

  public void clearBasket() {
    this.products.clear();
  }
}