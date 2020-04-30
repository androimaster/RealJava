package chap07;

public class Test4 {

    public static void main(String[] args) {
        int    target = 201;  //전력 사용량
        int    basic  = 1600;  //기본요금
        float  cost   = 0;    //전력 단가
        int    vat    = 0;
        double total  = 0;  //총 누적 사용요금
        int amt = 0;       //최종 청구금액
        for(int i = 1; i <= target; i++) {
            if(i > 0 && i <= 200) {
                cost = 93.3f; 
            }
            else {
                cost = 187.9f;
            }
            total += cost; 
        }
        //기본요금 + 총 누적 사용요금
        total = basic + Math.floor(total);
        vat   = (int)Math.round(total / 10);
        amt = (int)total + vat + (int)(Math.floor((total * 0.037)/10)*10);
        amt = (int) (Math.floor(amt / 10)*10);  //10원 미만 절사
        System.out.println("청구금액 : " + amt );
    }

}
