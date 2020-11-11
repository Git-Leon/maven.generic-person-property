package com.github.curriculeon.personproperty;

import com.github.curriculeon.PersonProperty;
import org.junit.Assert;
import org.junit.Test;

public class ParameterizeConstructorTest {
    @Test
    public void testString() {
        // given
        String expected = "String test";

        // when
        PersonProperty personProperty = new PersonProperty(expected);
        String actual = (String)personProperty.getValue();

        // then
        Assert.assertEquals(expected, actual);
    }
}