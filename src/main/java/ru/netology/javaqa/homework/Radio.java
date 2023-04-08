package ru.netology.javaqa.homework;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStations;

    public Radio() {
        this.maxStations = 9;
    }

    public Radio(int countStations) {
        this.maxStations = countStations - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > maxStations) {
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
        if (currentRadioStation == maxStations) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prevStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxStations;
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
