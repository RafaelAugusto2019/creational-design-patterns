package singleton;

import singleton.controller.ClientsController;
import singleton.controller.ProductsController;
import singleton.utils.Logger;

public class MainSingleton {

    private static Logger logger = Logger.getInstance();

    public static void main(String [] args){

        ClientsController clientsController = new ClientsController();
        ProductsController productsController = new ProductsController();

        try{
            clientsController.getName();
        }catch (Exception e){
            logger.log(e.getMessage());
        }

        productsController.processOrder();


    }

}
