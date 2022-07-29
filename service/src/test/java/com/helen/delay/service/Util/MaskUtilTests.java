package com.helen.delay.service.Util;

import com.helen.delay.shared.util.MaskUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author: 樊喆
 */
public class MaskUtilTests {

    @Test
    public void testVinMask(){
        //正常长度的vin
        String vin1 = "LSGSAXXXXXX100279";
        //少1-5位vin
        String vin2 = "LSAXXXXXX100279";
        //少5-11位vin
        String vin3 = "XXXX100279";
        //不足七位的vin
        String vin4 = "00279";
        //null或者""或者" "的vin
        String vin5 = null;
        String vin6 = "";
        String vin7 = " ";
        Assertions.assertEquals(MaskUtil.vinMask(vin1),"LSGSA******100279");
        Assertions.assertEquals(MaskUtil.vinMask(vin2),"LSA******100279");
        Assertions.assertEquals(MaskUtil.vinMask(vin3),"****100279");
        Assertions.assertEquals(MaskUtil.vinMask(vin4),vin4);
        Assertions.assertEquals(MaskUtil.vinMask(vin5),vin5);
        Assertions.assertEquals(MaskUtil.vinMask(vin6),vin6);
        Assertions.assertEquals(MaskUtil.vinMask(vin7),vin7);
    }

    @Test
    public void carLicenseNoMaskMask(){
        //正常长度的carLicenseNo
        String carLicenseNo1 = "京Nxx6H4";
        //少1-2位carLicenseNo
        String carLicenseNo2 = "京xx6H4";
        //少2-4位carLicenseNo
        String carLicenseNo3 = "x6H4";
        //不足4位的carLicenseNo
        String carLicenseNo4 = "6H4";
        //null或者""或者" "的carLicenseNo
        String carLicenseNo5 = null;
        String carLicenseNo6 = "";
        String carLicenseNo7 = " ";
        Assertions.assertEquals(MaskUtil.carLicenseNoMask(carLicenseNo1),"京N**6H4");
        Assertions.assertEquals(MaskUtil.carLicenseNoMask(carLicenseNo2),"京**6H4");
        Assertions.assertEquals(MaskUtil.carLicenseNoMask(carLicenseNo3),"*6H4");
        Assertions.assertEquals(MaskUtil.carLicenseNoMask(carLicenseNo4),carLicenseNo4);
        Assertions.assertEquals(MaskUtil.carLicenseNoMask(carLicenseNo5),carLicenseNo5);
        Assertions.assertEquals(MaskUtil.carLicenseNoMask(carLicenseNo6),carLicenseNo6);
        Assertions.assertEquals(MaskUtil.carLicenseNoMask(carLicenseNo7),carLicenseNo7);
    }
}
