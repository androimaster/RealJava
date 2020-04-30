package chap14;

import static java.lang.annotation.ElementType.TYPE_PARAMETER;

import java.lang.annotation.Target;

import lombok.Getter;
import lombok.Setter;

public class Sample12 { }

@Getter
@Setter
class Person<@NullTest T> {
    private T t;
}

@Target(TYPE_PARAMETER)
@interface NullTest { }
