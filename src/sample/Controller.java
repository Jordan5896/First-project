package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
//import javafx.scene.input.MouseEvent;

import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

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
    private AnchorPane battleChaosPane;

    @FXML
    private Button battleChaosButton;

    @FXML
    private ImageView leftArrow;

    @FXML
    private ImageView rightArrow;

    @FXML
    private ImageView midleArrow2;

    @FXML
    private ImageView midleArrow3;

    @FXML
    private ImageView midleArrow1;

    @FXML
    private AnchorPane chooseFormationPane;

    @FXML
    private Rectangle midRect;

    @FXML
    private Rectangle l1;

    @FXML
    private Rectangle l2;

    @FXML
    private Rectangle l3;
    @FXML

    private Rectangle r1;
    @FXML

    private Rectangle r2;

    @FXML
    private Rectangle r3;

    @FXML
    private Rectangle gl1;

    @FXML
    private Rectangle gl2;

    @FXML
    private Rectangle gl3;

    @FXML
    private Rectangle gl4;

    @FXML
    private Rectangle gm1;

    @FXML
    private Rectangle gm2;

    @FXML
    private Rectangle gr1;

    @FXML
    private Rectangle gr2;

    @FXML
    private Rectangle gr3;

    @FXML
    private Rectangle gr4;

    @FXML
    private Ellipse persianCavalryElipse;

    @FXML
    private Rectangle pl1;

    @FXML
    private Rectangle pl2;

    @FXML
    private Rectangle pl3;

    @FXML
    private Rectangle pl4;

    @FXML
    private Rectangle pl5;

    @FXML
    private Rectangle pm1;

    @FXML
    private Rectangle pm2;

    @FXML
    private Rectangle pm3;

    @FXML
    private Rectangle pm4;

    @FXML
    private Rectangle pm5;

    @FXML
    private Rectangle pr1;

    @FXML
    private Rectangle pr2;

    @FXML
    private Rectangle pr3;

    @FXML
    private Rectangle pr4;

    @FXML
    private Rectangle pr5;

    @FXML
    private AnchorPane battlePane;

    @FXML
    private Button miltiadesButton;

    @FXML
    private Button beginBattleButton;

    @FXML
    private TextArea textArchers;

    @FXML
    private Button dashButton;

    @FXML
    private Button waitButton;

    @FXML
    private ImageView a1;

    @FXML
    private ImageView a2;

    @FXML
    private ImageView a3;

    @FXML
    private ImageView a4;

    @FXML
    private ImageView a5;

    @FXML
    private ImageView a6;

    @FXML
    private ImageView a7;

    @FXML
    private ImageView a8;

    @FXML
    private ImageView a9;

    @FXML
    private ImageView a10;

    @FXML
    private ImageView a11;

    @FXML
    private ImageView a12;

    @FXML
    private ImageView a13;

    @FXML
    private ImageView a14;

    @FXML
    private ImageView a15;

    @FXML
    private ImageView a16;

    @FXML
    private ImageView e1;

    @FXML
    private ImageView e2;

    @FXML
    private ImageView e3;

    @FXML
    private ImageView e4;

    @FXML
    private ImageView e5;

    @FXML
    private ImageView e6;

    @FXML
    private ImageView e7;

    @FXML
    private ImageView e8;

    @FXML
    private ImageView e9;

    @FXML
    private ImageView e10;

    @FXML
    private ImageView e11;

    @FXML
    private ImageView e12;

    @FXML
    private ImageView e13;

    @FXML
    private ImageView e14;

    @FXML
    private TextArea cavalryTextArea;

    @FXML
    private Text cavalryText;

    @FXML
    private Button re_enforcementsButton;

    @FXML
    private TextArea persianAdvanceTextArea;

    @FXML
    private Text persianAdvanceText;

    @FXML
    private Button deployMiltiadesTacticsButton;

    @FXML
    private ImageView battleArrow1;

    @FXML
    private ImageView battleArrow2;

    @FXML
    private ImageView battleArrow3;

    @FXML
    private ImageView battleArrow4;

    @FXML
    private TextArea persianCenterTextArea;

    @FXML
    private Text persianCenterText;

    @FXML
    private Button attackPersianCenterButton;

    @FXML
    private ImageView sword1;

    @FXML
    private ImageView sword2;

    @FXML
    private ImageView sword3;

    @FXML
    private ImageView sword4;

    @FXML
    private ImageView sword5;

    @FXML
    private ImageView sword6;

    @FXML
    private ImageView me1;

    @FXML
    private ImageView me2;

    @FXML
    private ImageView me3;

    @FXML
    private ImageView me4;

    @FXML
    private ImageView me5;

    @FXML
    private ImageView me6;

    @FXML
    private ImageView me7;

    @FXML
    private ImageView me8;

    @FXML
    private ImageView me9;

    @FXML
    private ImageView me10;

    @FXML
    private ImageView me11;

    @FXML
    private ImageView me12;

    @FXML
    private ImageView spear1;

    @FXML
    private ImageView spear2;

    @FXML
    private ImageView spear3;

    @FXML
    private ImageView spear4;

    @FXML
    private ImageView me13;

    @FXML
    private ImageView me14;

    @FXML
    private ImageView me15;

    @FXML
    private ImageView me16;

    @FXML
    private ImageView me17;

    @FXML
    private ImageView me18;

    @FXML
    private AnchorPane dariusMotivesPane;

    @FXML
    private Button dariusMotivesButton;

    @FXML
    private AnchorPane alliesHelpPane;

    @FXML
    private Button alliesHelpButton;

    @FXML
    private Button options1Button1;

    @FXML
    private Button options1Button2;

    @FXML
    private Button options1Button3;

    @FXML
    private AnchorPane armyStrengthPane;

    @FXML
    private Button armyStrengthButton;

    @FXML
    private Button battle2Button;

    @FXML
    private AnchorPane endOfBattlePane;

    @FXML
    private Button endOfBattleButton;

    @FXML
    private AnchorPane pheidepedesPane;

    @FXML
    private Button pheidepedesButton;

    @FXML
    private AnchorPane aftermathPane;

    @FXML
    private Button aftermathButton;

    @FXML
    private AnchorPane aftermath2Pane;

    @FXML
    private Button aftermath2Button;

    @FXML
    private AnchorPane triumphPane;

    @FXML
    private Button exitButton;

    @FXML
    private Button playAgainButton;

    @FXML
    private AnchorPane advise1Pane;

    @FXML
    private Button advise1Button;

    @FXML
    private AnchorPane advise2Pane;

    @FXML
    private Button advise2Button;

    @FXML
    private Button chooseMountainsButton;

    @FXML
    private Button chooseAthensButton;

    @FXML
    private AnchorPane advise3Pane;

    @FXML
    private Button advise3Button;

    @FXML
    private Button standardFormationButton;

    @FXML
    private Button waitArrowsButton;

    @FXML
    private Button pressForwardButton;

    @FXML
    private Button holdTheLineButton;

    @FXML
    private Button pressForward2Button;

    @FXML
    private Button retreatCenterButton;

    @FXML
    private AnchorPane advise4Pane;

    @FXML
    private Button advise4Button;

    @FXML
    private AnchorPane advise5Pane;

    @FXML
    private Button advise5Button;

    @FXML
    private AnchorPane advise6Pane;

    @FXML
    private Button advise6Button;

    @FXML
    private AnchorPane advise7Pane;

    @FXML
    private Button advise7Button;




    @FXML
    private void buttonMethod(ActionEvent event){
        Button b = (Button) event.getSource();
        GameLogic g = new GameLogic(this);
        Animation a = new Animation(this);


        if(b.equals(startButton)){
            //startButton.setVisible(false);
            System.out.print(enterName.getText());
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
            g.dariusMotivesFunction();
            //g.endRevoltFunction();
            System.out.print("dariusbutton2");
        }
        else if(b.equals(dariusMotivesButton)){
            g.endRevoltFunction();
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
        else if(b.equals(options1Button2)){
            g.alliesHelpFunction();
        }
        else if(b.equals(alliesHelpButton)){
            g.persianArrivalFunction();
        }
        else if(b.equals(persianArrivalButton)){
            g.chooseBattlefieldFunction();
            System.out.print("revoltendButton");
        }
        else if(b.equals(chooseMarathonButton)){
            g.battleChaosFunction();
            System.out.print("revoltendButton");
        }
        else if(b.equals(battleChaosButton)){
            g.chooseFormationFunction();
            g.arrowsAnimationFunction(leftArrow);
            g.arrowsAnimationFunction(rightArrow);
            g.arrowsAnimationFunction(midleArrow1);
            g.arrowsAnimationFunction(midleArrow2);
            g.arrowsAnimationFunction(midleArrow3);
            g.formationAnimation(midRect);
            g.leftColumnAnimation(l1);
            g.leftColumnAnimation(l2);
            g.leftColumnAnimation(l3);
            g.rightColumnAnimation(r1);
            g.rightColumnAnimation(r2);
            g.rightColumnAnimation(r3);
        }

        else if(b.equals(miltiadesButton)){
            //g.battleFunction();
            g.armyStrengthFunction();
        }
        else if(b.equals(armyStrengthButton)){
            g.battleFunction();
        }

        else if(b.equals(beginBattleButton)){
            g.firstTextFunction();
            a.fireArrowsAnimation(a1);
            a.fireArrowsAnimation(a2);
            a.fireArrowsAnimation(a3);
            a.fireArrowsAnimation(a4);
            a.fireArrowsAnimation(a5);
            a.fireArrowsAnimation(a6);
            a.fireArrowsAnimation(a7);
            a.fireArrowsAnimation(a8);
            a.fireArrowsAnimation(a9);
            a.fireArrowsAnimation(a10);
            a.fireArrowsAnimation(a11);
            a.fireArrowsAnimation(a12);
            a.fireArrowsAnimation(a13);
            a.fireArrowsAnimation(a14);
            a.fireArrowsAnimation(a15);
            a.fireArrowsAnimation(a16);
            a.explosionFunction(e1);
            a.explosionFunction(e2);
            a.explosionFunction(e3);
            a.explosionFunction(e4);
            a.explosionFunction(e5);
            a.explosionFunction(e6);
            a.explosionFunction(e7);
            a.explosionFunction(e8);
            a.explosionFunction(e9);
            a.explosionFunction(e10);
            a.explosionFunction(e11);
            a.explosionFunction(e12);
            a.explosionFunction(e13);
            a.explosionFunction(e14);
            System.out.print("revoltendButton");
        }

        else if(b.equals(dashButton)){
            g.dashFunction();
            a.dashForwardAnimation(gl1);
            a.dashForwardAnimation(gl2);
            a.dashForwardAnimation(gl3);
            a.dashForwardAnimation(gl4);
            a.dashForwardAnimation(gr1);
            a.dashForwardAnimation(gr2);
            a.dashForwardAnimation(gr3);
            a.dashForwardAnimation(gr4);
            a.dashForwardAnimation2(gm1, e1);
            a.dashForwardAnimation2(gm2, e2);
            a.persianCavalryAnimation(persianCavalryElipse);
            g.revealCavalryTextFunction();
        }

        else if(b.equals(re_enforcementsButton)){
            a.re_enforcementAnimation(gr4);
            g.persianAdvanceTextFunction();
        }

        else if(b.equals(deployMiltiadesTacticsButton)){
           a.greekMidAnimation(gm1);
           a.greekMidAnimation(gm2);
           a.persianMidAnimation(pm1);
           a.persianMidAnimation(pm2);
           a.persianMidAnimation(pm3);
           a.persianMidAnimation(pm4);
           a.persianMidAnimation(pm5);
           a.greekLeftFlankAnimation(gl1);
           a.greekLeftFlankAnimation(gl2);
           a.greekLeftFlankAnimation(gl3);
           a.greekLeftFlankAnimation(gl4);
           a.persianLeftFlankAnimation(pl1);
           a.persianLeftFlankAnimation(pl2);
           a.persianLeftFlankAnimation(pl3);
           a.persianLeftFlankAnimation(pl4);
           a.persianLeftFlankAnimation(pl5);
           a.greekRightFlankAnimation(gr1);
           a.greekRightFlankAnimation(gr2);
           a.greekRightFlankAnimation(gr3);
           a.persianRightFlankAnimation(pr1);
           a.persianRightFlankAnimation(pr2);
           a.persianRightFlankAnimation(pr3);
           a.persianRightFlankAnimation(pr4);
           a.persianRightFlankAnimation(pr5);
           a.tacticalArrowsAnimation(battleArrow1);
           a.tacticalArrowsAnimation(battleArrow2);
           a.tacticalArrowsAnimation(battleArrow3);
           a.tacticalArrowsAnimation(battleArrow4);
           g.persianCenterFunction();
        }

        else if(b.equals(attackPersianCenterButton)){
            g.hideTextFunction();
            g.hideTacticalArrowsFunction();
            a.revealWeaponsAnimation(sword1);
            a.revealWeaponsAnimation(sword2);
            a.revealWeaponsAnimation(sword3);
            a.revealWeaponsAnimation(sword4);
            a.revealWeaponsAnimation(sword5);
            a.revealWeaponsAnimation(spear1);
            a.revealWeaponsAnimation(spear2);
            a.revealWeaponsAnimation(spear3);
            a.revealWeaponsAnimation(spear4);
            a.explosionFunction2(me1);
            a.explosionFunction2(me2);
            a.explosionFunction2(me3);
            a.explosionFunction2(me4);
            a.explosionFunction2(me5);
            a.explosionFunction2(me6);
            a.explosionFunction2(me7);
            a.explosionFunction2(me8);
            a.explosionFunction2(me9);
            a.explosionFunction2(me10);
            a.explosionFunction2(me11);
            a.explosionFunction2(me12);
            a.explosionFunction2(me13);
            a.explosionFunction2(me14);
            a.explosionFunction2(me15);
            a.explosionFunction2(me16);
            a.explosionFunction2(me17);
            a.explosionFunction2(me18);

            a.persianCenterRetreat5(pm5);
            a.persianCenterRetreat4(pm4);
            a.persianCenterRetreat3(pm3);
            a.persianCenterRetreat2(pm2);
            a.persianCenterRetreat1(pm1);

            a.greekCenterAdvance1(gm1);
            a.greekCenterAdvance1(gm2);

            a.persianLeftRetreat5(pl5);
            a.persianLeftRetreat4(pl4);
            a.persianLeftRetreat3(pl3);
            a.persianLeftRetreat2(pl2);
            a.persianLeftRetreat1(pl1);

            a.greekLeftAdvance(gl1);
            a.greekLeftAdvance(gl2);
            a.greekLeftAdvance(gl3);
            a.greekLeftAdvance(gl4);

            a.persianRightRetreat5(pr5);
            a.persianRightRetreat4(pr4);
            a.persianRightRetreat3(pr3);
            a.persianRightRetreat2(pr2);
            a.persianRightRetreat1(pr1);

            a.greekRightAdvance(gr1);
            a.greekRightAdvance(gr2);
            a.greekRightAdvance(gr3);

            a.persianCavalryRetreat(persianCavalryElipse);






        }

        else if(b.equals(battle2Button)){
           g.endOfBattleFunction();
        }
        else if(b.equals(endOfBattleButton)){
            g.pheidepedesFunction();
        }
        else if(b.equals(pheidepedesButton)){
            g.aftermathFunction();
        }
        else if(b.equals(aftermathButton)){
            g.aftermath2Function();
        }
        else if(b.equals(aftermath2Button)){
            g.triumphFunction();
        }
        else if(b.equals(playAgainButton)){
            g.playAgainFunction();
        }
        else if(b.equals(exitButton)){
            System.exit(0);
            return;
        }
        else if(b.equals(options1Button1)){
            g.advise1Function();
        }
        else if(b.equals(options1Button3)){
            g.advise1Function();
        }
        else if(b.equals(advise1Button)){
            g.returnOptions1Function();
        }
        else if(b.equals(chooseMountainsButton)){
            g.advise2Function();
        }
        else if(b.equals(chooseAthensButton)){
            g.advise2Function();
        }
        else if(b.equals(advise2Button)){
            g.returnBattlefieldsPaneFunction();
        }
        else if(b.equals(standardFormationButton)){
            g.advise3Function();
        }
        else if(b.equals(advise3Button)){
            g.returnChooseFormationFunction();
        }
        else if(b.equals(waitArrowsButton)){
            g.advise4Function();
        }
        else if(b.equals(advise4Button)){
            g.returnBattlePane4();
        }
        else if(b.equals(pressForwardButton)){
            g.advise5Function();
        }
        else if(b.equals(advise5Button)){
            g.returnBattlePane5();
        }
        else if(b.equals(holdTheLineButton)){
            g.advise6Function();
        }
        else if(b.equals(pressForward2Button)){
            g.advise6Function();
        }
        else if(b.equals(advise6Button)){
            g.returnBattlePane6();
        }
        else if(b.equals(retreatCenterButton)){
            g.advise7Function();
        }
        else if(b.equals(advise7Button)){
            g.returnBattlePane7();
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

    public AnchorPane getBattleChaosPane() {
        return battleChaosPane;
    }

    public ImageView getLeftArrow() {
        return leftArrow;
    }

    public AnchorPane getChooseFormationPane() {
        return chooseFormationPane;
    }

    public AnchorPane getBattlePane() {
        return battlePane;
    }

    public TextArea getTextArchers() {
        return textArchers;
    }

    public Button getDashButton() {
        return dashButton;
    }

    public Button getWaitButton() {
        return waitButton;
    }

    public Button getBeginBattleButton() {
        return beginBattleButton;
    }

    public ImageView getA1() {
        return a1;
    }

    public ImageView getA2() {
        return a2;
    }

    public ImageView getA3() {
        return a3;
    }

    public ImageView getA4() {
        return a4;
    }

    public ImageView getA5() {
        return a5;
    }

    public ImageView getA6() {
        return a6;
    }

    public ImageView getA7() {
        return a7;
    }

    public ImageView getA8() {
        return a8;
    }

    public ImageView getA9() {
        return a9;
    }

    public ImageView getA10() {
        return a10;
    }

    public ImageView getA11() {
        return a11;
    }

    public ImageView getA12() {
        return a12;
    }

    public ImageView getA13() {
        return a13;
    }

    public ImageView getA14() {
        return a14;
    }

    public ImageView getA15() {
        return a15;
    }

    public ImageView getA16() {
        return a16;
    }

    public ImageView getE1() {
        return e1;
    }

    public ImageView getE2() {
        return e2;
    }

    public ImageView getE3() {
        return e3;
    }

    public ImageView getE4() {
        return e4;
    }

    public ImageView getE5() {
        return e5;
    }

    public ImageView getE6() {
        return e6;
    }

    public ImageView getE7() {
        return e7;
    }

    public ImageView getE8() {
        return e8;
    }

    public ImageView getE9() {
        return e9;
    }

    public ImageView getE10() {
        return e10;
    }

    public ImageView getE11() {
        return e11;
    }

    public ImageView getE12() {
        return e12;
    }

    public ImageView getE13() {
        return e13;
    }

    public ImageView getE14() {
        return e14;
    }

    public TextArea getCavalryTextArea() {
        return cavalryTextArea;
    }

    public Text getCavalryText() {
        return cavalryText;
    }

    public Button getPressForwardButton() {
        return pressForwardButton;
    }

    public Button getRe_enforcementsButton() {
        return re_enforcementsButton;
    }

    public TextArea getPersianAdvanceTextArea() {
        return persianAdvanceTextArea;
    }

    public Text getPersianAdvanceText() {
        return persianAdvanceText;
    }

    public Button getHoldTheLineButton() {
        return holdTheLineButton;
    }

    public Button getPressForward2Button() {
        return pressForward2Button;
    }

    public Button getDeployMiltiadesTacticsButton() {
        return deployMiltiadesTacticsButton;
    }

    public TextArea getPersianCenterTextArea() {
        return persianCenterTextArea;
    }

    public Text getPersianCenterText() {
        return persianCenterText;
    }

    public Button getRetreatCenterButton() {
        return retreatCenterButton;
    }

    public Button getAttackPersianCenterButton() {
        return attackPersianCenterButton;
    }

    public ImageView getBattleArrow1() {
        return battleArrow1;
    }

    public ImageView getBattleArrow2() {
        return battleArrow2;
    }

    public ImageView getBattleArrow3() {
        return battleArrow3;
    }

    public ImageView getBattleArrow4() {
        return battleArrow4;
    }

    public AnchorPane getDariusMotivesPane() {
        return dariusMotivesPane;
    }

    public AnchorPane getAlliesHelpPane() {
        return alliesHelpPane;
    }

    public AnchorPane getArmyStrengthPane() {
        return armyStrengthPane;
    }

    public AnchorPane getEndOfBattlePane() {
        return endOfBattlePane;
    }

    public AnchorPane getPheidepedesPane() {
        return pheidepedesPane;
    }

    public AnchorPane getAftermathPane() {
        return aftermathPane;
    }

    public AnchorPane getAftermath2Pane() {
        return aftermath2Pane;
    }

    public AnchorPane getTriumphPane() {
        return triumphPane;
    }

    public AnchorPane getAdvise1Pane() {
        return advise1Pane;
    }

    public AnchorPane getAdvise2Pane() {
        return advise2Pane;
    }

    public AnchorPane getAdvise3Pane() {
        return advise3Pane;
    }

    public AnchorPane getAdvise4Pane() {
        return advise4Pane;
    }

    public AnchorPane getAdvise5Pane() {
        return advise5Pane;
    }

    public AnchorPane getAdvise6Pane() {
        return advise6Pane;
    }

    public AnchorPane getAdvise7Pane() {
        return advise7Pane;
    }

    public Button getWaitArrowsButton() {
        return waitArrowsButton;
    }

    @FXML
    private Text status;

    @FXML
    private void displayPosition (MouseEvent event){
        status.setText("X = " + event.getX() + "Y = " + event.getY());
        status.isVisible();

    }
}
