import org.junit.*;
import static org.junit.Assert.*;

public class VowelReplaceTest {

  @Test
  public void vowelReplacer_forASingleConsonant_b() {
    VowelReplace vowelReplace = new VowelReplace();
    assertEquals("b", vowelReplace.vowelReplacer("b"));
  }
  @Test
  public void vowelReplacer_forASingleVowel_dash() {
    VowelReplace vowelReplace = new VowelReplace();
    assertEquals("-", vowelReplace.vowelReplacer("a"));
  }
  @Test
  public void vowelReplacer_forASingleWord_cdasht() {
    VowelReplace vowelReplace = new VowelReplace();
    assertEquals("c-t", vowelReplace.vowelReplacer("cat"));
  }
  @Test
  public void vowelReplacer_forMultipleWords_bdashgDdashg() {
    VowelReplace vowelReplace = new VowelReplace();
    assertEquals("b-g d-g", vowelReplace.vowelReplacer("big dog"));
  }
  @Test
  public void vowelReplacer_forMultipleWordsWithCaps_BdashgDdashg() {
    VowelReplace vowelReplace = new VowelReplace();
    assertEquals("B-g D-g", vowelReplace.vowelReplacer("Big Dog"));
  }
}
