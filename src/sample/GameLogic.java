package sample;

/**
 * Created by Iordanis on 08-Jun-17.
 */
public class GameLogic {

    Controller c = new Controller();

    public GameLogic(Controller c) {
        this.c = c;
    }



    public void startGame(){
        //c.getPane1().setVisible(false);
        //c.getStartButton().setVisible(false);
        //c.getTittleLabel().setVisible(false);
        //c.getMarathonLabel().setVisible(false);
        c.getIntroPane().setVisible(true);
        //c.getTextFlow1().
    }

    public void introFunction(){
        c.getIonianRevoltPane().setVisible(true);
        c.getIntroPane().setVisible(false);
    }

    public void dariusFunction(){
        c.getIonianRevoltPane().setVisible(false);
        c.getDariusVow().setVisible(true);
    }

    public void endRevoltFunction(){
        c.getDariusVow().setVisible(false);
        c.getRevoltEndPane().setVisible(true);
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
        c.getPersianArrival().setVisible(true );
    }
    public void chooseBattlefieldFunction(){
        c.getPersianArrival().setVisible(false );
        c.getBattlefieldsPane().setVisible(true );

    }



}
