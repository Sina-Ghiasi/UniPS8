package com.Company;

import com.Company.Model.entry.IceCreamBuilder;
import com.Company.Model.service.IceCreamServ;
import com.Company.View.HomePage;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            IceCreamServ.getInstance().Update(new IceCreamBuilder().setName("shahtoot").setStock(20).setPrice(5000).createIceCream());
            IceCreamServ.getInstance().Update(new IceCreamBuilder().setName("kim").setStock(20).setPrice(1000).createIceCream());
            IceCreamServ.getInstance().Update(new IceCreamBuilder().setName("dogholu").setStock(20).setPrice(3000).createIceCream());

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"initialize problem happened !");
        }

        HomePage homePage =new HomePage();
        homePage.initialize();
        homePage.setVisible(true);
    }
}
