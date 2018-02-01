import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.Scene;
import java.text.DecimalFormat;

import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.*;
import javafx.application.Platform;
import javafx.scene.control.TextField;

public class AddQuiz extends Application {
	TextField ans = new TextField();
	int number1 = (int)(System.currentTimeMillis() % 10);
	int number2 = (int)(System.currentTimeMillis() / 7 % 10);
	int number3 = (int)((Math.random() * 5));

	public static void main(String[] args) {
		launch(args);
	}

	@Override  //override the start method in the Application class 
	public void start(Stage primaryStage) {


		Label first = new Label("First random number is: " + number1);
		Label second = new Label("Second random number is: " + number2);
		Label third = new Label("Third random number is: " + number3);
		Label enterSum = new Label("Enter the sum of " + number1 + " , " + number2 + " , " + number3);

		Button btnOk = new Button("Enter");
		//OKHandlerClass handler1 = new OKHandlerClass();
		btnOk.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				int userSum = Integer.parseInt(ans.getText());
				int actualSum = (number1+number2+number3);
				if (userSum == actualSum) {
					Alert results = new Alert(Alert.AlertType.INFORMATION);
					results.setContentText("Your math skills are good!");
					results.showAndWait();
				} else {
					Alert failed = new Alert(Alert.AlertType.INFORMATION);
					failed.setContentText("Hmmm, looks like you could use some practice, the correct answer is: " + actualSum);
					failed.showAndWait();
				}
			}
		});

		Button btnCancel = new Button("Exit");
		//CancelHandlerClass handler2 = new CancelHandlerClass();
		btnCancel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Platform.exit();
			}
		});

		Alert intro = new Alert(Alert.AlertType.INFORMATION);
		intro.setContentText("Hello, .....");
		intro.showAndWait();

		GridPane pane = new GridPane();
		pane.setPadding(new Insets(11, 12, 13, 14));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		pane.add(first, 0, 0);
		pane.add(second, 0, 1);
		pane.add(third, 0, 2);
		pane.add(enterSum, 0, 3);
		pane.add(ans, 1, 3);
		pane.add(btnOk, 0, 4);
		pane.add(btnCancel, 1, 4);
		GridPane.setHalignment(btnOk, HPos.RIGHT);
		GridPane.setHalignment(btnCancel, HPos.RIGHT);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Title");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setOnCloseRequest(e -> Platform.exit());	


	}
}
/*
class OKHandlerClass implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		int userSum = Integer.parseInt(ans.get());
		int actualSum = (number1+number2+number3);
		if (userSum == actualSum) {
			Alert results = new Alert(Alert.AlertType.INFORMATION);
			results.setContentText("Your math skills are good!");
			results.showAndWait();
		} else {
			Alert failed = new Alert(Alert.AlertType.INFORMATION);
			failed.setContentText("Hmmm, looks like you could use some practice, the correct answer is: " + actualSum);
			failed.showAndWait();
		}
	}
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		Platform.exit();
	}
}
*/
