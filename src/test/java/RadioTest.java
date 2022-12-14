import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void test() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStationNumber(8);


        radio.nextStation();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test2() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStationNumber(29);


        int actual = radio.getCurrentRadioStationNumber();
        int expected = 29;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setCurrentRadioStationNumberMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);


        radio.nextStation();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void VolumeQuiet() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);

        radio.prevStation();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeQuiet10() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);

        radio.prevStation();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void VolumeQuiet0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.prevStation();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void VolumeQuiet0Min() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);

        radio.prevStation();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void CurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(106);

        radio.setMoreLoud();
        int actual = radio.getCurrentVolume();
        int expected = 100;

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
        radio.setCurrentVolume(-70);

        radio.setLessLoud();
        int actual = radio.getCurrentVolume();
        int expected = 0;

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

}
