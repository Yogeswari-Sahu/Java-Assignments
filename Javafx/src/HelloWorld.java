import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
public class HelloWorld extends Application{
	 @Override
	 public void start(Stage stage) {
	 //creating label email
	 Text text1 = new Text("Course Name");
	 //creating label password
	 Text text2 = new Text("Number of Credits");
	 Text text3 = new Text(" ");
	 //Creating Text Filed for email
	 TextField textField1 = new TextField();
	 Text Message1 = new Text("");
	 //Creating Buttons
	 Button button1 = new Button("SUBMIT");
	 button1.setOnAction(new EventHandler<ActionEvent>() {
	 @Override
	 public void handle(ActionEvent event) {
	 Message1.setText("Here are the details of course "+ textField1.getText()+" "+ 4);
	 text3.setText("4");
	 }
	 });
	 //Creating a Grid Pane
	 GridPane gridPane = new GridPane();
	 //Setting size for the pane
	 gridPane.setMinSize(400, 200);
	 //Setting the padding
	 gridPane.setPadding(new Insets(10, 10, 10, 10));
	 //Setting the vertical and horizontal gaps between the columns
	 gridPane.setVgap(5);
	 gridPane.setHgap(5);
	 //Setting the Grid alignment
	 gridPane.setAlignment(Pos.CENTER);
	 //Arranging all the nodes in the grid
	 gridPane.add(text1, 0, 0);
	 gridPane.add(textField1, 1, 0);
	 gridPane.add(text2, 0, 1);
	 gridPane.add(text3, 1, 1);
	 gridPane.add(button1, 0, 3);
	 gridPane.add(Message1, 0, 2);
	 //Styling nodes
	 button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
	 text1.setStyle("-fx-font: normal bold 20px 'serif'; -fx-text-fill: green; ");
	 text1.setFill(Color.GREEN);
	 text3.setStyle("-fx-font: normal bold 20px 'serif'; -fx-text-fill: green; ");
	 text3.setFill(Color.GREEN);
	 text2.setStyle("-fx-font: normal bold 20px 'serif';-fx-text-fill: green; ");
	 Message1.setStyle("-fx-font: normal 15px 'serif';");
	 Message1.setFill(Color.PURPLE);
	 text2.setFill(Color.GREEN);
	 gridPane.setStyle("-fx-background-color: BEIGE;");
	 // Creating a scene object
	 Scene scene = new Scene(gridPane);
	 // Setting title to the Stage
	 stage.setTitle("18BCE0928 YOGESWARI SAHU 08-05-21");
	 // Adding scene to the stage
	 stage.setScene(scene);
	 //Displaying the contents of the stage
	 stage.show();
	 }
	 public static void main(String args[]){
		 System.out.println("Yogeswari Sahu 18BCE0928 08-05-2021");
	 launch(args);
	 }
}
