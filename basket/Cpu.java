package basket;
import java.util.*;

public class Cpu extends Product implements Productible {

  private String type;
  
  public Cpu(String name, double cost) {
    super(name, cost);
    this.type = type;
  }

  public String getCpuType() {
    return this.type;
  }
 
}