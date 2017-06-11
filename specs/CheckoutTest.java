import static org.junit.Assert.*;
import org.junit.*;
import basket.*;

public class CheckoutTest {

  ShoppingBasket shoppingBasket;
  Case case1;
  Cpu cpu1;
  GfxCard gfxCard1;
  Monitor monitor1;
  Customer customer;
  Checkout checkout;

  @Before
  public void before () {
    shoppingBasket = new ShoppingBasket(123);
    case1 = new Case("NZXT", 100, "Micro ATX");
    cpu1 = new Cpu("Intel", 230, "i7");
    gfxCard1 = new GfxCard("Geforce 1080", 450, "Nvidia");
    monitor1 = new Monitor("BenQ", 150, 27);
    customer = new Customer("Dave", shoppingBasket);
    checkout = new Checkout(customer);


    shoppingBasket.addProduct(case1);
    shoppingBasket.addProduct(cpu1);
    shoppingBasket.addProduct(gfxCard1);
    shoppingBasket.addProduct(monitor1);
  }

  @Test
  public void canGetTotalCost() {
    assertEquals(930, checkout.getTotalCost());
  }


}