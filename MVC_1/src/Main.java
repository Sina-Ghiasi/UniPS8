import Model.Service.CarServ;
import Model.entery.CarEntiBuilder;
import View.HomePage;

import javax.swing.*;

public class Main {
    public static void main (String[] args) {
        try{
            CarServ.getInstance().Update(new CarEntiBuilder().setName("pride").setStock(20).setPrice(52000000).createCarEnti());
            CarServ.getInstance().Update(new CarEntiBuilder().setName("tiba").setStock(20).setPrice(65000000).createCarEnti());
            CarServ.getInstance().Update(new CarEntiBuilder().setName("saina").setStock(20).setPrice(70000000).createCarEnti());

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"initialize problem happened !");
        }
        HomePage homePage =new HomePage();
        homePage.initialize();
        homePage.setVisible(true);
    }
}
