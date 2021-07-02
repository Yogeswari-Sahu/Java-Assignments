import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Rishi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TextField textField1 = new TextField();
			TextField textField2 = new TextField();
			TextField textField3 = new TextField();
			RadioButton cash = new RadioButton("Cash");
			RadioButton cheque = new RadioButton("Cheque");
			RadioButton cred = new RadioButton("Credit Card");
		 Button CmdClear = new Button("Clear All");
		 CmdClear.setOnAction(new EventHandler<ActionEvent>() {
		 @Override
		 public void handle(ActionEvent event) {
			 textField1.setText(null);
			 textField2.setText(null);
			 textField3.setText(null);
			 cash.setSelected(true);
		 }
		 });
		 calc.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			 public void handle(ActionEvent event) {
				 int price= Integer.parseInt(textField1.getText());
				 if(cash.isSelected()==true&& Integer.parseInt(textField1.getText())<10000) {
					 int discount=price*0.2;					 
					 textField2.setText(discount);
					 textField3.setText(price-discount);
				 }
				 if(cheque.isSelected()==true&& Integer.parseInt(textField1.getText())<15000) {
					 int discount=price*0.1;
					 textField2.setText(discount);
					 textField3.setText(price-discount);
				 }
				 if(cred.isSelected()==true&& Integer.parseInt(textField1.getText())<10000) {
					 int discount=price*0.1;
					 textField2.setText(discount);
					 textField3.setText(price-discount);
				 }
				 
			 }
			 });
	}

}
