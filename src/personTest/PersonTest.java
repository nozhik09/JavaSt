package personTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test// указывает мто метод явл тестовым
    public void testAdition() {
        int result = 2 + 2;
        Assertions.assertEquals(4, result);
        Assertions.assertNotEquals(5, result);// тест будет пройден если не ожидаемый рез не совпадет с факт
        Assertions.assertTrue(4 == result);
        assertFalse(5 == result);
        assertNull(null);
        assertNotNull("String");
    }


}