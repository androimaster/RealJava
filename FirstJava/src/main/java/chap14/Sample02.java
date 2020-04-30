package chap14;

import static java.lang.annotation.RetentionPolicy.SOURCE;
import java.lang.annotation.Retention;

@Sample02Anno
public class Sample02 {
    @Sample02Anno
    public void test() { }
}

@Retention(SOURCE)
@interface Sample02Anno { }
