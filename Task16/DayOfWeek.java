package Task16;

public enum DayOfWeek {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

    public static int numberOfWorkingDays(DayOfWeek days[]) {
        int count = 0;
        for(DayOfWeek day:days) {
            if(day != SATURDAY && day != SUNDAY) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        DayOfWeek[] days = {DayOfWeek.SUNDAY, DayOfWeek.FRIDAY, DayOfWeek.MONDAY};//DayOfWeek.values();
        System.out.println(numberOfWorkingDays(days));
    }
}


