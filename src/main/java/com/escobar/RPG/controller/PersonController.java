package com.escobar.RPG.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


public class PersonController {
    @FXML
    private MediaView mediaViewPerson;

    @FXML
    private ImageView sapoWarriorSelection;

    @FXML
    private ImageView sapoWarriorSelection2;

    @FXML
    private ImageView PersonStatusWarrior;

    @FXML
    private ImageView warriorHistoria;


    private MediaPlayer mediaPlayer2;



    @FXML
    public void initialize() {
        sapoWarriorSelection2.setVisible(false);
        PersonStatusWarrior.setVisible(false);
        warriorHistoria.setVisible(false);

        String caminho = getClass()
                .getResource("/com/escobar/RPG/videos/videoFundoSelecao.mp4")
                .toExternalForm();

        Media media = new Media(caminho);

        mediaPlayer2 = new MediaPlayer(media);

        mediaViewPerson.setMediaPlayer(mediaPlayer2);

        mediaPlayer2.setCycleCount(MediaPlayer.INDEFINITE);

        mediaPlayer2.play();


    }

    @FXML
    public void aoVerWarrior(){
        sapoWarriorSelection.setVisible(false);
        sapoWarriorSelection2.setVisible(true);
        PersonStatusWarrior.setVisible(true);
        warriorHistoria.setVisible(true);

    }
    @FXML
    public void aoDesVerWarrior(){
        sapoWarriorSelection.setVisible(true);
        sapoWarriorSelection2.setVisible(false);
        PersonStatusWarrior.setVisible(false);
        warriorHistoria.setVisible(false);

    }



}