package o2_enums;

public enum SeasonWithConstructor {
    WINTER("dec, jan, feb"), SPRING("mar, apr, may");

    private final String months;

    private SeasonWithConstructor(String months) {
        this.months = months;
    }

    public void printMonths() {
        System.out.println(months);
    }

}
