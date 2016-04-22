import org.junit.*;
import static org.junit.Assert.*;

public class VowelReplaceTest {

  @Test
  public void vowelReplacer_forASingleConsonant_b() {
    VowelReplace vowelReplace = new VowelReplace();
    assertEquals("b", vowelReplace.vowelReplacer("b"));
  }
}
