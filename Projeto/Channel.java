class Channel {
    private String name;
    private int number;
    private int status;
    private String schedule;
    private String signalStrength;
    private int subtitle;
    private int live;
    private int record;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSchedule() {
        return this.schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSignalStrength() {
        return this.signalStrength;
    }

    public void setSignalStrength(String signalStrength) {
        this.signalStrength = signalStrength;
    }

    public int getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(int subtitle) {
        this.subtitle = subtitle;
    }

    public int getLive() {
        return this.live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getRecord() {
        return this.record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}