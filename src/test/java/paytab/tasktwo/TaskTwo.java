package paytab.tasktwo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/tasktwo.feature",
glue= "stepDefinitions" ,
plugin= {"html:Report/positiveHtmlReport","junit:Report/positiveJunitReport.xml"}
)
public class TaskTwo {

}
