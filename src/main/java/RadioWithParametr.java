public class RadioWithParametr {

    private int maxStation;
    private int carrentStation;
    private int stationsCount;


    public RadioWithParametr(int stationsCount) {
        this.maxStation = stationsCount;
    }


    public int getCarrentStation() {
        return carrentStation;
    }

    public void setCarrentStation(int carrentStation) {
        if (carrentStation < stationsCount) {
            return;
        }
        if (carrentStation > maxStation) {
            return;
        }

        this.carrentStation = carrentStation;

        System.out.println("Заданное Число Станций        " + maxStation);

        System.out.println("Переключение с Радиостанции   " + carrentStation);
    }

    public void next() {
        if (carrentStation != maxStation) {
            carrentStation++;
        } else {
            carrentStation = stationsCount + 1;
        }
    }

    public void prev() {
        if (carrentStation != stationsCount + 1) {
            carrentStation--;
        } else {
            carrentStation = maxStation;
        }
    }


    private int carrentVolume;

    public void up() {
        if (carrentVolume < 100) {
            carrentVolume++;
        } else {
            carrentVolume = 100;
        }
    }

    public void down() {
        if (carrentVolume > 0) {
            carrentVolume--;
        } else {
            carrentVolume = 0;
        }
    }

    public int getCarrentVolume() {
        return carrentVolume;
    }

    public void setCarrentVolume(int carrentVolume) {
        if (carrentVolume > 100) {
            return;
        }
        if (carrentVolume < 0) {
            return;
        }
        this.carrentVolume = carrentVolume;
    }
}