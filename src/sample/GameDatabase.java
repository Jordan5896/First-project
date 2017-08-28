package sample;

import javafx.scene.text.Text;

import java.lang.reflect.Method;
import java.sql.*;

/**
 * Created by Iordanis on 08-Aug-17.
 */
public class GameDatabase {
    private static final String URL = "jdbc:mysql://localhost:3306/game_database?utoRecconect=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "58965896j";



    public void loadDatabaseFunction(Controller controller){

        try {

            Connection myconnection = DriverManager.getConnection
                    (URL, USER, PASSWORD);

            Statement mystatement = myconnection.createStatement();

            ResultSet myresult = mystatement.executeQuery("select * from player_profile order by score desc");
            int counter = 1;

            while (myresult.next()) {
                Integer score = (Integer)  myresult.getInt("score");

                //set name
                Method getName = controller.getClass().getMethod("getName" + counter, null);
                Text currentName = (Text) getName.invoke(controller);
                currentName.setText(myresult.getString("name"));
                //set score
                Method getScore = controller.getClass().getMethod("getScore" + counter, null);
                Text currentScore = (Text) getScore.invoke(controller);
                currentScore.setText(score.toString());
                //set rank
                Method getRank = controller.getClass().getMethod("getRank" + counter, null);
                Text currentRank = (Text) getRank.invoke(controller);
                currentRank.setText(myresult.getString("rank"));

                counter++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void saveToDatabase(Controller controller){

        try {
            //create connection
            Connection myconnection = DriverManager.getConnection(URL, USER, PASSWORD);

            //prepared statement
            String sqlString = "INSERT INTO player_profile (name,rank,score) VALUES (?,?,?)";
            PreparedStatement ps = myconnection.prepareStatement(sqlString);
            ps.setString(1,controller.getEnterName());
            ps.setString(2,controller.getBadge1Text().getText());
            ps.setInt(3, GameLogic.playerScore);

            //execute querry.
            int affectedRows =  ps.executeUpdate();
            System.out.println("affected rows " + affectedRows);
            myconnection.commit();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }


}
