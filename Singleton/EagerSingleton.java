package Singleton;
public class EagerSingleton {
    private static final EagerSingleton instance= new EagerSingleton(); 

    EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance; 
    }
}
