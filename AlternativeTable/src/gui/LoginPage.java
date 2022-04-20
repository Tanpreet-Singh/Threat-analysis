package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class LoginPage {

	StackPane createLayout(Stage primaryStage, int windowWidth, int windowHeight) {

		// Title that says "Login"
		Text title = new Text("Login");

		// Username and Password Fields
		GridPane credentialFields = new GridPane();
		credentialFields.setAlignment(Pos.CENTER);
		Text username = new Text("Username: ");
		Text password = new Text("Password: ");
		TextField typeUsername = new TextField();
		typeUsername.setPromptText("Your Username");
		PasswordField passwordField = new PasswordField();
		passwordField.setPromptText("Your Password");
		
		// Add the Text to the Grid
		credentialFields.addColumn(1, username, password);
		credentialFields.addColumn(2, typeUsername, passwordField);
		
		
		// Align these elements vertically
		Button loginBtn = new Button("Login");
		loginBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
	            MainPage main = new MainPage();
	            Scene scene;
				try {
					scene = new Scene(main.createLayout(), windowWidth, windowHeight);
					 primaryStage.setScene(scene);
						primaryStage.setScene(scene);
						scene.getStylesheets().add
		 				(LoginPage.class.getResource("Login.css").toExternalForm());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	           
	        }
		});
		VBox mainElements = new VBox(
				2.0,
				title,
				credentialFields,
				loginBtn);
		mainElements.setAlignment(Pos.CENTER);
		return new StackPane(mainElements);
	}
}
