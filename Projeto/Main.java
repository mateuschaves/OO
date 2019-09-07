class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        try {
            tv.setStatus(1);
            tv.setBrightness(50);
            tv.setChannelSelected(0);
            tv.setManufacturer("Samsung");
            tv.setSerialNumber(155877454);
            tv.setVolume(30);

            System.out.println("Volume: " + tv.getVolume());
            System.out.println("Brilho: " + tv.getBrightness());
            System.out.println("Canal selecionado: " + tv.getChannelSelected());
            System.out.println("Fabricante: " + tv.getManufacturer());
            System.out.println("Número de série: " + tv.getSerialNumber());
            System.out.println("Fabricante: " + tv.getManufacturer());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}