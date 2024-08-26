package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class Main extends Application {

    public static final String CURRENCY="$";
    @Override
    public void start(Stage stage) throws IOException {
        try{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/main/market.fxml"));
        Scene scene= new Scene(fxmlLoader.load(), 800, 600);

        // Добавляем файл стилей
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/main/style.css")).toExternalForm());
        stage.setTitle("Juices Market!");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }}
        public static void main(String[]args){
            launch(args);
        }


}