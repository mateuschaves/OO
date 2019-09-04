class Carro {

    public Carro() {
        this.pneu = new Pneu();
    }

    void aumentarVelocidade() {
        velocidade += 10;
    }

    String descricao;
    int motor;
    Pneu pneu;
    int velocidade;
}