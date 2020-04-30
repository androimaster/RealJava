package chap14;

public class Sample20 {

    /**
     * 버전 1.5부터는 toString( ) 메서드를 권장하지 않습니다.
     * 추gn 본 메서드는 제거될 수 있습니다.
     */
    @Deprecated(since="1.5", forRemoval=true)
    public String toString() {
        return "Sample20 []";
    }

}
