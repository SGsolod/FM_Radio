import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class RadioTest {
    @ParameterizedTest
    @ValueSource(ints = {-1, 10})
    public void shouldNotExistChannel(int newNumberRadioStation) {
        FMRadio rad = new FMRadio();
        rad.setNumberRadioStation(newNumberRadioStation);

        int expected = 0;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    // или так

    private static Stream<Arguments> provideNotExistingNumbers() {
        return Stream.of(
                Arguments.of(-1),
                Arguments.of(10)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNotExistingNumbers")
    public void shouldNotExistChannel1(int newNumberRadioStation) {
        FMRadio rad = new FMRadio();
        rad.setNumberRadioStation(newNumberRadioStation);

        int expected = 0;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

}
