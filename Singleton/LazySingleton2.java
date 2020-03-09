package Singleton;
/**
 * 懒汉模式的单例（线程安全）
 * 双重检测锁机制 （效率高）
 */
class LazySingleton2 {
    private static volatile LazySingleton2 mStance;
    private LazySingleton2(){

    }
    public static LazySingleton2 getInstance(){
        if(mStance == null){
            synchronized(LazySingleton2.class){
                if(mStance == null){
                    mStance = new LazySingleton2();
                }
            }
        }
        return mStance;
    }
}