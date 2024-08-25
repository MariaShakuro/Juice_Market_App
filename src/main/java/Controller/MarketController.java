package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import model.Juice;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MarketController implements Initializable {
    @FXML
    private ImageView JuiceImg;

    @FXML
    private Label JuiceNameLabel;

    @FXML
    private Label JuicePriceLabel;

    @FXML
    private VBox choosenJuiceCard;

    @FXML
    private GridPane grid;

    @FXML
    private ScrollPane scroll;

     private List<Juice> juices=new ArrayList<>();
    private List<Juice>getData(){
        List<Juice> juices=new ArrayList<>();
        Juice juice;

        for(int i=0;i<20;i++){
       juice=new Juice();
       juice.setName("Beetroot");
       juice.setPrice(2.30);
       juice.setImgScr("/main/beetroot_juice.png");
       juice.setColor("80080C");
       juices.add(juice);
        }
        return juices;

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    juices.addAll(getData());
int column=0;
int row=0;
        try {
    for(int i=0;i< juices.size();i++){
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/main/item.fxml"));

            AnchorPane anchorPane=fxmlLoader.load();

        ItemController itemController=fxmlLoader.getController();
        itemController.setData(juices.get(i));

        if(column==3){
            column=0;
            row++;
        }
        grid.add(anchorPane,column++,row);//(child,column,row)
        GridPane.setMargin(anchorPane,new Insets(10));
    }
    } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }





    }
}
