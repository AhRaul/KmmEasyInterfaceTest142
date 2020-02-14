package ru.reliableteam.kmmeasyinterfacetest142;

public class KmhToMsConverter implements IKmhToMsConverter {

    /**
     * CONVERT_VALUE используется при конвертации.
     * Чтобы перевести км/час в м/сек нужно поделить на 3,6;
     * Чтобы перевести м/сек в км/час нужно умножить на 3,6;
     */
    public static final double CONVERT_VALUE = 3.6;

    @Override
    public double convertKmhToMs(double value) {
        return value/CONVERT_VALUE;
    }
}
