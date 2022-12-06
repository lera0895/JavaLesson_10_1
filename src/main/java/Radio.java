public class Radio {

    public int currentVolume;
    public int currentRadioStationNumber;
    protected  int maxStation;

    public Radio (){
        maxStation = 9;
    }
    public Radio(int stationCount) {
        maxStation= stationCount -1;
    }
    public RadioVolume(){
        maxVolume = 10;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > maxStation) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber < maxStation) {
            currentRadioStationNumber++;
            return;
        }

        currentRadioStationNumber = 0;
    }

    public void prev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxStation;
        }

    }
    public void setMoreLoud() {
        if (currentVolume < 10) {
            currentVolume++;
        }else {
            currentVolume = 0;
        }
    }
    public void setLessLoud() {
        if (currentVolume > 0) {
            currentVolume--;
        }else {
            currentVolume = 10;
        }
    }
}
