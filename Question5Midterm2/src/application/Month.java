package application;

public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("DECEMBER");
    

    private String month;

    Month(String month) {
        this.month = month;
    }

    public String toString() {
        return month;
    }
}
