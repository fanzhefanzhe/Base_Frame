package com.helen.delay.shared.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 数据处理工具类
 * @Author: 樊喆
 */
public class MaskUtil {
    /**
     * 根据起始位置和长度（倒数位数）脱敏
     * @param unmaskStr
     * @param mostRightMaskIndex
     * @param maskLength
     * @return
     */
    public static String mask(String unmaskStr, int mostRightMaskIndex, int maskLength) {
        if (StringUtils.isBlank(unmaskStr) || unmaskStr.length() < mostRightMaskIndex) {
            return unmaskStr;
        }
        int endPos = unmaskStr.length() - mostRightMaskIndex + 1;
        int startPos = Math.max(endPos - maskLength, 0);
        return StringUtils.join(unmaskStr.substring(0, startPos), "*".repeat(endPos - startPos), unmaskStr.substring(endPos));
    }

    public static void main(String[] args) {
        System.out.println("carLicenseNoMask(\"         \") = " + carLicenseNoMask("a         "));
    }

    /**
     * 车架号脱敏：倒数第七位起往前六位用*代
     * @param vin
     * @return
     */
    public static String vinMask(String vin){
        return mask(vin , 7 , 6);
    }

    /**
     * 车牌号脱敏：倒数第四位起往前两位用*代替
     * @param carLicenseNo
     * @return
     */
    public static String carLicenseNoMask(String carLicenseNo){
        return mask(carLicenseNo , 4 , 2);
    }

}
