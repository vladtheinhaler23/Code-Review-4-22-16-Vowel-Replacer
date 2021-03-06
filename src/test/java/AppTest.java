import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Vowel Replacer");
  }
  @Test
    public void singleConsonant() {
    goTo("http://localhost:4567");
    fill("#userInput").with("b");
    submit(".btn");
    assertThat(pageSource()).contains("b");
  }
  @Test
    public void wordWithSingleVowel() {
    goTo("http://localhost:4567");
    fill("#userInput").with("dog");
    submit(".btn");
    assertThat(pageSource()).contains("d-g");
  }
  @Test
    public void wordWithVowels() {
    goTo("http://localhost:4567");
    fill("#userInput").with("tape");
    submit(".btn");
    assertThat(pageSource()).contains("t-p-");
  }
  @Test
    public void multipleWords() {
    goTo("http://localhost:4567");
    fill("#userInput").with("big dog");
    submit(".btn");
    assertThat(pageSource()).contains("b-g d-g");
  }
  @Test
    public void multipleWordsWithCaps() {
    goTo("http://localhost:4567");
    fill("#userInput").with("Big Dog");
    submit(".btn");
    assertThat(pageSource()).contains("B-g D-g");
  }
}
