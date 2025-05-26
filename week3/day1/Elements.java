package week3.day1;

public class Elements extends Button {
	
	public void execution()
	{
		System.out.println("Method from execution class");
	}

	public static void main(String[] args) {
		
		Elements el = new Elements();
		//Grand Parent class WebElement methods
		el.click();
		el.setText("Hello from main");
		//Parent Button class
		el.submit();
		//Current class
		el.execution();
		//Could'nt call methods of RadioButton, CheckBoxButton and TextField class
		
	}

}
