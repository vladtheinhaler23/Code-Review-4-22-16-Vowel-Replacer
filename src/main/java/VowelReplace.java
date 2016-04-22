public class VowelReplace {
  public static String vowelReplacer(String userInput) {

    String results = "";

    if (userInput != null) {
      String output = userInput.replaceAll("[aeiou]", "-");
      results = output;
    }
    return results;
  }
}
