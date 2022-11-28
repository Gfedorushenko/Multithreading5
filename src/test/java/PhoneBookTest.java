import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {
    @Test
    public void addTest() {
        PhoneBook phoneBook = new PhoneBook();
        assertTrue(phoneBook.add("Vova", "+799977777777"));
    }
}
