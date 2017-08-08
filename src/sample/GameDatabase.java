package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Iordanis on 08-Aug-17.
 */
public class GameDatabase {
    Controller controller = new Controller();
    public GameDatabase(Controller controller) {
        this.controller = controller;
    }


    public void databaseFunction(){

        try {

            Connection myconnection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/game_database?utoRecconect=true&useSSL=false", "root", "58965896j");

            Statement mystatement = myconnection.createStatement();

            ResultSet myresult = mystatement.executeQuery("select * from player_profile");

            while (myresult.next()) {
                System.out.println(myresult.getString("name") +
                        myresult.getString("rank") + myresult.getInt("score")) ;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void saveToDatabase(){

        try {

            Connection myconnection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/game_database?utoRecconect=true&useSSL=false", "root", "58965896j");

            Statement mystatement = myconnection.createStatement();

            ResultSet myresult = mystatement.executeQuery("insert into player_profile (name,rank,score) " +
                    "values('"+ controller.getEnterName()+"', 'marshal',"+GameLogic.playerScore+")");

            while (myresult.next()) {
                System.out.println(myresult.getString("name") +
                        myresult.getString("rank") + myresult.getInt("score")) ;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }


}
