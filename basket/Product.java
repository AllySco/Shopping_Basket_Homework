package basket;
import java.util.*;

public class Product {

  private String name;
  private double cost;

  public Product(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

  public String getProductName(String name) {
    return this.name;
  }

  public double getProductCost(double cost) {
    return this.cost;
  }

}