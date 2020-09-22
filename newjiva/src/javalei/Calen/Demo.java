package javalei.Calen;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//多态
        System.out.println(c);//java.util.GregorianCalendar
        // [time=1600774851398,areFieldsSet=true,areAllFieldsSet=true,
        // lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",
        // offset=28800000,dstSavings=0,useDaylight=false,transitions=31,
        // lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,
        // MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=266,DAY_OF_WEEK=3,
        // DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=40,SECOND=51,MILLISECOND=398,
        // ZONE_OFFSET=28800000,DST_OFFSET=0]
       //打印的不是地址，说明这个类重写了toString类
    }
}
