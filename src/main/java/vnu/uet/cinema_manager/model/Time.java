package vnu.uet.cinema_manager.model;

public enum Time {

    CASE_1("7:30 AM - 9:30 AM"),
    CASE_2("10:30 AM - 12:30 AM"),
    CASE_3("1:30 PM - 3:30 PM"),
    CASE_4("4:30 PM - 5:30 PM"),
    CASE_5("6:30 PM - 8:30 PM"),
    CASE_6("9:30 PM - 11:30 PM");
    
    private String s;

    Time(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public static String getString(Time Time) {
        for (Time s : Time.values()) {
            if (s.equals(Time)) {
                return s.getS();
            }
        }
        return CASE_1.getS();
    }

    public static Time convertToEnum(String str) {
        for (Time s : Time.values()) {
            if (str.equals(s.toString())) {
                return s;
            }
        }
        return CASE_1;
    }
}
