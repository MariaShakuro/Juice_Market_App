package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AvatarController {

    private Stage stage;
    private Scene scene;
    private  FXMLLoader fxmlLoader ;


    @FXML
    void exitButton(MouseEvent event) throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("/main/market.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.hide();

    }


}
