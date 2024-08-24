module sample.juicemarket {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens main to javafx.fxml;
    exports main;
    exports Controller;
    opens Controller to javafx.fxml;
}