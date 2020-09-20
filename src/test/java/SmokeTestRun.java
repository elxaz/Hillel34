import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome = true,
        features = {
                "src/test/resources/features/smoke/Hillel_34_home_task.feature",
        },
        glue = "stepdefinitions")

public class SmokeTestRun {



}
