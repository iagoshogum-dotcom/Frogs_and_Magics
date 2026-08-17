package com.escobar.RPG.controller;

import com.escobar.RPG.util.GerenciadorTela;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.IOException;

public class MenuController {
        @FXML
        private ImageView GameLogo;
        @FXML
        private Button btIniciar;
        @FXML
        private Button btConfiguracoes;
        @FXML
        private Button btCreditos;
        @FXML
        private Button btPularIntroducao;

        @FXML
        private MediaView mediaView;

        private MediaPlayer mediaPlayer;


        @FXML
        public void initialize() {

            btIniciar.setVisible(false);
            GameLogo.setVisible(false);
            btConfiguracoes.setVisible(false);
            btCreditos.setVisible(false);
            btPularIntroducao.setVisible(true);
            String caminho = getClass()
                    .getResource("/com/escobar/RPG/videos/videoIntrodução.mp4")
                    .toExternalForm();

            Media media = new Media(caminho);

            mediaPlayer = new MediaPlayer(media);

            mediaView.setMediaPlayer(mediaPlayer);

            mediaPlayer.setOnEndOfMedia(() -> {
                btIniciar.setVisible(true);
                GameLogo.setVisible(true);
                btConfiguracoes.setVisible(true);
                btCreditos.setVisible(true);
                tocarVideoMenu();
            });

            mediaPlayer.play();
        }

        private void tocarVideoMenu() {


            String caminhoVideo2 = getClass()
                    .getResource("/com/escobar/RPG/videos/videoMenuOfficial.mp4")
                    .toExternalForm();

            Media media2 = new Media(caminhoVideo2);

            if (mediaPlayer != null) {
                mediaPlayer.dispose();
            }

            mediaPlayer = new MediaPlayer(media2);

            mediaView.setMediaPlayer(mediaPlayer);

            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);

            mediaPlayer.play();
        }
         @FXML
         private void aoPularIntroducao() {


            if (mediaPlayer != null) {
            mediaPlayer.stop();
         }
            tocarVideoMenu();
            btPularIntroducao.setVisible(false);
            btIniciar.setVisible(true);
            GameLogo.setVisible(true);
            btConfiguracoes.setVisible(true);
            btCreditos.setVisible(true);
        }

        @FXML
        protected void aoIniciarGame(Event event) throws IOException {
            GerenciadorTela.getInstance().trocarTela(event,"person.fxml","PERSSONAGEM");
        }








}