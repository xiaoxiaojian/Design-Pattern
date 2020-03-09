package Singleton;
/**
懒汉模式的单例（线程不安全）
*/
class LazySingleton{
    private static LazySingleton mStance;
    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(mStance == null){
            mStance = new LazySingleton();
        }
        return mStance;
    }
}