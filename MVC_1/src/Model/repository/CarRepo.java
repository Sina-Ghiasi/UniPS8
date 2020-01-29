package Model.repository;

import Model.entery.CarEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CarRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public CarRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sina","sg159753");
        connection.setAutoCommit(false);
    }
    public CarEnti select(CarEnti carEnti)throws Exception{
        preparedStatement = connection.prepareStatement("select * from cars where name=?");
        preparedStatement.setString(1,carEnti.getName());
        ResultSet resultSet =preparedStatement.executeQuery();
        if(resultSet.next()){
            carEnti.setStock(resultSet.getInt("stock"));
            carEnti.setPrice(resultSet.getInt("price"));
            return carEnti ;
        }
        throw  new Exception("not found");

    }
    public void update(CarEnti carEnti) throws Exception{
        preparedStatement = connection.prepareStatement("update cars set stock=?,price=? where name =?");
        preparedStatement.setLong(1,carEnti.getStock());
        preparedStatement.setLong(2,carEnti.getPrice());
        preparedStatement.setString(3,carEnti.getName());
        preparedStatement.executeUpdate();
    }

    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }
}
