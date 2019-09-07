class Television {
    private int brightness;
    private int volume;
    private int channelSelected;
    private String manufacturer;
    private int serialNumber;

    public int getBrightness() {
        return this.brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannelSelected() {
        return this.channelSelected;
    }

    public void setChannelSelected(int channelSelected) {
        this.channelSelected = channelSelected;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

}