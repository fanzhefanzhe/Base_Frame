package com.helen.delay.service.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @Author: 樊喆
 */
public class AmountConversionUtil {
    /**
     * 元转万元且四舍五入取整
     * @param bigDecimal
     * @return
     */
    public static BigDecimal toNumberTenThousands(BigDecimal bigDecimal) {
        if (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) <= 0){
            return bigDecimal;
        }
        // 转换为万元（除以10000）
        BigDecimal decimal = bigDecimal.divide(new BigDecimal("10000"));
        // 保留两位小数
        DecimalFormat formater = new DecimalFormat("0");
        // 四舍五入
        formater.setRoundingMode(RoundingMode.HALF_UP);
        // 格式化完成之后得出结果
        return new BigDecimal(formater.format(decimal));
    }
}
