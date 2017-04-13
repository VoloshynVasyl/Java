package Vasyl_Voloshyn.Task_01;

/**
 * Created by Vasyl_Voloshyn on 4/13/2017.
 */
public class Model {
    private String _hello;
    private String _world;

    // The Program logic
    public String addWords(String hello, String world){
        return hello + " " + world;
    }

    public String getHello() {
        return _hello;
    }

    public void setHello(String value) {
        _hello = value;
    }

    public String getWorld() {
        return _world;
    }

    public void setWorld(String value) {
        _world = value;
    }
}

