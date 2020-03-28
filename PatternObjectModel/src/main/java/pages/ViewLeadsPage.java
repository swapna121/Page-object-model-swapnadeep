package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods {
public ViewLeadsPage()
{

	PageFactory.initElements(driver,this);
}
@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
private WebElement delete;

public void clickDelete() {
	
    click(delete);
	  
	
}
/*@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
private WebElement eleclick;

public ViewLeadsPage clickFindLeads() {
	type(eleclick,"1");
    return this;
	  
	
}
/*@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
private WebElement eleclick1;

public ViewLeadsPage selectLead() {
	click(eleclick1);
	return this;*/

}

