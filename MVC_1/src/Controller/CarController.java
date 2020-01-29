package Controller;

public class CarController {

    public static int stock(int stock) throws Exception{
        if(stock<0){
            throw new Exception("stock is empty");
        }
        return stock;
    }
}
