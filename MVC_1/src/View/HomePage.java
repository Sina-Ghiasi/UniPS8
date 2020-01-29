package View;

import Controller.CarController;
import Model.Service.CarServ;
import Model.entery.CarEnti;
import Model.entery.CarEntiBuilder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sun Dec 01 12:45:31 IRST 2019
 */



/**
 * @author sina
 */
public class HomePage extends JFrame {
    public HomePage() {
        initComponents();
    }

    public void initialize(){
        try{
            CarEnti pride = CarServ.getInstance().Show(new CarEntiBuilder().setName("pride").createCarEnti());
            CarEnti saina =CarServ.getInstance().Show(new CarEntiBuilder().setName("saina").createCarEnti());
            CarEnti tiba =CarServ.getInstance().Show(new CarEntiBuilder().setName("tiba").createCarEnti());
            l_stockTiba.setText(Integer.toString(tiba.getStock()));l_priceTiba.setText(Integer.toString(tiba.getPrice()));
            l_stockSaina.setText(Integer.toString(saina.getStock()));l_priceSaina.setText(Integer.toString(saina.getPrice()));
            l_stockPride.setText(Integer.toString(pride.getStock()));l_pricePride.setText(Integer.toString(pride.getPrice()));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void B_prideActionPerformed(ActionEvent e) {
        try{

            CarServ.getInstance().Update(new CarEntiBuilder().
                    setName("pride").
                    setStock(CarController.stock(Integer.parseInt(l_stockPride.getText())-1)).
                    setPrice(Integer.parseInt(l_pricePride.getText())).
                    createCarEnti());
            l_stockPride.setText(Integer.toString(CarServ.getInstance().Show(new CarEntiBuilder().setName("pride").createCarEnti()).getStock()));
        }catch (Exception e1){
            JOptionPane.showMessageDialog(null,e1.getMessage());
        }

    }

    private void B_sainaActionPerformed(ActionEvent e) {
        try{
            CarServ.getInstance().Update(new CarEntiBuilder().
                    setName("saina").
                    setStock(CarController.stock(Integer.parseInt(l_stockSaina.getText())-1)).
                    setPrice(Integer.parseInt(l_priceSaina.getText())).
                    createCarEnti());
            l_stockSaina.setText(Integer.toString(CarServ.getInstance().Show(new CarEntiBuilder().setName("saina").createCarEnti()).getStock()));
        }catch (Exception e1){
            JOptionPane.showMessageDialog(null,e1.getMessage());
        }


    }

    private void B_tibaActionPerformed(ActionEvent e) {
        try{
            CarServ.getInstance().Update(new CarEntiBuilder().
                    setName("tiba").
                    setStock(CarController.stock(Integer.parseInt(l_stockTiba.getText())-1)).
                    setPrice(Integer.parseInt(l_priceTiba.getText())).
                    createCarEnti());
            l_stockTiba.setText(Integer.toString(CarServ.getInstance().Show(new CarEntiBuilder().setName("tiba").createCarEnti()).getStock()));
        }catch (Exception e1){
            JOptionPane.showMessageDialog(null,e1.getMessage());
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - sina
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        l_stockPride = new JLabel();
        l_stockSaina = new JLabel();
        l_stockTiba = new JLabel();
        l_pricePride = new JLabel();
        l_priceSaina = new JLabel();
        l_priceTiba = new JLabel();
        B_pride = new JButton();
        B_saina = new JButton();
        B_tiba = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("pride");
        label1.setFont(new Font("Tahoma", Font.PLAIN, 14));

        //---- label2 ----
        label2.setText("saina");
        label2.setFont(new Font("Tahoma", Font.PLAIN, 14));

        //---- label3 ----
        label3.setText("tiba");
        label3.setFont(new Font("Tahoma", Font.PLAIN, 14));

        //---- label4 ----
        label4.setText("stock");
        label4.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- label5 ----
        label5.setText("name");
        label5.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- label6 ----
        label6.setText("price");
        label6.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- B_pride ----
        B_pride.setText("Buy");
        B_pride.addActionListener(e -> B_prideActionPerformed(e));

        //---- B_saina ----
        B_saina.setText("Buy");
        B_saina.addActionListener(e -> B_sainaActionPerformed(e));

        //---- B_tiba ----
        B_tiba.setText("Buy");
        B_tiba.addActionListener(e -> B_tibaActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                            .addGap(48, 48, 48)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(l_pricePride, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(44, 44, 44)
                                    .addComponent(l_stockPride, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                    .addGap(177, 177, 177))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(l_stockSaina, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                .addComponent(B_saina, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_priceSaina, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(l_priceTiba, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B_tiba, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)))
                            .addGap(66, 66, 66))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(l_stockTiba, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                            .addGap(77, 77, 77))))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(B_pride, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                    .addGap(58, 58, 58)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_stockPride, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_stockSaina, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_stockTiba, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addGap(56, 56, 56)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_pricePride, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_priceSaina, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_priceTiba, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(B_pride, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_saina)
                        .addComponent(B_tiba))
                    .addGap(122, 122, 122))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - sina
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel l_stockPride;
    private JLabel l_stockSaina;
    private JLabel l_stockTiba;
    private JLabel l_pricePride;
    private JLabel l_priceSaina;
    private JLabel l_priceTiba;
    private JButton B_pride;
    private JButton B_saina;
    private JButton B_tiba;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
