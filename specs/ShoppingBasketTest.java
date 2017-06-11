import static org.junit.Assert.*;
import org.junit.*;
import basket.*;

public class ShoppingBasketTest {

  ShoppingBasket shoppingBasket;
  Case case1;
  Cpu cpu1;
  GfxCard gfxCard1;
  Monitor monitor1;

  @Before
  public void before () {
    shoppingBasket = new ShoppingBasket(123);
    case1 = new Case("NZXT", 100, "Micro ATX");
    cpu1 = new Cpu("Intel", 230, "i7");
    gfxCard1 = new GfxCard("Geforce 1080", 450, "Nvidia");
    monitor1 = new Monitor("BenQ", 150, 27);
  }

  @Test
  public void canGetAccountNumber() {
    assertEquals(123, shoppingBasket.getAccountNumber());
  }

  @Test
  public void productListStartsEmpty() {
    assertEquals(0, shoppingBasket.productCount());
  }

  @Test
  public void canAddCaseToBasket() {
    shoppingBasket.addProduct(case1);
    assertEquals(1, shoppingBasket.productCount());
  }

  @Test
  public void canAddCpuToBasket() {
    shoppingBasket.addProduct(cpu1);
    assertEquals(1, shoppingBasket.productCount());
  }

  @Test
  public void canAddGfxCardToBasket() {
    shoppingBasket.addProduct(gfxCard1);
    assertEquals(1, shoppingBasket.productCount());
  }

  @Test
  public void canAddMonitorToBasket() {
    shoppingBasket.addProduct(monitor1);
    assertEquals(1, shoppingBasket.productCount());
  }

  @Test
  public void canClearProductsFromBasket() {
    shoppingBasket.addProduct(monitor1);
    shoppingBasket.addProduct(cpu1);
    shoppingBasket.addProduct(gfxCard1);
    shoppingBasket.addProduct(case1);
    shoppingBasket.clearBasket();
    assertEquals(0, shoppingBasket.productCount());
  }

  @Test
  public void canRemoveProductFromBasket() {
    shoppingBasket.removeProduct(gfxCard1);
    assertEquals(0, shoppingBasket.productCount());
  }














}