package com.mall.util;

import java.math.BigDecimal;

public class BigDecimalUtil {

    private BigDecimalUtil() {
    }

    public static BigDecimal add(double v1, double v2) {
        BigDecimal a = new BigDecimal(Double.toString(v1));
        BigDecimal b = new BigDecimal(Double.toString(v2));
        return a.add(b);
    }

    public static BigDecimal sub(double v1, double v2) {
        BigDecimal a = new BigDecimal(Double.toString(v1));
        BigDecimal b = new BigDecimal(Double.toString(v2));
        return a.subtract(b);
    }


    public static BigDecimal mul(double v1, double v2) {
        BigDecimal a = new BigDecimal(Double.toString(v1));
        BigDecimal b = new BigDecimal(Double.toString(v2));
        return a.multiply(b);
    }

    public static BigDecimal div(double v1, double v2) {
        BigDecimal a = new BigDecimal(Double.toString(v1));
        BigDecimal b = new BigDecimal(Double.toString(v2));
        // 四舍五入,保留2位小数
        return a.divide(b, 2, BigDecimal.ROUND_HALF_UP);
    }

}
