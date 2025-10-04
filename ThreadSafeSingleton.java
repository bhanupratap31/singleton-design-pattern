package singleton;
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance; 

    ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){ 
        if(instance == null){
            instance = new ThreadSafeSingleton(); 
        }
    return instance; 
    }
}
