package TelRan.userHW.test;
import TelRan.userHW.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class UserTest {
    User user;
    String email = "peter@gmail.com";
    String password = "1234";

    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }


    @Test
    void testSingleAt_Positive() {
        user.setEmail("newuser@example.com");
        assertEquals("newuser@example.com", user.getEmail());
    }

    @Test
    void testDotAfterAt_Positive() {
        user.setEmail("user@example.com");
        assertEquals("user@example.com", user.getEmail());
    }

    @Test
    void testMinDomainLength_Positive() {
        user.setEmail("user@example.co");
        assertEquals("user@example.co", user.getEmail());
    }

    @Test
    void testAllowedSymbols_Positive() {
        user.setEmail("pe_et-123@yahoo.com");
        assertEquals("pe_et-123@yahoo.com", user.getEmail());
    }


    @Test
    void testSingleAt_Negative_NoAt() {
        user.setEmail("peret.gmail.com");
        assertEquals(email, user.getEmail());
    }

    @Test
    void testSingleAt_Negative_MultipleAt() {
        user.setEmail("peret@yah@oo.com");
        assertEquals(email, user.getEmail());
    }

    @Test
    void testDotAfterAt_Negative_NoDot() {
        user.setEmail("user@examplecom");
        assertEquals(email, user.getEmail());
    }

    @Test
    void testMinDomainLength_Negative_ShortDomain() {
        user.setEmail("user@example.c");
        assertEquals(email, user.getEmail());
    }

    @Test
    void testAllowedSymbols_Negative_ForbiddenSymbols() {
        user.setEmail("pe!et@yahoo.com");
        assertEquals(email, user.getEmail());

        user.setEmail("pe#et@yahoo.com");
        assertEquals(email, user.getEmail());
    }
}