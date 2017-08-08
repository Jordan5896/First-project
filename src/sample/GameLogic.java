package sample;

import com.sun.javafx.geom.RectangularShape;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.scene.Node;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Iordanis on 08-Jun-17.
 */
public class GameLogic {

    Controller c = new Controller();
    GameDatabase d = new GameDatabase(c);
    Sound s = new Sound();
    private static final MediaPlayer START_AUDIO = null;
    //I used static because currentAudio became null every time because
    //g GameLogic would create a new instance every time I clicked a button
    // and I need to save the value of currentAudio
    private static MediaPlayer currentAudio = null;
    public static int playerScore = 100;

    public GameLogic(Controller c) {
        this.c = c;
    }




    public void startGame(){
        //c.getPane1().setVisible(false);
        //c.getStartButton().setVisible(false);
        //c.getTittleLabel().setVisible(false);
        //c.getMarathonLabel().setVisible(false);
        c.getIntroPane().setVisible(true);
        currentAudio = s.audioCommentary(START_AUDIO, "peirama2");

        //c.getTextFlow1().
    }

    public void introFunction(){
        c.getIonianRevoltPane().setVisible(true);
        c.getIntroPane().setVisible(false);
        s.audioCommentary(currentAudio, null);
    }

    public void dariusFunction(){
        c.getIonianRevoltPane().setVisible(false);
        c.getDariusVow().setVisible(true);
    }

    public void endRevoltFunction(){
        c.getDariusMotivesPane().setVisible(false);
        c.getRevoltEndPane().setVisible(true);
    }
    public void dariusMotivesFunction(){
        c.getDariusVow().setVisible(false);
        c.getDariusMotivesPane().setVisible(true);
    }

    public void alliesHelpFunction(){
        c.getOptions1Pane().setVisible(false);
        c.getAlliesHelpPane().setVisible(true);
    }

    public void agoraFunction(){
        c.getRevoltEndPane().setVisible(false);
        c.getAgoraPane().setVisible(true);
    }
    public void chooseGeneralFunction(){
        c.getAgoraPane().setVisible(false);
        c.getChooseGeneralPane().setVisible(true);
    }
    public void optionsPaneFunction(){
        c.getChooseGeneralPane().setVisible(false);
        c.getOptions1Pane().setVisible(true);
    }
    public void persianArrivalFunction(){
        c.getOptions1Pane().setVisible(false);
        c.getAlliesHelpPane().setVisible(false);
        c.getPersianArrival().setVisible(true );
    }
    public void chooseBattlefieldFunction(){
        c.getPersianArrival().setVisible(false );
        c.getBattlefieldsPane().setVisible(true );
    }
    public void battleChaosFunction(){
        c.getBattlefieldsPane().setVisible(false );
        c.getBattleChaosPane().setVisible(true);
    }
    public void chooseFormationFunction(){
        c.getBattleChaosPane().setVisible(false);
        c.getChooseFormationPane().setVisible(true);
    }
    public void armyStrengthFunction(){
        c.getChooseFormationPane().setVisible(false);
        c.getArmyStrengthPane().setVisible(true);
    }

    public void battleFunction(){
        c.getArmyStrengthPane().setVisible(false);
        c.getBattlePane().setVisible(true);
    }
    public void firstTextFunction(){
        c.getTextArchers().setVisible(true);
        c.getDashButton().setVisible(true);
        c.getWaitArrowsButton().setVisible(true);
        c.getBeginBattleButton().setVisible(false);
    }

    public void dashFunction(){
        c.getTextArchers().setVisible(false);
        c.getDashButton().setVisible(false);
        c.getWaitArrowsButton().setVisible(false);
        c.getA1().setVisible(false);
        c.getA2().setVisible(false);
        c.getA3().setVisible(false);
        c.getA4().setVisible(false);
        c.getA5().setVisible(false);
        c.getA6().setVisible(false);
        c.getA7().setVisible(false);
        c.getA8().setVisible(false);
        c.getA9().setVisible(false);
        c.getA10().setVisible(false);
        c.getA11().setVisible(false);
        c.getA12().setVisible(false);
        c.getA13().setVisible(false);
        c.getA14().setVisible(false);
        c.getA15().setVisible(false);
        c.getA16().setVisible(false);
        c.getE1().setVisible(false);
        c.getE2().setVisible(false);
        c.getE3().setVisible(false);
        c.getE4().setVisible(false);
        c.getE5().setVisible(false);
        c.getE6().setVisible(false);
        c.getE7().setVisible(false);
        c.getE8().setVisible(false);
        c.getE9().setVisible(false);
        c.getE10().setVisible(false);
        c.getE11().setVisible(false);
        c.getE12().setVisible(false);
        c.getE13().setVisible(false);
        c.getE14().setVisible(false);
    }

    public void revealCavalryTextFunction(){
        c.getPressForwardButton().setVisible(true);
        c.getRe_enforcementsButton().setVisible(true);
        c.getCavalryText().setVisible(true);
        c.getCavalryTextArea().setVisible(true);

    }

    public void persianAdvanceTextFunction(){
        c.getPressForwardButton().setVisible(false);
        c.getRe_enforcementsButton().setVisible(false);
        c.getCavalryText().setVisible(false);
        c.getCavalryTextArea().setVisible(false);
        c.getPersianAdvanceText().setVisible(true);
        c.getPersianAdvanceTextArea().setVisible(true);
        c.getDeployMiltiadesTacticsButton().setVisible(true);
        c.getHoldTheLineButton().setVisible(true);
        c.getPressForward2Button().setVisible(true);
    }

    public void persianCenterFunction(){
        c.getPersianAdvanceTextArea().setVisible(false);
        c.getDeployMiltiadesTacticsButton().setVisible(false);
        c.getHoldTheLineButton().setVisible(false);
        c.getPressForward2Button().setVisible(false);
        c.getPersianCenterText().setVisible(true);
        c.getPersianCenterTextArea().setVisible(true);
        c.getRetreatCenterButton().setVisible(true);
        c.getAttackPersianCenterButton().setVisible(true);

    }



    public void arrowsAnimationFunction(Node imageGiven){
        Node arrowAnimation = imageGiven;
        arrowAnimation.setVisible(true);
        FadeTransition ft = new FadeTransition(Duration.millis(2000), imageGiven);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(100);
        ft.setAutoReverse(true);
        ft.play();
    }

//    public void formationAnimation(Rectangle rect) {
//
//        Timer timer = new Timer();
//            timer.scheduleAtFixedRate(new TimerTask() {
//                @Override
//                public void run() {
//                    Animation.moveUp(rect);
//
//                }
//            }, 0, 33);
//    }


public void formationAnimation(Rectangle rect){
        Line line = new Line();
//        Circle circle = new Circle(100);
        line.setStartX(141);
        line.setEndX(141);
        line.setStartY(10);
        line.setEndY(36);
//        line.setStartX(rect.getX());
//        line.setEndX(rect.getX());
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(5));
        t.setPath(line);
        t.setCycleCount(PathTransition.INDEFINITE);
        t.play();
        System.out.println("xsdasd =" + rect.getX() +  "ysadsda = " + rect.getY());
}

    public void leftColumnAnimation(Rectangle rect){
        Line line = new Line();
        line.setStartX(35);
        line.setEndX(35);
        line.setStartY(10);
        line.setEndY(-15);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(5));
        t.setPath(line);
        t.setCycleCount(PathTransition.INDEFINITE);
        t.play();
    }

    public void rightColumnAnimation(Rectangle rect){
        Line line = new Line();
        line.setStartX(35);
        line.setEndX(35);
        line.setStartY(10);
        line.setEndY(-15);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(5));
        t.setPath(line);
        t.setCycleCount(PathTransition.INDEFINITE);
        t.play();
    }

    public void hideTacticalArrowsFunction(){
        c.getBattleArrow1().setVisible(false);
        c.getBattleArrow2().setVisible(false);
        c.getBattleArrow3().setVisible(false);
        c.getBattleArrow4().setVisible(false);

    }

    public void endOfBattleFunction(){
        c.getBattlePane().setVisible(false);
        c.getEndOfBattlePane().setVisible(true);
    }
    public void pheidepedesFunction(){
        c.getEndOfBattlePane().setVisible(false);
        c.getPheidepedesPane().setVisible(true);
    }

    public void aftermathFunction(){
        c.getPheidepedesPane().setVisible(false);
        c.getAftermathPane().setVisible(true);
    }
    public void aftermath2Function(){
        c.getAftermathPane().setVisible(false);
        c.getAftermath2Pane().setVisible(true);
    }
    public void triumphFunction(){
        c.getAftermath2Pane().setVisible(false);
        c.getTriumphPane().setVisible(true);
        c.getScoreText().setVisible(true);
        c.getScoreText().setText("" +playerScore);
        d.saveToDatabase();


    }
    public void playAgainFunction(){
        c.getTriumphPane().setVisible(false);
        c.getPane1().setVisible(true);
    }
    public void advise1Function(){
        c.getOptions1Pane().setVisible(false);
        c.getAdvise1Pane().setVisible(true);
    }
    public void returnOptions1Function(){
        c.getAdvise1Pane().setVisible(false);
        c.getOptions1Pane().setVisible(true);
    }
    public void advise2Function(){
        c.getBattlefieldsPane().setVisible(false);
        c.getAdvise2Pane().setVisible(true);
    }
    public void returnBattlefieldsPaneFunction(){
        c.getAdvise2Pane().setVisible(false);
        c.getBattlefieldsPane().setVisible(true);
    }
    public void advise3Function(){
        c.getChooseFormationPane().setVisible(false);
        c.getAdvise3Pane().setVisible(true);
    }
    public void returnChooseFormationFunction(){
        c.getAdvise3Pane().setVisible(false);
        c.getChooseFormationPane().setVisible(true);
    }
    public void advise4Function(){
        c.getBattlePane().setVisible(false);
        c.getAdvise4Pane().setVisible(true);
    }
    public void returnBattlePane4(){
        c.getAdvise4Pane().setVisible(false);
        c.getBattlePane().setVisible(true);
    }
    public void advise5Function(){
        c.getBattlePane().setVisible(false);
        c.getAdvise5Pane().setVisible(true);
    }
    public void returnBattlePane5(){
        c.getAdvise5Pane().setVisible(false);
        c.getBattlePane().setVisible(true);
    }
    public void advise6Function(){
        c.getBattlePane().setVisible(false);
        c.getAdvise6Pane().setVisible(true);
    }
    public void returnBattlePane6(){
        c.getAdvise6Pane().setVisible(false);
        c.getBattlePane().setVisible(true);
    }
    public void advise7Function(){
        c.getBattlePane().setVisible(false);
        c.getAdvise7Pane().setVisible(true);
    }
    public void returnBattlePane7(){
        c.getAdvise7Pane().setVisible(false);
        c.getBattlePane().setVisible(true);
    }

    public void hideTextFunction(){
        c.getPersianCenterText().setVisible(false);
        c.getPersianCenterTextArea().setVisible(false);
        c.getRetreatCenterButton().setVisible(false);
        c.getAttackPersianCenterButton().setVisible(false);
        c.getPersianAdvanceText().setVisible(false);
    }





}
