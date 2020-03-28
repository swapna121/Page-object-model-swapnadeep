package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {
public FindLeadsPage()
{

	PageFactory.initElements(driver,this);
}
@FindBy(how=How.XPATH,using="//input[@name='id']")
private WebElement userid;

public FindLeadsPage typeUserID() {
	type(userid,"1");
    return this;
	  
	
}
@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
private WebElement eleclick;

public FindLeadsPage clickFindLeadsButton() {
	click(eleclick);
    return this;
	  
	
}
@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
private WebElement eleclick1;

public ViewLeadsPage selectLead()
{
	click(eleclick1);
	return new ViewLeadsPage();
	
}

}
