/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitninja;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

/**
 *
 * @author Lenovo
 */
public class Pineapple extends Normal{
    Node Appearance = new Circle(40,new ImagePattern(new Image(getClass().getResourceAsStream("/Images/Pineapple.png"))));
   
            
    public Pineapple() {
        super();
        super.Appearance=Appearance;
        
    }
    public Pineapple setAppearancecut() {

        ImagePattern cut= new ImagePattern(new Image(getClass().getResourceAsStream("/Images/Pineapplecut.png")));
        ImagePattern cut2= new ImagePattern(new Image(getClass().getResourceAsStream("/Images/Pineapplecut2.png")));
        play();
        ((Circle)super.Appearance).setFill(cut);
        Pineapple neww=new Pineapple();
        neww.Appearance.setTranslateY(this.Appearance.getTranslateY());
        ((Circle)neww.Appearance).setFill(cut2);
        neww.Appearance.setTranslateX(neww.Appearance.getTranslateX()+50);
        return neww;

    }

}
