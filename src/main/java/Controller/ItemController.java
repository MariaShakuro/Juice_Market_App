package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.Main;
import model.Juice;


public class ItemController {
    @FXML
    private ImageView img;

    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;

     private Juice juice;

     public setData(Juice juice){
     this.juice=juice;
     nameLabel.setText(juice.getName());
     priceLabel.setText(Main.CURRENCY+juice.getPrice());
         Image image=new Image(getClass().getResourceAsStream(juice.getImgScr()));
         img.setImage(image);
     }

}
