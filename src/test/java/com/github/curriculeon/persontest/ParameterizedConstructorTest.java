package com.github.curriculeon.persontest;

import com.github.curriculeon.PersonProperty;
import org.junit.Assert;

import java.util.Date;

public class ParameterizedConstructorTest {
    private void test(Long expectedId, String expectedName, Date expectedBirthDate) {
        // given
        Object expected = null;

        // when
        PersonProperty personProperty = new PersonProperty();
        Object actual = personProperty.getValue();

        // then
        Assert.assertEquals(expectedId, actual);
    }

}
