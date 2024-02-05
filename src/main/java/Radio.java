public class Radio {

    private int maxCarrentStation;
    private int minCarrentStation;
    private int carrentStation;
    private int stationsCount;


    public Radio() {

        this.maxCarrentStation = 9;
        this.minCarrentStation = 0;
        carrentStation = minCarrentStation;
    }

    public Radio(int stationsCount) {
        this.maxCarrentStation = stationsCount - 1;
    }

    public int getCarrentStation() {
        return carrentStation;
    }

    public void setCarrentStation(int carrentStation) {

        if (carrentStation > maxCarrentStation) {
            return;
        }
        this.carrentStation = carrentStation;
    }

    public void next() {
        if (carrentStation != maxCarrentStation) {
            carrentStation++;
        } else {
            carrentStation = minCarrentStation;
        }
    }

    public void prev() {
        if (carrentStation != minCarrentStation) {
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
