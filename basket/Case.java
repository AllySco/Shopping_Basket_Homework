package basket;
import java.util.*;

public class Case implements Productible {

  private String name;
  private double cost;

  public Case(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

  public String getName(String name) {
    return this.name;
  }

  public double getCost(double cost) {
    return this.cost;
  }



 
}