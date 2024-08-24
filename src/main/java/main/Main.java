package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javax.swing.text.Element;
import javax.swing.text.html.ImageView;
import javafx.scene.image.Image;

import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("market.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        // Добавляем файл стилей
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/main/style.css")).toExternalForm());

        stage.setTitle("Juices Market!");
        stage.setScene(scene);
        stage.show();
        }


    public static void main(String[] args) {launch();}
}