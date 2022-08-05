package com.helen.delay.service.Util;

import com.helen.delay.service.util.AmountConversionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

/**
 * @Author: 樊喆
 */
public class AmountConversionUtilTests {

    @ParameterizedTest
    @CsvSource({"33651213.23,3365", "33651213,3365", "33655230,3366", "2255,0"})
    public void testVinMask(String input, BigDecimal expected){
        BigDecimal actualValue = new BigDecimal(input.toUpperCase());
        Assertions.assertEquals(AmountConversionUtil.toNumberTenThousands(actualValue),expected);
    }
}
