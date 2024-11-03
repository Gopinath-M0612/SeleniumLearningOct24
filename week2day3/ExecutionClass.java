package learning.week2day3;

public class ExecutionClass extends Button {

	public static void main(String[] args) {
		
		ExecutionClass call = new ExecutionClass();
		call.setText("Facebook");
		
		Button call2 = new Button();
		call2.setText("Netflix");
		call2.click();
		call2.submit();
		
		TextField call3 = new TextField();
		
		call3.setText("Text3");
		call3.getText();
		call3.click();
		
		RadioButton call4 = new RadioButton();
		call4.setText("text4");
		call4.selectRadioButton();
		call4.submit();
		call4.click();
		
		checkBoxButton call5 = new checkBoxButton();
		call5.click();
		call5.setText("Hi");
		call5.clickCheckButton();
		
	}

}
