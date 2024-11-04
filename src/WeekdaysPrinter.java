public class WeekdaysPrinter {
    public static void main(String[] args) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Friday", "Wednesday", "Thursday", "Saturday"};

        for (String weekDay : weekDays) {
            if (!weekDay.equals("Friday") && !weekDay.equals("Saturday")) {
                System.out.println(weekDay);
            }
        }
    }
}