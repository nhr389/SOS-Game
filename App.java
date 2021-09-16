import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class App extends Application {
  

    public void start(Stage SOSgame)
    {
      // GUI Elements created
        SOSgame.setTitle("Game");  
        Text menuMessage = new Text("SOS");
        Line line1 = new Line();
        line1.setStartX(0.0f);
        line1.setEndX(500.0f);
        Line line2 = new Line();
        line2.setStartX(0.0f);
        line2.setEndX(500.0f);
        RadioButton player1 = new RadioButton("1 Player");
        RadioButton player2 = new RadioButton("2 Player");
        ToggleGroup playerSelect = new ToggleGroup();
        CheckBox check = new CheckBox();
        player1.setToggleGroup(playerSelect);
        player2.setToggleGroup(playerSelect);

      // GUI Elements added to a box to center them
        VBox vbox1 = new VBox(5);
        vbox1.getChildren().addAll(menuMessage, line1, player1,player2, line2, check);

      // box is added to a pane which is loaded into the scene and shown
        StackPane pane1 = new StackPane();
  
        pane1.getChildren().add(vbox1);
  
        Scene scene1 = new Scene(pane1, 500, 500);
  
        SOSgame.setScene(scene1);
  
        SOSgame.show();
    }
  
    public static void main(String args[])
    {
        launch(args);
    }
}
