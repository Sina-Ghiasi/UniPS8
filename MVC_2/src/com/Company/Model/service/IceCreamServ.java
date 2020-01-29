package com.Company.Model.service;

import com.Company.Model.entry.IceCream;
import com.Company.Model.repository.IceCreamRepo;

public class IceCreamServ {
    private IceCreamServ(){
    }
    private static IceCreamServ iceCreamServ =new IceCreamServ();
    public static IceCreamServ getInstance(){
        return iceCreamServ;
    }
    public IceCream Show(IceCream iceCream) throws Exception{
        try(IceCreamRepo iceCreamRepo=new IceCreamRepo()){
            return iceCreamRepo.select(iceCream);
        }
    }
    public void Update(IceCream iceCream)throws Exception{
        try(IceCreamRepo iceCreamRepo = new IceCreamRepo()){
            iceCreamRepo.update(iceCream);
        }
    }

}
