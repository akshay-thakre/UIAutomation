/**
 **
 * Created by Thakre on 30/12/2018.
 */

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@CucumberOptions(features="src/test/resources/features",
        plugin={"pretty","html:target/cucumber-report"},
        monochrome = true)


@RunWith(CucumberWithSerenity.class)
public class Runner {

}

