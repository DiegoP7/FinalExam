package pkgApp;
import pkgApp.controller.RetirementController;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class RetirementApp extends Application {

	private RetirementController controller;
	
	 public static void main(String[] args) {
		  launch(args);
		 }
		 @Override
		 public void start(Stage primaryStage) throws Exception {
		  try {
		   // Load person overview.
		   FXMLLoader loader = new FXMLLoader();  
		   loader =  new FXMLLoader(getClass().getResource("/app/view/Retirement.fxml"));    
		   BorderPane ClientServerOverview = (BorderPane) loader.load();
		   Scene scene = new Scene(ClientServerOverview);   
		   primaryStage.setScene(scene);
		   // Give the controller access to the main app.
		   RetirementController controller = loader.getController();   
		   controller.setMainApp(this);   
		   primaryStage.show();
		   //String css = this.getClass().getResource("../RetirementCalc.css").toExternalForm(); 
		   //scene.getStylesheets().add(css);
		   java.net.URL url = this.getClass().getResource("RetirementCalc.css");
		   String styleSheet = url.toExternalForm();
		   scene.getStylesheets().add(styleSheet);
		  } catch (IOException e) {
		   e.printStackTrace();
	 }  
 }
}
