package com.escobar.RPG.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
    private ImageView warriorHistoria;
    @FXML
    private ImageView warrriorIcon;

    @FXML
    private Label txtWarriorHistoria1;

    @FXML
    private Label txtWarriorHistoria2;



    private MediaPlayer mediaPlayer2;



    @FXML
    public void initialize() {
        sapoWarriorSelection2.setVisible(false);
        txtWarriorHistoria1.setVisible(false);
        txtWarriorHistoria2.setVisible(false);
        warriorHistoria.setVisible(false);
        warrriorIcon.setVisible(false);

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
        txtWarriorHistoria1.setVisible(true);
        txtWarriorHistoria2.setVisible(true);
        warriorHistoria.setVisible(true);
        warrriorIcon.setVisible(true);

    }
    @FXML
    public void aoDesVerWarrior(){
        sapoWarriorSelection.setVisible(true);
        sapoWarriorSelection2.setVisible(false);
        txtWarriorHistoria1.setVisible(false);
        txtWarriorHistoria2.setVisible(false);
        warriorHistoria.setVisible(false);
        warrriorIcon.setVisible(false);
    }



}