public class Radio {

    private int maxCarrentStation;
    private int minCarrentStation;
    private int carrentStation;
    private int stationsCount;

    public Radio() {
        this.minCarrentStation = 1;
        this.maxCarrentStation = 10;
    }

    public Radio(int stationsCount) {
        this.maxCarrentStation = stationsCount;
    }

    public int getCarrentStation() {
        return carrentStation;
    }

    public void setCarrentStation(int carrentStation) {
        if (carrentStation < stationsCount) {
            return;
        }
        if (carrentStation > maxCarrentStation) {
            return;
        }
        this.carrentStation = carrentStation;

        System.out.println("Заданное Число Радиостанций    " + maxCarrentStation);
        System.out.println("Переключение с Радиостанции №   " + carrentStation);
    }

    public void next() {
        if (carrentStation != maxCarrentStation) {
            carrentStation++;
        } else {
            carrentStation = stationsCount + 1;
        }
    }

    public void prev() {
        if (carrentStation != stationsCount + 1) {
            carrentStation--;
        } else {
            carrentStation = maxCarrentStation;
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
