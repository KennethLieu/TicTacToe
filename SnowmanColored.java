import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
/**
 * Write a description of class SnowmanColored here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnowmanColored extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(400,300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.ORANGE);
        gc.fillOval(175,50,50,50);
        gc.setFill(Color.GREEN);
        gc.fillOval(175,100,50,50);
        gc.setFill(Color.RED);
        gc.fillOval(175,150,50,50);
        gc.setFill(Color.BLACK);
        gc.fillOval(185,65,10,10);
        gc.fillOval(205,65,10,10);
        gc.setFill(Color.BLUE);
        gc.fillOval(195,75,10,10);
        gc.strokeArc(125,105,50,50,-200,-180,ArcType.OPEN);
        gc.strokeArc(225,105,50,50,-200,-180,ArcType.OPEN);
        root.getChildren().add(canvas);
        primaryStage.setTitle("SnowmanInJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
