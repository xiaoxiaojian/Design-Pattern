package Singleton;

/**
 * 饿汉模式的单例（线程安全）
 * 
 */
class HungrySingleton{
    private static HungrySingleton mStance = new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return mStance;
    }
}