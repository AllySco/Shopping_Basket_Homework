package basket;
import java.util.*;

public class Product {

  private String name;
  private double cost;

  public Product(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

  public String getProductName() {
    return this.name;
  }

  public double getProductCost() {
    return this.cost;
  }

}