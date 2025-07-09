package application;
/**
* Objective: Display a simple bar graph representing component weights for a course using JavaFX
* Algorithm:*******************************************************************
* 1. Initialize a JavaFX Pane as the drawing canvas.
* 2. Define the pane and bar height scaling constants.
* 3. Create Rectangle objects sized proportionally to the weights.
* 4. Assign distinct colors and positional coordinates to each bar.
* 5. Add Text labels above each bar with percentage and description.
* 6. Group all shapes and text into the pane, then display via Scene and Stag
*******************************************************************************
*Input and Output: No user input, displays graph with 4 color coded/text bars
* Created by: George Pollard
* Date: 7/25/2025
* Version: JDK22
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Main class, extends application to launch JavaFX GUI
public class BarGraph extends Application{
	// Entry point for JavaFX application
	public void start(Stage primaryStage) {
		// Create a pane to hold all graphical components
		Pane pane = new Pane();
		// Define max height for bars and total display height
		double height = 300;
		double paneheight = 150;
		// Creates and configures rectangle for "Project"
		Rectangle r1 = new Rectangle(10, paneheight - height * 0.2, 100, height * 0.2);
		r1.setFill(Color.RED);
		Text text1 = new Text(10, paneheight - height * 0.2 - 10, "Project -- 20%");
		// Rectangle for "Quiz"		
		Rectangle r2 = new Rectangle(120, paneheight - height * 0.1, 100, height * 0.1);
		r2.setFill(Color.BLUE);
		Text text2 = new Text(120, paneheight - height * 0.1 - 10, "Quiz -- 20%");
		// Rectangle for "Midterm"
		Rectangle r3 = new Rectangle(230, paneheight - height * 0.3, 100, height * 0.3);
		r3.setFill(Color.GREEN);
		Text text3 = new Text(230, paneheight - height * 0.3 - 10, "Midterm -- 30%");
		// Rectangle for "Final"		
		Rectangle r4 = new Rectangle(340, paneheight - height * 0.4, 100, height * 0.4);
		r4.setFill(Color.ORANGE);
		Text text4 = new Text(340, paneheight - height * 0.4 - 10, "Final -- 40%");
		
		// Add all shapes and text to the pane
		pane.getChildren().addAll(r1, text1, r2, text2, r3, text3, r4, text4);
		
		// Set up the scene and stage
		Scene scene = new Scene(pane, 500, paneheight);
		primaryStage.setTitle("BarChart");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	// Standard main method to launch JavaFX application
	public static void main(String[] args) {
		launch(args);

		
	}
}
