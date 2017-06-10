package basket;
import java.util.*;

public class GfxCard extends Product implements Productible {

  private String brand;

  public GfxCard(String name, int cost, String brand) {
    super(name, cost);
    this.brand = brand;
  }

  public String getGfxCardBrand() {
    return this.brand;
  }
  
}