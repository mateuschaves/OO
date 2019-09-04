class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = null;
        carro2 = new Carro();

        carro1.descricao = "Ferrari 1";
        carro1.motor = 2;
        carro1.pneu.estado = true;

        carro2.descricao = "Ferrri 2";
        carro2.motor = 1;
        carro2.pneu.estado = false;
        carro2.aumentarVelocidade();

        System.out.println("Carro 1");
        System.out.println("Descrição: " + carro1.descricao);
        System.out.println("Motor: " + carro1.motor);
        System.out.println("Estado do Pneu: " + carro1.pneu.estado + "\n");
        System.out.println("Velocidade: " + carro2.velocidade + "\n");

        System.out.println("Carro 2");
        System.out.println("Descrição: " + carro2.descricao);
        System.out.println("Motor: " + carro2.motor);
        System.out.println("Estado do Pneu: " + carro2.pneu.estado + "\n");
        System.out.println("Velocidade: " + carro2.velocidade + "\n");

        System.out.println("Carro 1");
        System.out.println("Descrição: " + carro1.descricao);
        System.out.println("Motor: " + carro1.motor);
        System.out.println("Estado do Pneu: " + carro1.pneu.estado + "\n");
        System.out.println("Velocidade: " + carro2.velocidade + "\n");

        System.out.println("Carro 2");
        System.out.println("Descrição: " + carro2.descricao);
        System.out.println("Motor: " + carro2.motor);
        System.out.println("Estado do Pneu: " + carro2.pneu.estado);
        System.out.println("Velocidade: " + carro2.velocidade + "\n");

    }
}