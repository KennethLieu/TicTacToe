import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
/**
 * Write a description of class FrowningFace here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FrowningFace extends Application
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
        gc.fillOval(50,50,150,150);
        gc.setFill(Color.BLACK);
        gc.fillOval(80,80,30,30);
        gc.fillOval(130,80,30,30);
        gc.setFill(Color.YELLOW);
        gc.strokeArc(80,140,100,50,-180,-180,ArcType.OPEN);
        root.getChildren().add(canvas);
        primaryStage.setTitle("FrownyFaceInJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
