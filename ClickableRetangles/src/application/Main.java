package application;
	
import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			Group root = new Group();
			
			Scene scene = new Scene(root,600,600);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Rectangle rec1 = new Rectangle(20,20,200,200);
			Rectangle rec2 = new Rectangle(30,30,200,200);
			Rectangle rec3 = new Rectangle(40,40,200,200);
			
			Rectangle[] rectangleArray = new Rectangle[] {rec1,rec2,rec3};
			
			Random rand = new Random();
			
			for(Rectangle p : rectangleArray) {
				p.setFill(randomColor(rand));
				
			}
			
			
			root.getChildren().addAll(rec1,rec2,rec3);
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
			
			
			
			for(Rectangle p : rectangleArray) {
				Dragger dragger = new Dragger(0, 0);
				p.setOnMousePressed((MouseEvent e) -> {
					
					dragger.setInitialX(e.getSceneX());
					
					dragger.setInitialY(e.getSceneY());
					
				});
				
				p.setOnMouseDragged((MouseEvent e) -> {
					p.setX(e.getSceneX() - dragger.getInitialX());
				
					p.setY(e.getSceneY() - dragger.getInitialY());
					
				});
				p.setOnMouseReleased((MouseEvent e) -> {
					
				});
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static Color randomColor(Random rand) {
		Color c = Color.rgb(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
		return c;
	}
	
}
