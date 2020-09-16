package demo.annotation;

public class TypeParameterDemo<@TypeParameterAnnotation T> {
    public <@TypeParameterAnnotation U> T foo(T t) {
        return null;
    }
}

