public class FMRadio {

        private int numberRadioStation;
        private int soundVolume;

        public int getNumberRadioStation() {
            return numberRadioStation;
        }

        public void setNumberRadioStation(int newNumberRadioStation) {
            if (newNumberRadioStation < 0 || newNumberRadioStation > 9) {
                return;
            }
            this.numberRadioStation = newNumberRadioStation;
        }

        public int getSoundVolume() {
            return soundVolume;
        }

        public void setSoundVolume(int newSoundVolume) {
            if (newSoundVolume < 0 || newSoundVolume > 10) {
                return;
            }
            this.soundVolume = newSoundVolume;
        }

        public void next() {
            if (numberRadioStation < 9) {
                numberRadioStation++;
            } else {
                numberRadioStation = 0;
            }
        }

        public void prev() {
            if (numberRadioStation > 0) {
                numberRadioStation--;
            } else {
                numberRadioStation = 9;
            }
        }

        public void increaseVolume() {
            if (soundVolume < 10) {
                soundVolume++;
            }
        }

        public void downVolume() {
            if (soundVolume > 0) {
                soundVolume--;
            }
        }
    }

