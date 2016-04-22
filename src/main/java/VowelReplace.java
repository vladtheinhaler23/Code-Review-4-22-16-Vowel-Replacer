import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class VowelReplace {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map model = new HashMap();
      model.put("template", "templates/home.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/reults", (request, response) -> {
      HashMap model = new HashMap();
      String userInput = request.queryParams("userInput");

      String changedString = vowelReplacer(userInput);

      model.put("output", changedString);
      model.put("template", "templates/greeting_card.vtl");
      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
  }

  public static String vowelReplacer(String userInput) {

    String results = "";

    if (userInput != null) {
      String output = userInput.replaceAll("[aeiou]", "-");
      results = output;
    }
    return results;
  }

}
