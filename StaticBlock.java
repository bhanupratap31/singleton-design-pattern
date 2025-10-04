package singleton;
public class StaticBlock {
    private static StaticBlock instance; 

    StaticBlock() {}

    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception while creating the instance");
        }
    }

    public static StaticBlock getInstance(){
        return instance;
    }
}
