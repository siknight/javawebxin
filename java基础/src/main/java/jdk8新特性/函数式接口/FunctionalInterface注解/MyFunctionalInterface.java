package jdk8新特性.函数式接口.FunctionalInterface注解;

/**
 * 只有一个抽象方法的接口叫做函数式接口
 * 加上注解作为限定
 */
@FunctionalInterface
public interface MyFunctionalInterface {
     void method();
}
