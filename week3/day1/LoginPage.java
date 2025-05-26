package week3.day1;

public class LoginPage extends BasePage{
	
	public void performCommonTasks(int count)
	{
		int count1=20,sum;
		sum=count+count1;
		System.out.println("The overriden method action is: "+sum);
		System.out.println("Now calling the parent class method");
		super.performCommonTasks(10);
	}
	
	public void clickElement()
	{
		super.clickElement();
	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.performCommonTasks(20);
		lp.clickElement();
	}

}
