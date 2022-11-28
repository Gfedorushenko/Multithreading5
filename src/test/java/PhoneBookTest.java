import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void addTest() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Vova", "+799977777777"));
    }

    @Test
    public void findByNumberTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vova", "+799977777777");
        assertEquals("Vova", phoneBook.findByNumber("+799977777777"));
    }
}
