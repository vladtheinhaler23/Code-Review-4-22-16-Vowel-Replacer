import org.junit.*;
import static org.junit.Assert.*;

public class VowelReplaceTest {

  @Test
  public void vowelReplacer_forASingleConsonant_b() {
    VowelReplace vowelReplace = new VowelReplace();
    assertEquals("b", vowelReplace.vowelReplacer("b"));
  }
  @Test
  public void vowelReplacer_forASingleVowel_a() {
    VowelReplace vowelReplace = new VowelReplace();
    assertEquals("-", vowelReplace.vowelReplacer("a"));
  }
  @Test
  public void vowelReplacer_forASingleWord_cat() {
    VowelReplace vowelReplace = new VowelReplace();
    assertEquals("c-t", vowelReplace.vowelReplacer("cat"));
  }
}
