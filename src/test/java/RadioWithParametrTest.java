import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioWithParametrTest {


    @Test
    public void prevCarStTransitLover_8() {
        RadioWithParametr radio = new RadioWithParametr(8);
        radio.setCarrentStation(8);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevCarStTransitLoverLimit_1() {
        RadioWithParametr radio = new RadioWithParametr(8);
        radio.setCarrentStation(1);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevCarStTransitLover_Limit_1() {
        RadioWithParametr radio = new RadioWithParametr(8);
        radio.setCarrentStation(2);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCarStTransitUpperLimit() {
        RadioWithParametr radio = new RadioWithParametr(10);
        radio.setCarrentStation(10);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextCarSt_0() {
        RadioWithParametr radio = new RadioWithParametr(9);
        radio.setCarrentStation(0);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCarStTransitUpper_Limit() {
        RadioWithParametr radio = new RadioWithParametr(9);
        radio.setCarrentStation(1);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCarStBeyond_Limit() {
        RadioWithParametr radio = new RadioWithParametr(10);
        radio.setCarrentStation(10);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCarStBeyondLimit() {
        RadioWithParametr radio = new RadioWithParametr(10);
        radio.setCarrentStation(11);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextCarStNeganiv() {
        RadioWithParametr radio = new RadioWithParametr(9);
        radio.setCarrentStation(-1);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpVolume_0() {
        RadioWithParametr radio = new RadioWithParametr(8);
        radio.setCarrentVolume(0);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpVolume_110() {
        RadioWithParametr radio = new RadioWithParametr(5);
        radio.setCarrentVolume(110);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpVolume_100() {
        RadioWithParametr radio = new RadioWithParametr(5);
        radio.setCarrentVolume(100);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downeVolume_0() {
        RadioWithParametr radio = new RadioWithParametr(5);
        radio.setCarrentVolume(0);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDowneVolume_100down() {
        RadioWithParametr radio = new RadioWithParametr(5);
        radio.setCarrentVolume(100);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDowneVolume_negdown() {
        RadioWithParametr radio = new RadioWithParametr(5);
        radio.setCarrentVolume(-1);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}

