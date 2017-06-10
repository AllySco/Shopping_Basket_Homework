import static org.junit.Assert.*;
import org.junit.*;
import basket.*;
public class ProductTest {

  Product product1;


  @Before
  public void before() {
    product1 = new Product("NZXT", 150);

  }

  @Test
  public void canGetProductName() {
    assertEquals("NZXT", product1.getProductName());
  }

  @Test
  public void canGetProductCost() {
    assertEquals(150, product1.getProductCost());
  }
  
}