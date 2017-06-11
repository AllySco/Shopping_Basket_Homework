package basket;
import java.util.*;

public class Customer {

  private String name;
  private boolean loyaltyCard;
  private ShoppingBasket shoppingBasket;


  public Customer(String name, ShoppingBasket shoppingBasket) {
    this.name = name;
    this.loyaltyCard = false;
    this.shoppingBasket = shoppingBasket;
  }

  public String getName() {
    return this.name;
  }

  public boolean getLoyaltyCard() {
    return this.loyaltyCard;
  }

  public void setLoyaltyCard() {
    this.loyaltyCard = true;
  }

}