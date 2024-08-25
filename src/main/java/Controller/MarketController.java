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
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import main.Main;
import main.MyListener;
import model.Juice;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.image.Image;

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
     private Image image;
    private MyListener myListener;
    private List<Juice>getData(){
        List<Juice> juices=new ArrayList<>();
        Juice juice;

       juice=new Juice();
       juice.setName("Beetroot juice");
       juice.setPrice(2.30);
       juice.setImgScr("/main/beetroot_juice.png");
       juice.setColor("80080C");
       juices.add(juice);

        juice=new Juice();
        juice.setName("Orange juice");
        juice.setPrice(2.33);
        juice.setImgScr("/main/orange_juice.png");
        juice.setColor("FB5D03");
        juices.add(juice);

        juice=new Juice();
        juice.setName("Watermelon juice");
        juice.setPrice(3.00);
        juice.setImgScr("/main/watermelon_juice.png");
        juice.setColor("22371D");
        juices.add(juice);

        juice=new Juice();
        juice.setName("Apple juice");
        juice.setPrice(1.20);
        juice.setImgScr("/main/apple_juice.png");
        juice.setColor("008000");
        juices.add(juice);

        juice=new Juice();
        juice.setName("Tomato juice");
        juice.setPrice(4.35);
        juice.setImgScr("/main/tomato_juice.png");
        juice.setColor("8B0000");
        juices.add(juice);

        juice=new Juice();
        juice.setName("Pineapple juice");
        juice.setPrice(2.05);
        juice.setImgScr("/main/pineapple_juice.png");
        juice.setColor("ffeb3b");
        juices.add(juice);

        juice=new Juice();
        juice.setName("Grapefruit juice");
        juice.setPrice(2.30);
        juice.setImgScr("/main/grapefruit_juice.png");
        juice.setColor("ffa8af");
        juices.add(juice);

        juice=new Juice();
        juice.setName("Grape juice");
        juice.setPrice(5.40);
        juice.setImgScr("/main/grape_juice.png");
        juice.setColor("8b00ff");
        juices.add(juice);

        juice=new Juice();
        juice.setName("Cranberry juice");
        juice.setPrice(7.55);
        juice.setImgScr("/main/cranberry_juice.png");
        juice.setColor("ff2400");
        juices.add(juice);

        juice=new Juice();
        juice.setName("Carrot juice");
        juice.setPrice(1.05);
        juice.setImgScr("/main/carrot_juice.png");
        juice.setColor("ffa500");
        juices.add(juice);




        return juices;

    }


    private void setChoosenJuice(Juice juice){
        JuiceNameLabel.setText(juice.getName());
        JuicePriceLabel.setText(Main.CURRENCY + juice.getPrice());
        image=new Image(getClass().getResourceAsStream(juice.getImgScr()));
        choosenJuiceCard.setStyle("-fx-background-color:#" +juice.getColor()+";\n"+ " -fx-background-radius:30;");
        JuiceImg.setImage(image);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    juices.addAll(getData());
    if(juices.size()>0){
        setChoosenJuice(juices.get(0));
        myListener=new MyListener() {
            @Override
            public void onClickListener(Juice juice) {
                setChoosenJuice(juice);
            }
        };
    }
    int column=0;
     int row=1;
        try {
    for(int i=0;i< juices.size();i++){
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/main/item.fxml"));
        AnchorPane anchorPane=fxmlLoader.load();

        ItemController itemController=fxmlLoader.getController();
        itemController.setData(juices.get(i),myListener);

        if(column==3){
            column=0;
            row++;
        }
        grid.add(anchorPane,column++,row);//(child,column,row)
        //set item grid width
        grid.setMinWidth(Region.USE_COMPUTED_SIZE);
        grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
        grid.setMaxWidth(Region.USE_PREF_SIZE);

        //set item grid height
        grid.setMinHeight(Region.USE_COMPUTED_SIZE);
        grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
        grid.setMaxHeight(Region.USE_PREF_SIZE);

        GridPane.setMargin(anchorPane,new Insets(10));
        }
    //для скролинга
       grid.layout();
       scroll.layout();
       scroll.applyCss();
    } catch (IOException e) {
                throw new RuntimeException(e);
            }
       //для скролинга
        scroll.setContent(grid);
        scroll.setFitToWidth(true);
        scroll.setFitToHeight(true);
    }
}

