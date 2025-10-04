package singleton;
class LazySingleton { 
    private static LazySingleton instance; 

    LazySingleton(){}

    public static LazySingleton getInstance (){
        if(instance==null){
            instance = new LazySingleton(); 
        }
        return instance; 
    }
}