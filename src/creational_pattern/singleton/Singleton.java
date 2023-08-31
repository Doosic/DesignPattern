package creational_pattern.singleton;

public enum Singleton {

    INSTANCE;


    /*
    이중 잠금
    private volatile Singleton instance;

    private Singleton(){}

    public Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class) {
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }*/

    /*
    Lazy Holder
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return singleInstanceHolder.INSTANCE;
    }*/

    /*
    정적 멤버
    private final static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }*/

    /*
    synchronized
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }*/

    /*
    단순한 메서드 호출
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }*/
}
