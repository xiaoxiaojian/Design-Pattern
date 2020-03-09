package Singleton;
/**
 * 懒汉模式的单例（线程安全）
 * 但是效率不高
 */
class LazySingleton1 {
    private static LazySingleton1 mStance;
    private LazySingleton1(){

    }
    public static synchronized LazySingleton1 getInstance(){
        if(mStance == null){
            mStance = new LazySingleton1();
        }
        return mStance;
    }
}