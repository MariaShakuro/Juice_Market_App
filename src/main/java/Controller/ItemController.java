package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import main.Main;
import main.MyListener;
import model.Juice;

import java.awt.event.ActionEvent;


public class ItemController {
    @FXML
    private ImageView img;

    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private void click(MouseEvent mouseEvent){
        myListener.onClickListener(juice);
    }
     private Juice juice;
     private MyListener myListener;

     public void setData(Juice juice,MyListener myListener){
     this.juice=juice;
     this.myListener=myListener;
     nameLabel.setText(juice.getName());
     priceLabel.setText(Main.CURRENCY+juice.getPrice());
         Image image=new Image(getClass().getResourceAsStream(juice.getImgScr()));
         img.setImage(image);
     }


}
