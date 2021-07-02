import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.sql.*;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
		primaryStage.setTitle("LAB_FAT_18BCE0920");

        GridPane grid = new GridPane();
        
        grid.setPadding(new Insets(40, 40, 40, 40));
        grid.setHgap(10);
        grid.setVgap(10);

        Scene scene = new Scene(grid, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        Text text = new Text();
		text.setText("FOR U SHOP");
		text.setFont(Font.font("Arial",30));

        Text text2 = new Text();
		text2.setText("Discount Calculator");
		text2.setFont(Font.font("Arial",20));

        grid.add(text, 0, 0, 1, 1);
        grid.add(text2, 0, 1, 1, 1);

        Label nameLabel = new Label("Shopping Amount: ");
        nameLabel.setFont(Font.font("Arial",15));
        grid.add(nameLabel, 0,2);

        
        TextField nameField = new TextField();
        nameField.setPrefHeight(40);
        grid.add(nameField, 1,2);

        Label l = new Label("Payment Mode: ");
        l.setFont(Font.font("Arial",15));
        grid.add(l, 0,3);
        ToggleGroup group= new ToggleGroup();
        RadioButton r1 = new RadioButton("Cash");
        RadioButton r2 = new RadioButton("Cheque");
        RadioButton r3 = new RadioButton("Credit Card");
        r1.setToggleGroup(group);
        r2.setToggleGroup(group);
        r3.setToggleGroup(group);
        r1.setSelected(true);
        grid.add(r1, 1,3);
        grid.add(r2, 1,4);
        grid.add(r3, 1,5);

        Label nameLabel2 = new Label("Discount Amount: ");
        nameLabel2.setFont(Font.font("Arial",15));
        grid.add(nameLabel2, 0,7);

        TextField nameField2 = new TextField();
        nameField2.setPrefHeight(40);
        grid.add(nameField2, 1,7);

        Label nameLabel3 = new Label("Net Price: ");
        nameLabel3.setFont(Font.font("Arial",15));
        grid.add(nameLabel3, 0,8);

        
        TextField nameField3 = new TextField();
        nameField3.setPrefHeight(40);
        grid.add(nameField3, 1,8);

        Button submitButton = new Button("Calculate");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        grid.add(submitButton, 0,6);

        Button clearButton = new Button("Clear All");
        clearButton.setPrefHeight(40);
        clearButton.setDefaultButton(true);
        clearButton.setPrefWidth(100);
        grid.add(clearButton, 1,6);

        clearButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    nameField.setText(null);
                    nameField2.setText(null);
                    nameField3.setText(null);
                    r1.setSelected(true);
                }
            });

       
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			 public void handle(ActionEvent event) {
				 int price= Integer.parseInt(nameField.getText());
				 if(r1.isSelected()==true&& Integer.parseInt(nameField.getText())<10000) {
					 double discount=price*0.2;					 
					 nameField2.setText(String.valueOf(discount));
					 nameField3.setText(String.valueOf(price-discount));
				 }
				 if(r2.isSelected()==true&& Integer.parseInt(nameField.getText())<15000) {
					 double discount=price*0.1;
					 nameField2.setText(String.valueOf(discount));
					 nameField3.setText(String.valueOf(price-discount));
				 }
				 if(r3.isSelected()==true&& Integer.parseInt(nameField.getText())<10000) {
					 double discount=price*0.1;
					 nameField2.setText(String.valueOf(discount));
					 nameField3.setText(String.valueOf(price-discount));
				 }
				 
			 }
			 });
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
