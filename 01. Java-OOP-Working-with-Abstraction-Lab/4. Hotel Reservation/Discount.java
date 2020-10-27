package Test;

public enum Discount {
    VIP(20),
    SECOND_VISIT(10),
    NONE(0);

    private final int percentDiscount;

    Discount(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }
}
