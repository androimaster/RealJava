package chap12;

import java.util.EnumSet;

public class Sample06 {
    public static void main(String[] args) {
        System.out.println("=== 우리 동물원에 있는 조류의 수 ===");
        for(BIRD bird : BIRD.values()) {
            System.out.printf("%s, %d 마리\n", bird.getName(), bird.getCount()); //bird 정보를 하나하나 출력
        }

        System.out.println("\n=== remove an eagle");
        EnumSet<BIRD> birds = EnumSet.allOf( BIRD.class );                      //모든 열거셋을 가져옴
        birds.remove(BIRD.EAGLE);                                               //독수리 제거
        for(BIRD bird : birds) {
            System.out.printf("%s, %d 마리\n", bird.getName(), bird.getCount()); //bird 정보를 하나하나 출력
        }

        System.out.println("\n=== add an eagle");
        birds.add(BIRD.EAGLE);                                                  //독수리 추가
        for(BIRD bird : birds) {
            System.out.printf("%s, %d 마리\n", bird.getName(), bird.getCount()); //bird 정보를 하나하나 출력
        }

    }
}

enum BIRD {
    SPARROW("참새", 33), PARROT("앵무새", 27), EAGLE("독수리", 2), FALCON("매", 8);

    private final String name;   //한글이름
    private final int    count;  //마리수

    private BIRD(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

}
