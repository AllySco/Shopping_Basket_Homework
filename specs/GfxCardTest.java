import static org.junit.Assert.*;
import org.junit.*;
import basket.*;

public class GfxCardTest {

  GfxCard gfxCard1;

  @Before
  public void before() {
    gfxCard1 = new GfxCard("Intel", 200, "Nvidia");
  }

  @Test
  public void canGetCpuType() {
    assertEquals("Nvidia", gfxCard1.getGfxCardBrand());
  }
}