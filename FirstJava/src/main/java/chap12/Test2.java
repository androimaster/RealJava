package chap12;

import java.util.EnumSet;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Test2 {
    public static void main(String[] args) {
        EnumSet<Season> seasonSet = EnumSet.allOf(Season.class);
        for(Season season : seasonSet) {
            System.out.printf("%s\n%s%s\n"
                , season.name()
                , season.getHan()
                , season.getEng() );
        }
    }
}

@AllArgsConstructor
@Getter
enum Season {
    SPRING("봄", "(Spring)"),
    SUMMER("여름", "(Summer)"),
    FALL("가을", "(Fall)"),
    WINTER("겨울", "(Winter)");

    private final String han;
    private final String eng;
}
