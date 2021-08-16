public static int numberOfLeapYears(int year1, int year2){
    int year = year1;
    int leap_year_count = 0;
    while(year <= year2){
        if (isLeapYear(year) == true){
            leap_year_count += 1;
        }
        year += 1;
        }

    return leap_year_count
}

public static int dayOfWeek(int month, int day, int year){
    int dayValue = dayOfYear(month, day, year);
    int dayVal = dayValue % 6;
    day = firstDayOfYear + dayVal;
    if (day == 7)
        {day = 0;}
    if (day == 8)
        {day = 1;}
    return day
        }