module com.escobar.RPG {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens com.escobar.RPG to javafx.fxml;
    opens com.escobar.RPG.controller to javafx.fxml;
    exports com.escobar.RPG;
}