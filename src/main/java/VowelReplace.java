public class VowelReplace {
  public static void main(String[] args) {}

  public String vowelReplacer(String userInput) {

    String results = "";

    if (userInput != null) {
      String output = userInput.replaceAll("[aeiou]", "-");
      results = output;
    }
    return results;
  }

}
