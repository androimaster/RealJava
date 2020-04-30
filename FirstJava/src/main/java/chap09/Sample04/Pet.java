package chap09.Sample04;

public abstract class Pet {
    private boolean wing;
    private int legCount;

    public String isWing() {
        String str;
        if(this.wing) {
            str = "날 수 있다";
        }
        else {
            str = "날 수 없다";
        }

        return str;
    }

    public int getLegCount() {
        return legCount;
    }

    public Pet(boolean wing, int legCount) {   //생성자.. 이 클래스를 상속받으면 꼭 구현해야 함
        this.wing = wing;
        this.legCount = legCount;
    }

    public abstract void run(String name);
}
