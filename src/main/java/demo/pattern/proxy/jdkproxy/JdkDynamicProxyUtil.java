package demo.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkDynamicProxyUtil {
    public static <T>T newProxyInstance(T targetObject, InvocationHandler handler){
        ClassLoader classLoader = targetObject.getClass().getClassLoader();
        Class<?>[]  interfaces = targetObject.getClass().getInterfaces();
        return (T)Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
