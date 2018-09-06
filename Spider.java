import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
/**
 * Write a description of class Spider here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spider extends Application
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
        gc.setFill(Color.RED);
        gc.fillOval(155,105,90,90);
        gc.setFill(Color.BLUE);
        gc.fillOval(185,135,30,30);
        gc.setFill(Color.GREEN);
        gc.strokeArc(105,120,50,50,270,180,ArcType.OPEN);
        gc.strokeArc(170,55,50,50,180,180,ArcType.OPEN);
        gc.strokeArc(245,120,50,50,90,180,ArcType.OPEN);
        gc.strokeArc(170,196,50,50,-180,-180,ArcType.OPEN);
        root.getChildren().add(canvas);
        primaryStage.setTitle("SpiderInJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
