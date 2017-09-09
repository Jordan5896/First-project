package sample;

/**
 * Created by Iordanis on 05-Aug-17.
 */

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;

public class Sound {
    private MediaPlayer mediaPlayer;

    public void playBackgroungMusic(){
        String backgroundMusic = "src/Audio/epicMusic.mp3";
        Media hit = new Media(new File(backgroundMusic).toURI().toString());
        mediaPlayer = new MediaPlayer(hit);


        mediaPlayer.setOnEndOfMedia(new Runnable() {
            public void run() {
                mediaPlayer.seek(Duration.ZERO);
            }
        });
        mediaPlayer.setVolume(1);
        mediaPlayer.play();
    }

    public MediaPlayer audioCommentary(MediaPlayer existingMediaPlayer, String audioName){
        if (existingMediaPlayer == null){
            String backgroundMusic = "src/Audio/" + audioName + ".mp3";
            Media hit = new Media(new File(backgroundMusic).toURI().toString());
            MediaPlayer newMediaPlayer = new MediaPlayer(hit);
            newMediaPlayer.play();
            return newMediaPlayer;
        }
        else{
            existingMediaPlayer.stop();
            return null;
        }
    }



}
