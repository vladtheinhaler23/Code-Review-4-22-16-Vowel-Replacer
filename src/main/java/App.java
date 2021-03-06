import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map model = new HashMap();
      model.put("template", "templates/home.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map model = new HashMap();
      VowelReplace myVowelReplace = new VowelReplace();
      String userInput = request.queryParams("userInput");

      String changedString = myVowelReplace.vowelReplacer(userInput);

      model.put("output", changedString);
      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
  }
}
