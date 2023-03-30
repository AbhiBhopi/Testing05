package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodeAdd {
	
	@FindBy(xpath="//input[@class='_q92ef6']")
	private WebElement codeadd;

	@FindBy(xpath="//button[@type='buttons']")
	private WebElement continue;


	@FindBy(xpath="//a[@role='button']")
	private WebElement backbutton;
	public CodeAdd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void codeadd1()
	{
		codeadd.sendKeys("12345678");
	}
	public void continues()
	{
		continues.click();
	}
	public void back()
	{
		backbutton.click();
	}

}
