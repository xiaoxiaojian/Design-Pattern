package Singleton;
/**
 * 懒汉模式的单例（线程安全）
 * 静态内部类方式 （效率高）
 */
class LazySingletonInnerClass {
    private LazySingletonInnerClass(){

    }
    static class InnerClass{
        public final static LazySingletonInnerClass mStance = new LazySingletonInnerClass();
    }
    public static LazySingletonInnerClass getInstance(){
        return InnerClass.mStance;
    }
}