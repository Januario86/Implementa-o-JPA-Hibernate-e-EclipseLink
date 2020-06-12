package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) {

        String driver ="mysql";
        String dataBaseAddress = "localhost:3306";
        String dataBaseName = "digital_innovation_one?useTimezone=true&serverTimezone=UTC";
        String user= "root";
        String password = "admin";



        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver)
                .append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String connectionUrl = sb.toString();

        System.out.println(connectionUrl + user + password);

        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)){
            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
        } catch (SQLException e) {
            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        }
    }


}
