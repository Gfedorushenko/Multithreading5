import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

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

    @Test
    public void findByNameTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vova", "+799977777777");
        assertEquals("+799977777777", phoneBook.findByName("Vova"));
    }

    @Test
    public void printAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vova", "+799977777777");
        phoneBook.add("Anna", "+799977777778");

        HashSet<String> expected = new HashSet<String>();
        expected.add("Anna");
        expected.add("Vova");

        assertEquals(expected, phoneBook.printAllNames());
    }
}
