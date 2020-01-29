package Model.Service;

import Model.entery.CarEnti;
import Model.repository.CarRepo;

public class CarServ {
    private CarServ(){
    }
    private static CarServ carServ =new CarServ();
    public static CarServ getInstance(){
        return carServ;
    }
    public CarEnti Show(CarEnti carEnti) throws Exception{
        try(CarRepo carRepo=new CarRepo()){
            return carRepo.select(carEnti);
        }
    }
    public void Update(CarEnti carEnti)throws Exception{
        try(CarRepo carRepo = new CarRepo()){
            carRepo.update(carEnti);
        }
    }

}
