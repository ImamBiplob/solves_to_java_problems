package JavaEnums;

public enum DayOfWeek {
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);

    private final int label;

    DayOfWeek(int label) {
        this.label = label;
    }

    public static int numberOfWorkingDays(DayOfWeek[]days) {
        int count = 0;
        for(DayOfWeek day:days) {
            if(day != SATURDAY && day != SUNDAY) count++;
        }

        return count;
    }

    public static DayOfWeek getDayByLabel(int label) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.label == label) {
                return day;
            }
        }
        return null;
    }

    public static int getLabelByDay(DayOfWeek day) {
        return day.label;
    }

    public static void main(String[] args) {
        DayOfWeek[] days = {DayOfWeek.SUNDAY, DayOfWeek.FRIDAY, DayOfWeek.MONDAY};//DayOfWeek.values();
        System.out.println(numberOfWorkingDays(days));

        System.out.println(getDayByLabel(3));

        System.out.println(getLabelByDay(TUESDAY));
    }
}