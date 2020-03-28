package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	public CreateLead()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompany;
	public CreateLead EnterCompany(String company)
	{
		type(elecompany, company);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefname;
	public CreateLead EnterFname(String fname)
	{
		type(elefname, fname);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelname;
	public CreateLead Enterlname(String lname)
	{
		type(elelname, lname);
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement submitbutton;
	public void clicksubmit()
	{
		click(submitbutton);
	}
}
