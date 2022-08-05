package com.helen.delay.service.Util;

import com.helen.delay.service.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Slf4j
public final class DateUtilTests {
    @Test
    public void testLocalDateToStr(){
        LocalDate date = LocalDate.of(2022, 2, 28);
        String s = DateUtil.localDateToStr(date, null);
        Assertions.assertEquals(s, "2022-02-28");
    }

    @Test
    public void testLocalDateTimeToStr(){
        LocalDateTime datetime = LocalDateTime.of(2022, 2, 28, 13, 23, 57);
        String s = DateUtil.localDateTimeToStr(datetime, null);
        Assertions.assertEquals(s, "2022-02-28 13:23:57");
    }

    @Test
    public void testGetDaysByExpiredTime(){
        String datetime = "2058-04-01 00:00:00";
        Long days = DateUtil.getDaysByExpiredTime(datetime);
//        Assertions.assertEquals(days, 13113L);
        assert days > 0;
    }

}
