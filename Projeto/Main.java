class Main {
    public static void main(String[] args) {

        Television tv = new Television();

        Channel ch1 = new Channel();
        Channel ch2 = new Channel();

        ch1.setName("Globo");
        ch1.setLive(1);
        ch1.setNumber(5);
        ch1.setStatus(1);
        ch1.setSignalStrength("FORTE");
        ch1.setSubtitle(1);

        ch2.setName("Record");
        ch2.setLive(0);
        ch2.setNumber(7);
        ch2.setStatus(0);
        ch2.setSignalStrength("NENHUM");
        ch2.setSubtitle(0);

        try {
            tv.setStatus(1);
            tv.setBrightness(50);
            tv.setChannelSelected(0);
            tv.setManufacturer("Samsung");
            tv.setSerialNumber(155877454);
            tv.setVolume(30);
            tv.setChannels(ch1);
            tv.setChannels(ch2);

            System.out.print("Informações da sua televisão \n\n");
            System.out.println("Volume: " + tv.getVolume());
            System.out.println("Brilho: " + tv.getBrightness());
            System.out.println("Canal selecionado: " + tv.getChannelSelected());
            System.out.println("Fabricante: " + tv.getManufacturer());
            System.out.println("Número de série: " + tv.getSerialNumber());
            System.out.println("Fabricante: " + tv.getManufacturer());
            System.out.println("Canais: \n");
            for (Channel channel : tv.getChannels()) {
                System.out.print(channel.getName() + "\n\n");
                if (channel.getLive() == 1) {
                    System.out.println("AO VIVO\n\n");
                } else {
                    System.out.println("GRAVADO\n\n");
                }
                System.out.print("Número do canal: " + channel.getNumber() + "\n\n");
                System.out.print("Força do sinal: " + channel.getSignalStrength() + "\n\n");
                if (channel.getSubtitle() == 1) {
                    System.out.print("LEGENDADO\n\n");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}