/*

  * file: finalProject.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Final Project 
  * due date: May 5th, 2017
  * version: 1.3

 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox; 
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView; 
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.Group;
import javafx.scene.effect.ColorAdjust; 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;


public class FinalProject extends Application{
  //override the start method in the Application class
  @Override
  public void start(Stage primaryStage){

  	//create a pane or frame to hold the image 
  	Pane pane = new HBox(10);
  	//pane default padding settings
  	pane.setPadding(new Insets(20,20,90,20));

  	//sets image equal to image file, essentially creates the image
  	Image image = new Image("image.JPG");
		
		//set width and height of image to default values
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(450);
  	imageView.setFitHeight(600);


  	//initialize the color adjust class
  	ColorAdjust colorAdjust = new ColorAdjust();

  	//save original hue, brightness, and saturation settings
  	//so user can revert back to their original photo
  	double originHue = colorAdjust.getHue();
  	double originBright = colorAdjust.getBrightness();
  	double originSat = colorAdjust.getSaturation();

  	//adds imageView (branch of image) to the pane/frame
  	//essentially displays picture
  	pane.getChildren().add(imageView);

  	//Button creation for increasing hue, brightness, and saturation 
  	//values
  	Button btHue = new Button("Hue");
  	//creates a label for btHue
  	Label controlHue = new Label("Increase: ", btHue);
  	controlHue.setContentDisplay(ContentDisplay.BOTTOM);
  	controlHue.setTextFill(Color.BLACK);

  	//increase brightness button
  	Button btBright = new Button("Brightness");
  	Label controlBright = new Label("Increase: ", btBright);
  	controlBright.setContentDisplay(ContentDisplay.BOTTOM);
  	controlBright.setTextFill(Color.BLACK);

  	//increase saturation button
  	Button btSat = new Button("Saturation");
  	Label controlSat = new Label("Increase: ", btSat);
  	controlSat.setContentDisplay(ContentDisplay.BOTTOM);
  	controlSat.setTextFill(Color.BLACK);

  	//adds each button and label to the pane
  	pane.getChildren().addAll(btHue,btBright,btSat,controlBright, 
  	controlSat, controlHue);

  	//increase HUE button action  
  	btHue.setOnAction(e ->{
			//set variable, hueVal equal to the current hue value
			double hueVal = colorAdjust.getHue();
			//increment the hue value by +.01 each time
			//the button is pressed 
			colorAdjust.setHue(hueVal + .01);
			//apply coloradjust effect to the ImageView  
			imageView.setEffect(colorAdjust);
  	});
  	
  	//increase brightness button action  
  	btBright.setOnAction(e ->{
			//set variable, brightVal equal to the current brightness value
			double brightVal = colorAdjust.getBrightness();
			//increment the brightness value by +.01 each time
			//the button is pressed 
			colorAdjust.setBrightness(brightVal + .01);
			//apply coloradjust effect to the ImageView  
			imageView.setEffect(colorAdjust);
  	});

  	//increase saturation button action
  	btSat.setOnAction(e ->{
  		//variable satVal is set equal to the current 
  		//saturation value
  		double satVal = colorAdjust.getSaturation();
		  //change the saturation value by +0.1
			colorAdjust.setSaturation(satVal + 0.1);
			//apply coloradjust effect to the ImageView  
			imageView.setEffect(colorAdjust);
  	});

  	//Button creation for DECREASING hue, brightness, and saturation 
  	//values
  	Button btHueDown = new Button("Hue");
  	//creates a label for btHue
  	Label decreaseHue = new Label("Decrease: ", btHueDown);
  	decreaseHue.setContentDisplay(ContentDisplay.TOP);
  	decreaseHue.setTextFill(Color.BLACK);

  	//DECREASE brightness button
  	Button btBrightDown = new Button("Brightness");
  	Label decreaseBright = new Label("Decrease: ", btBrightDown);
  	decreaseBright.setContentDisplay(ContentDisplay.TOP);
  	decreaseBright.setTextFill(Color.BLACK);

  	//DECREASE saturation button
  	Button btSatDown = new Button("Saturation");
  	Label decreaseSat = new Label("Decrease: ", btSatDown);
  	decreaseSat.setContentDisplay(ContentDisplay.TOP);
  	decreaseSat.setTextFill(Color.BLACK);

  	//adds each button and label to the pane
  	pane.getChildren().addAll(btHueDown,btBrightDown,btSatDown,decreaseBright, 
  	decreaseSat, decreaseHue);

  	//DECREASE HUE button action  
  	btHueDown.setOnAction(e ->{
			//set variable, hueVal equal to the current hue value
			double hueVal = colorAdjust.getHue();
			//increment the hue value by +.01 each time
			//the button is pressed 
			colorAdjust.setHue(hueVal - .01);
			//apply coloradjust effect to the ImageView  
			imageView.setEffect(colorAdjust);
  	});
  	
  	//increase brightness button action  
  	btBrightDown.setOnAction(e ->{
			//set variable, brightVal equal to the current brightness value
			double brightVal = colorAdjust.getBrightness();
			//increment the brightness value by +.01 each time
			//the button is pressed 
			colorAdjust.setBrightness(brightVal - .01);
			//apply coloradjust effect to the ImageView  
			imageView.setEffect(colorAdjust);
  	});

  	//increase saturation button action
  	btSatDown.setOnAction(e ->{
  		//variable satVal is set equal to the current 
  		//saturation value
  		double satVal = colorAdjust.getSaturation();
		  //change the saturation value by +0.1
			colorAdjust.setSaturation(satVal - 0.1);
			//apply coloradjust effect to the ImageView  
			imageView.setEffect(colorAdjust);
  	});

  	//create radio button to change image back to original settings
  	RadioButton rbOriginal = new RadioButton("Original Photo");
  	
  	//give the radio button action
  	//if red is selected do these actions
  	rbOriginal.setOnAction(e ->{
  		if(rbOriginal.isSelected()){
  			//change settings back to those of original photo
  			colorAdjust.setBrightness(originBright);
  			colorAdjust.setHue(originHue);
  			colorAdjust.setSaturation(originSat);
  			//apply coloradjust effect to the ImageView  
  			imageView.setEffect(colorAdjust);
  			rbOriginal.setSelected(false);
  		}
  	});

  	//add radio button to display
  	pane.getChildren().add(rbOriginal);

  	//create scene and place it in the stage 
  	Scene scene = new Scene(pane);
  	primaryStage.setTitle("Photo Editor"); //sets the stage title
  	primaryStage.setScene(scene); //Place the scene in the stage 
  	primaryStage.show(); //Display the stage

  }
}