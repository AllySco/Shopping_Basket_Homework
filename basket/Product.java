package basket;
import java.util.*;

public class Product {

  private String name;
  private int cost;

  public Product(String name, int cost) {
    this.name = name;
    this.cost = cost;
  }

  public String getProductName() {
    return this.name;
  }

  public int getProductCost() {
    return this.cost;
  }

}