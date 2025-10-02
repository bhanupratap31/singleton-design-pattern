package Singleton;

public class test {
    public static void main(String args[]){
        LazySingleton ins= new LazySingleton(); 
        ThreadSafeSingleton ins1 = new ThreadSafeSingleton();
        DoubleCheckedLocking ins2 = new DoubleCheckedLocking(); 
        EagerSingleton ins3 = new EagerSingleton();
        BillPugh ins4 = new BillPugh();
        StaticBlock ins5 = new StaticBlock();

        System.out.println("Lazy:" + " " +ins.getInstance());
        System.out.println("Safe:" + " " +ins1.getInstance());
        System.out.println("DoubleCheck: " + " " +ins2.getInstance());
        System.out.println("Eager:" + " " + ins3.getInstance());
        System.out.println("Bill:" + " "+ ins4.getInstance());
        System.out.println("Static:" + " "+ ins5.getInstance());
    }
}