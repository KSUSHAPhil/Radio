import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void findMaxStation() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(15);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void findMaxVolume() {
        Radio radio = new Radio(10);

        radio.setCurrentVolume(15);

        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    void nextStation() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(9);

        radio.next();

        radio.getCurrentStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(0);

        radio.prev();

        radio.getCurrentStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void plusVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        radio.getCurrentVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void minusVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        radio.getCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }
}
