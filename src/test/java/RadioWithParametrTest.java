import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioWithParametrTest {


    @Testt
    public void prevCarStTransitMinStation() {
        Radio radio = new Radio(15);
        radio.setCarrentStation(1);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevCarStTransitMaxStation() {
        Radio radio = new Radio(15);
        radio.setCarrentStation(15);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 14;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevCarStInrange() {
        Radio radio = new Radio(15);
        radio.setCarrentStation(5);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCarStUpperMaxStation() {
        Radio radio = new Radio(15);
        radio.setCarrentStation(15);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

   @Test
    public void NextCarSt_0() {
        Radio radio = new Radio(15);
        radio.setCarrentStation(0);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCarStUpperMinStation() {
        Radio radio = new Radio(15);
        radio.setCarrentStation(1);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

       @Test
    public void nextCarStInrange() {
        Radio radio = new Radio(15);
        radio.setCarrentStation(10);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 11;
        Assertions.assertEquals(expected, actual);
    }

      @Test
    public void UpVolume_0() {
        Radio radio = new Radio();
        radio.setCarrentVolume(0);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpVolume_110() {
        Radio radio = new Radio();
        radio.setCarrentVolume(110);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpVolume_100() {
        Radio radio = new Radio();
        radio.setCarrentVolume(100);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downeVolume_0() {
        Radio radio = new Radio();
        radio.setCarrentVolume(0);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDowneVolume_100down() {
        Radio radio = new Radio();
        radio.setCarrentVolume(100);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }
}

