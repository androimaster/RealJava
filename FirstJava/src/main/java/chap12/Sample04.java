package chap12;

public class Sample04 {

    public static void main(String[] args) {		
        System.out.printf("허수아비가 %s의 %s 티를 입고 있습니다.", Size2.LARGE, Color2.RED);
    }

}

// 색 집합
enum Color2 {
    RED {
        @Override
        public String toString() {
            return "빨간색";
        }
    },
    BLUE {
        @Override
        public String toString() {
            return "파란색";
        }
    },
    ORANGE {
        @Override
        public String toString() {
            return "귤색";
        }
    };  //세미콜론을 붙였음
}

// 크기 집합
enum Size2 {
    SMALL{
        @Override
        public String toString() {
            return "작은 사이즈";
        }
    }, 
    MIDIUM {
        @Override
        public String toString() {
            return "중간 사이즈";
        }
    },
    LARGE {
        @Override
        public String toString() {
            return "큰 사이즈";
        }
    };  //세미콜론을 붙였음
}
