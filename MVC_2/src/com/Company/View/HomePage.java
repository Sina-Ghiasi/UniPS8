/*
 * Created by JFormDesigner on Thu Dec 19 21:29:31 IRST 2019
 */

package com.Company.View;

import com.Company.Model.entry.IceCream;
import com.Company.Model.entry.IceCreamBuilder;
import com.Company.Model.service.IceCreamServ;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author sina
 */
public class HomePage extends JFrame {
    public HomePage() {
        initComponents();
    }

    public void initialize(){
        try{
            IceCream shahtoot = IceCreamServ.getInstance().Show(new IceCreamBuilder().setName("shahtoot").createIceCream());
            IceCream kim =IceCreamServ.getInstance().Show(new IceCreamBuilder().setName("kim").createIceCream());
            IceCream dogholu = IceCreamServ.getInstance().Show(new IceCreamBuilder().setName("dogholu").createIceCream());
            l_dogholoStock.setText(Integer.toString(dogholu.getStock()));l_dogholoPrice.setText(Integer.toString(dogholu.getPrice()));
            l_kimStock.setText(Integer.toString(kim.getStock()));l_kimPrice.setText(Integer.toString(kim.getPrice()));
            l_shahtootStock.setText(Integer.toString(shahtoot.getStock()));l_shahtootPrice.setText(Integer.toString(shahtoot.getPrice()));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - sina
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        l_shahtoot = new JLabel();
        l_shahtootStock = new JLabel();
        l_shahtootPrice = new JLabel();
        l_kim = new JLabel();
        l_kimStock = new JLabel();
        l_kimPrice = new JLabel();
        l_dogholo = new JLabel();
        l_dogholoStock = new JLabel();
        l_dogholoPrice = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("text");

        //---- button2 ----
        button2.setText("text");

        //---- button3 ----
        button3.setText("text");

        //---- label1 ----
        label1.setText("name");

        //---- label2 ----
        label2.setText("stock");

        //---- label3 ----
        label3.setText("price");

        //---- l_shahtoot ----
        l_shahtoot.setText("shahtoot");

        //---- l_kim ----
        l_kim.setText("kim");

        //---- l_dogholo ----
        l_dogholo.setText("dogholo");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(l_shahtoot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(l_shahtootStock, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGap(100, 100, 100))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(l_shahtootPrice, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(l_kimPrice, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_kimStock, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_kim, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                    .addGap(97, 97, 97)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_dogholoStock, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_dogholoPrice, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_dogholo, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_shahtoot, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_kim, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_dogholo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(l_shahtootStock, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_kimStock, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_dogholoStock, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(l_kimPrice, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_shahtootPrice, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_dogholoPrice, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                    .addGap(61, 61, 61))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - sina
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel l_shahtoot;
    private JLabel l_shahtootStock;
    private JLabel l_shahtootPrice;
    private JLabel l_kim;
    private JLabel l_kimStock;
    private JLabel l_kimPrice;
    private JLabel l_dogholo;
    private JLabel l_dogholoStock;
    private JLabel l_dogholoPrice;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
