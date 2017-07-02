package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.TextFlow;

public class Controller {

    @FXML
    private Button startButton;

    @FXML
    private Label tittleLabel;

    @FXML
    private AnchorPane pane1;

    @FXML
    private AnchorPane pane2;

    @FXML
    private Label marathonLabel;

    @FXML
    private TextField enterName;

    @FXML
    private AnchorPane introPane;

    @FXML
    private TextFlow textFlow1;

    @FXML
    private Button introButton;

    @FXML
    private AnchorPane ionianRevoltPane;

    @FXML
    private AnchorPane dariusVow;

    @FXML
    private Button dariusVowButton;

    @FXML
    private Button ionianButton;


    @FXML
    private AnchorPane campaignPane;

    @FXML
    private AnchorPane revoltEndPane;

    @FXML
    private AnchorPane agoraPane;

    @FXML
    private Button revoltEndButton;

    @FXML
    private Button agoraButton;

    @FXML
    private AnchorPane chooseGeneralPane;

    @FXML
    private Button chooseGeneralButton;

    @FXML
    private AnchorPane options1Pane;

    @FXML
    private Button persianArrivalButton;

    @FXML
    private Button options1Button;

    @FXML
    private AnchorPane persianArrival;

    @FXML
    private Button chooseMarathonButton;

    @FXML
    private AnchorPane battlefieldsPane;


    @FXML
    private void buttonMethod(ActionEvent event){
        Button b = (Button) event.getSource();
        GameLogic g = new GameLogic(this);

        if(b.equals(startButton)){
            //startButton.setVisible(false);
            System.out.print("startbutton");
            g.startGame();
        }
        else if(b.equals(introButton)){
            g.introFunction();
            System.out.print("introButton");
        }
        else if(b.equals(ionianButton)){
            g.dariusFunction();
            System.out.print("dariusbutton");
        }
        else if(b.equals(dariusVowButton)){
            g.endRevoltFunction();
            System.out.print("dariusbutton2");
        }
        else if(b.equals(revoltEndButton)){
            g.agoraFunction();
            System.out.print("revoltendButton");
        }
        else if(b.equals(agoraButton)){
            g.chooseGeneralFunction();
            System.out.print("revoltendButton");
        }
        else if(b.equals(chooseGeneralButton)){
            g.optionsPaneFunction();
            System.out.print("revoltendButton");
        }
        else if(b.equals(options1Button)){
            g.persianArrivalFunction();
            System.out.print("revoltendButton");
        }
        else if(b.equals(persianArrivalButton)){
            g.chooseBattlefieldFunction();
            System.out.print("revoltendButton");
        }


    }


    public Button getStartButton() {
        return startButton;
    }



    public AnchorPane getPane1() {
        return pane1;
    }

    public AnchorPane getPane2() {
        return pane2;
    }

    public Label getMarathonLabel() {
        return marathonLabel;
    }

    public Label getTittleLabel() {
        return tittleLabel;
    }

    public AnchorPane getIntroPane() {
        return introPane;
    }

    public TextFlow getTextFlow1() {
        return textFlow1;
    }

    public Button getIntroButton() {
        return introButton;
    }

    public AnchorPane getIonianRevoltPane() {
        return ionianRevoltPane;
    }

    public AnchorPane getDariusVow() {
        return dariusVow;
    }

    public AnchorPane getRevoltEndPane() {
        return revoltEndPane;
    }

    public AnchorPane getAgoraPane() {
        return agoraPane;
    }

    public AnchorPane getChooseGeneralPane() {
        return chooseGeneralPane;
    }

    public AnchorPane getOptions1Pane() {
        return options1Pane;
    }

    public AnchorPane getPersianArrival() {
        return persianArrival;
    }

    public AnchorPane getBattlefieldsPane() {
        return battlefieldsPane;
    }
}
