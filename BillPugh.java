package singleton; // Changed back to original case

public class BillPugh {
    BillPugh(){}

    private static class SingletonHelper{
        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance(){
        return SingletonHelper.instance; 
    }
}
