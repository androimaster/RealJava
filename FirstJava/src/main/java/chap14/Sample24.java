package chap14;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value() default 0;
}

@Getter
@Setter
@AllArgsConstructor
class Score {
    @MaxLength(5)
    public String name;
    public int    no;
    public int    korean;
    public int    english;
    public int    math;
}

public class Sample24 {
    public static void main(String[] args) throws Exception {
        Validator checker = new Validator();
        Score score = new Score("bbanghyung", 1, 20, 30, 100);
        checker.excute(score);
    }
}

class Validator {
    public void excute(Score score) throws Exception {
        //Score 객체의 모든 필드를 가져온다. 단, 접근제어자가 public에 한한다.
        Field[] fields = score.getClass().getFields();
        for(Field field : fields) {
            //MaxLength 애너테이션이 있는지 확인한다.
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength anno = field.getAnnotation(MaxLength.class);
                int AnnoMax = anno.value();
                int NameMax = field.get(score).toString().length();
                if(NameMax > AnnoMax) 
                    System.out.printf("%s 필드의 최대 글자수는 %d자 입니다. 입력한 문자[%s]\n"
                        , field.getName(), AnnoMax, field.get(score).toString());
            }
        }
    }
}
