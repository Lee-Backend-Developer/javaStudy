package break_continue.cafe;

public class Cafe {
    public static Long cafeNoPlus = 1L; // 고유 번호 아이디 생성기
    private Long cafeNo = 0L;
    private String cafeName;

    public Cafe(String cafeName) {
        this.cafeName = cafeName;
        this.cafeNo = cafeNoPlus;
        cafeNoPlus++;
    }

    public Long getCafeNo() {
        return cafeNo;
    }

    public String getCafeName() {
        return cafeName;
    }

}
