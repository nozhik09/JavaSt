package lesson_28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    Member member;
    String startEmail = "jihn@test.com";
    String startPassword = "qWerty1Q$";

    @BeforeEach
    void setUp() {
        member = new Member(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";
        System.out.println("getEmail after: " + member.getEmail());

        member.setEmail(validEmail);

        System.out.println("getEmail before: " + member.getEmail());
        Assertions.assertEquals(validEmail, member.getEmail());
    }

    @Test
    void testValidPassword() {
        String validPassword = "Sdfasd123$dsDS";
        System.out.println("VaildPassword Befor: " + member.getPassword());
        member.setPassword(validPassword);
        System.out.println("Passord after " + member.getPassword());
        Assertions.assertEquals(validPassword, member.getPassword());


    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    public void testSetInvalidEmail(String email) {
        member.setEmail(email);
        Assertions.assertEquals(startEmail, member.getEmail());


    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "test@@email.net",
                "test@emailnet",
                "test@@email.net",
                "test@.email.net",
                "test@emailne.t",
                "te%st @email.net",
                "@test.email.net",
                "test@emal.net"


        );

    }
}
