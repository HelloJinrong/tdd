import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    Mommifier mommifier = new Mommifier();
    @Test
    void should_return_string_when_input_has_not_enough_vowels(){
        String str = "abcdfghij";
        final String result = mommifier.convert(str);
        assertEquals(str,result);
    }

    @Test
    void should_return_string_when_input_has_not_continuous_vowels(){
        String str = "upolela";
        final String result = mommifier.convert(str);
        assertEquals(str,result);
    }

    @Test
    void should_insert_mommy_string_when_input_meet_comditions(){
        String str = "aeiou";
        String expected = "amommyemommyimommyomommyu";
        final String result = mommifier.convert(str);
        assertEquals(expected,result);
    }
}
