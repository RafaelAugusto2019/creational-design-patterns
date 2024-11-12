package singleton.controller;

public class ClientsController {

    private String name = "";

    public String getName() throws RuntimeException{

        if (name.isEmpty()){
            throw new RuntimeException("Name can't be empty");
        }

        return name;
    }

}
