package NestedClass.InnerClass;

class TVset {
    private int channel = 5;
    private boolean isOn;
    private Remote remote = new Remote();

    public Remote getRemote() {
        return remote;
    }

    class Remote {
        public void setChannel(int channel) { // переключаем каналы на телевизоре
            TVset.this.channel = channel;
        }

        public void turnOn() {  // включаем телевизор
            isOn = true;
        }

        public void turnOff() {  // вЫключаем телевизор
            isOn = false;
        }

        @Override
        public String toString() {
            if (!isOn) {
                return "The TVset is OFF!";
            }
            return "Channel " + channel + " is on the TVset now";
        }
    }
}

class Main {
    public static void main(String[] args) {
        TVset tv = new TVset();
        TVset.Remote remote = new TVset().new Remote();
        System.out.println(tv);
        remote.turnOn();
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);
    }
}



