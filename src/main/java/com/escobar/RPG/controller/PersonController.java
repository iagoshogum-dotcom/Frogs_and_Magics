package com.escobar.RPG.controller;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


public class PersonController {
    @FXML
    private MediaView mediaViewPerson;

    private MediaPlayer mediaPlayer2;

    @FXML
    public void initialize() {
        String caminho = getClass()
                .getResource("/com/escobar/RPG/videos/videoFundoSelecao.mp4")
                .toExternalForm();

        Media media = new Media(caminho);

        mediaPlayer2 = new MediaPlayer(media);

        mediaViewPerson.setMediaPlayer(mediaPlayer2);

        mediaPlayer2.setCycleCount(MediaPlayer.INDEFINITE);

        mediaPlayer2.play();


    }
    }
