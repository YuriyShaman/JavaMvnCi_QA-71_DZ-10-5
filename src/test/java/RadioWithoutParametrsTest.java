import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioWithoutParametrsTest {

    @Test
    public void testNextStations_0next() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentStation(5);
        radio.setCarrentStation(0);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStations_8next() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentStation(5);
        radio.setCarrentStation(8);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStations_9next() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentStation(5);
        radio.setCarrentStation(9);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStations_0prev() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentStation(5);
        radio.setCarrentStation(0);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStations_1prev() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentStation(1);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStations_Up9prev() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentStation(11);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStations_Lou0prev() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentStation(-11);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testUpVolume_0up() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentVolume(0);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDowneVolume_0down() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentVolume(1);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUpVolume_105Up() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentVolume(105);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDowneVolume_105down() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentVolume(10);
        radio.setCarrentVolume(0);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUpVolume_100up() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentVolume(100);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDowneVolume_negdown() {
        RadioWithoutParametrs radio = new RadioWithoutParametrs();
        radio.setCarrentVolume(-1);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}