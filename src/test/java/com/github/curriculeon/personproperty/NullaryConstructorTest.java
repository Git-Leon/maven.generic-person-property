package com.github.curriculeon.personproperty;

import com.github.curriculeon.PersonProperty;
import org.junit.Assert;
import org.junit.Test;

public class NullaryConstructorTest {
    @Test
    public void testObject() {
        // given
        Object expected = null;

        // when
        PersonProperty personProperty = new PersonProperty();
        Object actual = personProperty.getValue();

        // then
        Assert.assertEquals(expected, actual);
    }
}
