/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitninja;

//import com.sun.java.swing.plaf.windows.resources.windows;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * @author Eco
 */
public class FruitNinja extends Application{

    //Stage window = new Stage();
    //Pane root = new Pane();

     //private ArrayList<Fruit> Spawned = new ArrayList<Fruit>();
    public void start(Stage primaryStage) throws IOException {
        Controller control=Controller.getInstance();
        control.start(primaryStage);
    }


     public static void main(String[] args) {
        launch(args);
    }

}
