package ru.reliableteam.kmmeasyinterfacetest142;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IKmhToMsConverterUnitTest {
    private IKmhToMsConverter testedClass = new KmhToMsConverter();

    @Test
    public void convertion_isCorrect() {
        assertEquals(1.0, testedClass.convertKmhToMs(3.6), 0.01);
    }

}
