package o2_enums;

public enum SeasonWithConstructor {
    WINTER("dec, jan, feb"), SPRING("mar, apr, may");

    private String months;

    SeasonWithConstructor(String months) {
        this.months = months;
    }

    public void setMonths(String newMonths) {
        this.months = newMonths;
    }

    public void printMonths() {
        System.out.println(months);
    }

}
