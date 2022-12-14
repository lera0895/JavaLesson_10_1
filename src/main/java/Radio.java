public class Radio {


    private final int soundMaxLayer = 100;
    private final int soundMinLayer = 0;
    private final int minStation = 0;
    protected  int maxStation = 10;


    public Radio (){
    }
    public Radio(int myMaxStation) {
        maxStation= myMaxStation;
    }

    private int currentVolume = 0;
    private int currentRadioStationNumber= 0;




    public void setCurrentVolume(int myVolume) {
        if (myVolume >= soundMinLayer)
            if (myVolume <= soundMaxLayer -1) ;
        {
            currentVolume = myVolume;
        }
    }


    public void setCurrentRadioStationNumber(int myStation) {
        if (myStation >= minStation)
        if (myStation <= maxStation - 1); {
            currentRadioStationNumber = myStation;
        }
    }
    public void nextStation() {
        if (currentRadioStationNumber < maxStation -1) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = minStation;
        }
    }

    public void prevStation() {
        if (currentRadioStationNumber > minStation) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxStation -1;
        }

    }
    public void setMoreLoud() {
        if (currentVolume < soundMaxLayer) {
            currentVolume++;
        } else {
            currentVolume = soundMaxLayer;
        }
    }
    public void setLessLoud() {
        if (currentVolume > soundMinLayer) {
            currentVolume--;
        } else {
            currentVolume = soundMinLayer;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }
}
