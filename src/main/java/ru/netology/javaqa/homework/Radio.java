package ru.netology.javaqa.homework;

public class Radio {
    public int maxRadioStations;
    private int currentRadioStation;
    private int currentVolume;

    public Radio() {
        this.maxRadioStations = 9;

    }

    public Radio(int countStations) {
        this.maxRadioStations = countStations - 1;
    }

    public int getMaxRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > maxRadioStations) {
            return;
        }
        currentRadioStation = newRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        currentVolume = newVolume;
    }

    public void nextStation() {
        if (currentRadioStation == maxRadioStations) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prevStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxRadioStations;
        } else {
            currentRadioStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
