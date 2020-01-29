package com.Company.Model.repository;

import com.Company.Model.entry.IceCream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IceCreamRepo implements AutoCloseable{

    private Connection connection;
    private PreparedStatement preparedStatement;
    public IceCreamRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sina","sg159753");
        connection.setAutoCommit(false);
    }
    public IceCream select(IceCream iceCream)throws Exception{
        preparedStatement = connection.prepareStatement("select * from icecreams where name=?");
        preparedStatement.setString(1,iceCream.getName());
        ResultSet resultSet =preparedStatement.executeQuery();
        if(resultSet.next()){
            iceCream.setStock(resultSet.getInt("stock"));
            iceCream.setPrice(resultSet.getInt("price"));
            return iceCream ;
        }
        throw  new Exception("not found");

    }
    public void update(IceCream iceCream) throws Exception{
        preparedStatement = connection.prepareStatement("update icecreams set stock=?,price=? where name =?");
        preparedStatement.setLong(1,iceCream.getStock());
        preparedStatement.setLong(2,iceCream.getPrice());
        preparedStatement.setString(3,iceCream.getName());
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
