package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstTaskTest {

    @Test
    void assertEncodingIsCorrect() {
        assertEquals("a3b4c2d", FirstTask.encodeString("aaabbbbccd"));
        assertEquals("ab4c2d", FirstTask.encodeString("abbbbccd"));
        assertEquals("ab4c2", FirstTask.encodeString("abbbbcc"));
    }

    @Test
    void assertDecodingIsCorrect() {
        assertEquals("aaabbbbccd", FirstTask.decodeString("a3b4c2d"));
        assertEquals("abbbbccd", FirstTask.decodeString("ab4c2d"));
        assertEquals("abbbbcc", FirstTask.decodeString("ab4c2"));
    }
}