package chap08.Sample02;

public class Sample02 {

    public static void main(String[] args) {
        //인스턴스 변수를 사용하기 전에는 꼭 new 키워드로 인스턴스를 생성해야 합니다.
        VO vo = new VO();
        vo.name = "빵형";
        vo.age  = 21;

        System.out.printf("%s은 %d살\n", vo.name, vo.age);

        System.out.printf("%d + %d = %d", VO.ONE, VO.TWO, VO.THREE);
    }

}
