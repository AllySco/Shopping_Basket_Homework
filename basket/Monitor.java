package basket;
import java.util.*;

public class Monitor extends Product implements Productible {

  private int size;

  public Monitor(String name, double cost, int size) {
    super(name, cost);
    this.size = size;

  }

  public int getMonitorSize() {
    return this.size;
  }

  
}