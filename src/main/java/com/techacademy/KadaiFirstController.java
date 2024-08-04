package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        // 20240805
        String nen = val1.substring(0, 4);
        String tuki = val1.substring(4, 6);
        String day = val1.substring(6, 8);

        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.YEAR, Integer.parseInt(nen));
        cl.set(Calendar.MONTH, Integer.parseInt(tuki) - 1);
        cl.set(Calendar.DATE, Integer.parseInt(day));

        String youbi = "";
        switch (cl.get(Calendar.DAY_OF_WEEK)) {
        case Calendar.SUNDAY: // Calendar.SUNDAY:1
            // 日曜日
            youbi = "Sunday";
            break;
        case Calendar.MONDAY: // Calendar.MONDAY:2
            // 月曜日
            youbi = "Monday";
            break;
        case Calendar.TUESDAY: // Calendar.TUESDAY:3
            // 火曜日
            youbi = "Tuesday";
            break;
        case Calendar.WEDNESDAY: // Calendar.WEDNESDAY:4
            // 水曜日
            youbi = "Wednesday";
            break;
        case Calendar.THURSDAY: // Calendar.THURSDAY:5
            // 木曜日
            youbi = "Thursday";
            break;
        case Calendar.FRIDAY: // Calendar.FRIDAY:6
            // 金曜日
            youbi = "Friday";
            break;
        case Calendar.SATURDAY: // Calendar.SATURDAY:7
            // 土曜日
            youbi = "Saturday";
            break;
        }
        
        return youbi;
    }
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable double val1,@PathVariable double val2) {
        double res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable double val1,@PathVariable double val2) {
        double res = 0;
        res = val1 - val2;
        return "計算結果：" + res;
    }
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable double val1,@PathVariable double val2) {
        double res = 0;
        res = val1 * val2;
        return "計算結果：" + res;
}
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable double val1,@PathVariable double val2) {
        double res = 0;
        res = val1 / val2;
        return "計算結果：" + res;
    }
}

