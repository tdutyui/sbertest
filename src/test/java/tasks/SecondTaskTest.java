package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SecondTaskTest {

    @Test
    void assertTwoStringsAreAnagrams() {
        assertTrue(SecondTask.areAnagrams("сосна", "насос"));
        assertTrue(SecondTask.areAnagrams("рано", "нора"));
        assertTrue(SecondTask.areAnagrams("кот", "ток"));
    }

    @Test
    void assertTwoStringsAreNotAnagrams() {
        assertFalse(SecondTask.areAnagrams("джава", "кофе"));
        assertFalse(SecondTask.areAnagrams("рука", "кора"));
        assertFalse(SecondTask.areAnagrams("дом", "лом"));
    }
}