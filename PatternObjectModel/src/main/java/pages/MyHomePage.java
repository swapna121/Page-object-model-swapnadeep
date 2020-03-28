package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class MyHomePage extends  ProjectMethods

{
	
	public MyHomePage() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement createLead;
	public CreateLead ClickCreateLead()
	{
		click(createLead);
		return new CreateLead();
	}
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement myleads;
	public MyLeadsPage Clickmylead()
	{
		click(myleads);
		return new MyLeadsPage();
	}
	
}
	
		
	
	

