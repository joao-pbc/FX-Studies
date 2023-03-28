package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Stop;


public class JavaFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    	Group root = new Group();
        
    	Polygon polygon = new Polygon();
    	polygon.getPoints().addAll(new Double[]{
    	   30.0, 30.0,
    	    30.0, 90.0,
    	    -30.0, 90.0 });
    	
    	polygon.setLayoutX(50);
    	
    	polygon.setLayoutY(50);
    	
    	Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.BLUE)};
    	
    	LinearGradient color = new LinearGradient(0, 0, 1, 0, true, null, stops);
    	
    	polygon.setFill(color);
    	
        Scene scene = new Scene(root, 400, 400, Color.BLACK);
        
        root.getChildren().add(polygon);
        
        primaryStage.setTitle("Hello World!");
        
        primaryStage.setScene(scene);
        
        primaryStage.show();
	
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
