package sample;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.scene.Node;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.text.html.ImageView;

/**
 * Created by Iordanis on 05-Jul-17.
 */
public class Animation {
    Controller c = new Controller();
    public Animation(Controller c){this.c = c;}
    private static double speed = 1;

    /*move players objects up*/
    public static void moveUp(Rectangle rect){
        //rect.setY(rect.getY() - speed );
        rect.setY(rect.getY() + speed);
    }

    public void fireArrowsAnimation(Node arrow){
        arrow.setVisible(true);
        Line line = new Line();
        line.setStartX(0);
        line.setEndX(0);
        line.setStartY(10);
        line.setEndY(140);
        PathTransition t = new PathTransition();
        t.setNode(arrow);
        t.setDuration(Duration.seconds(1));
        t.setPath(line);
        t.setCycleCount(PathTransition.INDEFINITE);
        t.play();
    }

    public void explosionFunction(Node explosion){
        Random randomNumber = new Random();
        Node explosionAnimation = explosion;
        explosionAnimation.setVisible(true);
        FadeTransition ft = new FadeTransition(Duration.millis(500 + randomNumber.nextInt(1500)), explosion);
       // FadeTransition ft = new FadeTransition(Duration.millis(2000), explosion);

        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(100);
        ft.setAutoReverse(true);
        ft.play();
    }

    public void explosionFunction2(Node explosion){
        Random randomNumber = new Random();
        Node explosionAnimation = explosion;
        explosionAnimation.setVisible(true);
        FadeTransition ft = new FadeTransition(Duration.millis(500 + randomNumber.nextInt(1500)), explosion);
        // FadeTransition ft = new FadeTransition(Duration.millis(2000), explosion);

        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(7);
        ft.setAutoReverse(true);
        ft.play();
    }

    public void dashForwardAnimation(Rectangle rect) {
        rect.setVisible(true);
        Line line = new Line();
        line.setStartX(35);
        line.setEndX(35);
        line.setStartY(10);
        line.setEndY(-118);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(2));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();
    }

    public void dashForwardAnimation2(Rectangle rect, Node e) {
        rect.setVisible(true);
        Line line = new Line();
        line.setStartX(140);
        line.setEndX(140);
        line.setStartY(10);
        line.setEndY(-118);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(2));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();
        //explosionFunction(e);
    }

    public void persianCavalryAnimation(Node cavalry){
        cavalry.setVisible(true);
        Line line = new Line();
        line.setStartX(0);
        line.setEndX(-30);
        line.setStartY(10);
        line.setEndY(70);
        PathTransition t = new PathTransition();
        t.setNode(cavalry);
        t.setDuration(Duration.seconds(2));
        t.setPath(line);
        t.setCycleCount(5);
        t.play();

    }

    public void re_enforcementAnimation(Rectangle rect){
        rect.setVisible(true);
        Line line = new Line();
        line.setStartX(35);
        line.setEndX(110);
        line.setStartY(-120);
        line.setEndY(-202);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(3));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();
    }

    public void greekMidAnimation(Rectangle rect){
        rect.setVisible(true);
        Line line = new Line();
        line.setStartX(140);
        line.setEndX(140);
        line.setStartY(-118);
        line.setEndY(-34);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(5));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();
    }

    public void persianMidAnimation(Rectangle rect){
        rect.setVisible(true);
        Line line = new Line();
        line.setStartX(140);
        line.setEndX(140);
        line.setStartY(10);
        line.setEndY(90);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(5));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();
    }

    public void greekLeftFlankAnimation(Rectangle rect){
        rect.setVisible(true);
        Line line = new Line();
        line.setStartX(35);
        line.setEndX(35);
        line.setStartY(-117);
        line.setEndY(-150);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(5));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();
    }

    public void persianLeftFlankAnimation(Rectangle rect){
        rect.setVisible(true);
        Line line = new Line();
        line.setStartX(35);
        line.setEndX(35);
        line.setStartY(11);
        line.setEndY(-22);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(5));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();
    }

    public void greekRightFlankAnimation(Rectangle rect){
        rect.setVisible(true);
        Line line = new Line();
        line.setStartX(35);
        line.setEndX(35);
        line.setStartY(-118);
        line.setEndY(-130);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(5));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();
    }

    public void persianRightFlankAnimation(Rectangle rect){
        rect.setVisible(true);
        Line line = new Line();
        line.setStartX(35);
        line.setEndX(35);
        line.setStartY(11);
        line.setEndY(-1);
        PathTransition t = new PathTransition();
        t.setNode(rect);
        t.setDuration(Duration.seconds(5));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();
    }

    public void tacticalArrowsAnimation(Node arrow){
        Node arrowAnimation = arrow;
        arrowAnimation.setVisible(true);
        FadeTransition ft = new FadeTransition(Duration.millis(1000), arrow);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(10);
        ft.setAutoReverse(true);
        ft.play();
    }

    public void revealWeaponsAnimation(Node weapon){
        Node arrowAnimation = weapon;
        arrowAnimation.setVisible(true);
        FadeTransition ft = new FadeTransition(Duration.millis(1000), weapon);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(11);
        ft.setAutoReverse(true);
        ft.play();
    }

    public void persianCenterRetreat5(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(140);
                line.setEndX(140);
                line.setStartY(90);
                line.setEndY(-100);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();

                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 3 * 1000);
    }

    public void persianCenterRetreat4(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(140);
                line.setEndX(140);
                line.setStartY(90);
                line.setEndY(-130);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();

                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 5 * 1000);
    }

    public void persianCenterRetreat3(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(140);
                line.setEndX(140);
                line.setStartY(90);
                line.setEndY(-160);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();

                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 7 * 1000);
    }

    public void persianCenterRetreat2(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(140);
                line.setEndX(140);
                line.setStartY(90);
                line.setEndY(-190);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();

                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 9 * 1000);
    }

    public void persianCenterRetreat1(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(140);
                line.setEndX(140);
                line.setStartY(90);
                line.setEndY(-220);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();

                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void greekCenterAdvance1(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(140);
                line.setEndX(140);
                line.setStartY(-34);
                line.setEndY(-340);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void persianLeftRetreat5(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-22);
                line.setEndY(-90);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void persianLeftRetreat4(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-22);
                line.setEndY(-118);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void persianLeftRetreat3(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-22);
                line.setEndY(-146);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void persianLeftRetreat2(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-22);
                line.setEndY(-174);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void persianLeftRetreat1(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-22);
                line.setEndY(-202);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void greekLeftAdvance(Rectangle rect){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-150);
                line.setEndY(-330);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);

    }

    public void persianRightRetreat5(Rectangle rect){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-1);
                line.setEndY(-150);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void persianRightRetreat4(Rectangle rect){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-1);
                line.setEndY(-178);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void persianRightRetreat3(Rectangle rect){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-1);
                line.setEndY(-206);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void persianRightRetreat2(Rectangle rect){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-1);
                line.setEndY(-234);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void persianRightRetreat1(Rectangle rect){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-1);
                line.setEndY(-262);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), rect);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void greekRightAdvance(Rectangle rect){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rect.setVisible(true);
                Line line = new Line();
                line.setStartX(35);
                line.setEndX(35);
                line.setStartY(-130);
                line.setEndY(-390);
                PathTransition t = new PathTransition();
                t.setNode(rect);
                t.setDuration(Duration.seconds(5));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);
    }

    public void persianCavalryRetreat(Node cavalry){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                cavalry.setVisible(true);
                Line line = new Line();
                line.setStartX(-30);
                line.setEndX(-90);
                line.setStartY(70);
                line.setEndY(-150);
                PathTransition t = new PathTransition();
                t.setNode(cavalry);
                t.setDuration(Duration.seconds(2));
                t.setPath(line);
                t.setCycleCount(1);
                t.play();
                FadeTransition ft = new FadeTransition(Duration.millis(1000), cavalry);
                ft.setFromValue(1.0);
                ft.setToValue(0.0);
                ft.setCycleCount(7);
                ft.setAutoReverse(true);
                ft.play();
                timer.cancel();
                timer.purge();
            }
        }, 11 * 1000);

    }

    public void herodotusFunction(Node herodotus){
        Node herodotusAnimation = herodotus;
        herodotusAnimation.setVisible(true);
         FadeTransition ft = new FadeTransition(Duration.millis(7000), herodotus);

        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.setCycleCount(1);
        ft.setAutoReverse(true);
        ft.play();
    }

    public void army1Animation(Node imageGiven){
        imageGiven.setVisible(true);
        Line line = new Line();
        line.setStartX(35);
        line.setEndX(260);
        line.setStartY(11);
        line.setEndY(0);
        PathTransition t = new PathTransition();
        t.setNode(imageGiven);
        t.setDuration(Duration.seconds(8));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();

    }

    public void army2Animation(Node imageGiven){
        imageGiven.setVisible(true);
        Line line = new Line();
        line.setStartX(0);
        line.setEndX(-400);
        line.setStartY(0);
        line.setEndY(-150);
        PathTransition t = new PathTransition();
        t.setNode(imageGiven);
        t.setDuration(Duration.seconds(8));
        t.setPath(line);
        t.setCycleCount(1);
        t.play();
    }








}
