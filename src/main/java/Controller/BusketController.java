package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class BusketController {

    private Stage stage;
    private Scene scene;
    private FXMLLoader fxmlLoader ;

    @FXML
    void buybtn(MouseEvent event) throws IOException {
        // Загружаем новую сцену из FXML файла
        try{
         fxmlLoader = new FXMLLoader(getClass().getResource("/main/pay.fxml"));
         scene = new Scene(fxmlLoader.load(), 800, 600);
         stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Pay");
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }}
    @FXML
    void exit(MouseEvent event) throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("/main/market.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.hide();
    }

    }

