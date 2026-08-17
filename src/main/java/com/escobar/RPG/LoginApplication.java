package com.escobar.RPG;

import com.escobar.RPG.controller.MusicController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Font fonte = Font.loadFont(
                LoginApplication.class.getResourceAsStream(
                        "/com/escobar/RPG/fonts/PressStart2P-Regular.ttf"
                ),
                20
        );

        System.out.println("FONTE CARREGADA: " + fonte);

        if (fonte != null) {
            System.out.println("FAMÍLIA: " + fonte.getFamily());
            System.out.println("NOME: " + fonte.getName());
        }

        MusicController.iniciarMusica();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("menu.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 1280, 720);
        stage.setTitle("frogs and magics");
        stage.setScene(scene);
        stage.show();
    }
}
