package singleton.controller;

import singleton.utils.Logger;

public class ProductsController {

    private static Logger logger = Logger.getInstance();

    private int amount = 0;

    public void processOrder(){

        if (amount < 1){
            logger.log("stock less than 1");
            //send email canceling order
        }else{
            //processing order
        }

    }
}
