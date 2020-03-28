package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
public MyLeadsPage()
{

	PageFactory.initElements(driver,this);
}
@FindBy(how=How.LINK_TEXT,using="Find Leads")
private WebElement eleclick;

public FindLeadsPage ClickFindLeads() {
	click(eleclick);
	return new FindLeadsPage();
	
}

}
