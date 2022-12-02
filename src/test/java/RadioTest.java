import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);


        radio.next();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setCurrentRadioStationNumberMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);


        radio.next();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void VolumeQuiet() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);

        radio.prev();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeQuiet10() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);

        radio.prev();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeQuiet0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.prev();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void VolumeQuiet0Min() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);

        radio.prev();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void CurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.setMoreLoud();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);


    }

    @Test
    public void CurrentVolumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.setMoreLoud();
        int actual = radio.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void CurrentVolumeDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.setLessLoud();
        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void CurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setLessLoud();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void CurrentVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.setLessLoud();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void CurrentVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void CurrentVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setCurrentVolume(100);

        radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }
}
