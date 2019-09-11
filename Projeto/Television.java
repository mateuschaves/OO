class Television {
    /*
     * 0 - Desligada 1 - Ligada 2 - standby
     */
    private int status;
    private int brightness;
    private int volume;
    private Channel channelSelected;
    private String manufacturer;
    private int serialNumber;
    private Antenna antenna;

    public Antenna getAntenna() {
        return this.antenna;
    }

    public void setAntenna(Antenna antenna) {
        this.antenna = antenna;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        switch (status) {
        case 0:
            System.out.println("\n\nDesligando... \n\n");
            break;
        case 1:
            System.out.println("\n\nLigando... \n\n");
            break;
        case 2:
            System.out.println("\n\nEntrando em standby... \n\n");

        }
        this.status = status;
    }

    public int getBrightness() throws Exception {
        if (this.getStatus() == 0) {
            throw new Exception("Televisão desligada !");
        }
        return this.brightness;
    }

    public void setBrightness(int brightness) throws Exception {
        if (this.getStatus() == 0) {
            throw new Exception("Televisão desligada !");
        }
        this.brightness = brightness;
    }

    public int getVolume() throws Exception {
        if (this.getStatus() == 0) {
            throw new Exception("Televisão desligada !");
        }
        return this.volume;
    }

    public void setVolume(int volume) throws Exception {
        if (this.getStatus() == 0) {
            throw new Exception("Televisão desligada !");
        }
        this.volume = volume;
    }

    public Channel getChannelSelected() {
        return this.channelSelected;
    }

    public void setChannelSelected(Channel channel) throws Exception {
        if (this.getStatus() == 0) {
            throw new Exception("Televisão desligada !");
        }
        if (!this.antenna.isChannelAvailable(channel)) {
            throw new Exception("Canal fora do ar ou não disponibilizado pela sua operadora !");
        }
        this.channelSelected = channel;
    }

    public String getManufacturer() throws Exception {
        if (this.getStatus() == 0) {
            throw new Exception("Televisão desligada !");
        }
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) throws Exception {
        if (this.getStatus() == 0) {
            throw new Exception("Televisão desligada !");
        }
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() throws Exception {
        if (this.getStatus() == 0) {
            throw new Exception("Televisão desligada !");
        }
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) throws Exception {
        if (this.getStatus() == 0) {
            throw new Exception("Televisão desligada !");
        }
        this.serialNumber = serialNumber;
    }

}