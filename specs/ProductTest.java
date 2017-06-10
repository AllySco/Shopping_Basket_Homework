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
    assetEquals("NZXT", product1.getProductName());
  }
  
}