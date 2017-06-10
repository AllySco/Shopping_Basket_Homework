package basket;
import java.util.*;

public class Cpu extends Product implements Productible {

  private String type;
  
  public Cpu(String name, int cost, String type) {
    super(name, cost);
    this.type = type;
  }

  public String getCpuType() {
    return this.type;
  }
 
}