package singleton; // Changed package to fix the incorrect package issue

public class EagerSingleton {
    private static final EagerSingleton instance= new EagerSingleton(); 

    EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance; 
    }
}


