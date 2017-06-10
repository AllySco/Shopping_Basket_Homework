package basket;
import java.util.*;

public class Case extends Product implements Productible {

  private String sizeType;

  public Case(String name, int cost, String sizeType) {
    super(name, cost);
    this.sizeType = sizeType;
  }

  public String getCaseSizeType() {
    return this.sizeType;
  }
}