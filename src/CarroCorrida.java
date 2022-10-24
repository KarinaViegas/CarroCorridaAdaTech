public class CarroCorrida {
    private Integer numero;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;


    public CarroCorrida(
            Integer numeroCarroCorrida,
            Piloto pilotoCarroCorrida,
            float velocidadeMaximaCarroCorrida,
            float velocidadeAtualCarroCorrida,
            boolean ligadoCarroCorrida
    ) {

        numero = numeroCarroCorrida;
        piloto = pilotoCarroCorrida;
        velocidadeMaxima = velocidadeMaximaCarroCorrida;
        velocidadeAtual = 0;
        ligado = false;
    }


    @Override
    public String toString() {
        return "CarroCorrida{" +
                "numero=" + numero +
                ", piloto=" + piloto.getNome() +
                ", velocidadeMaxima=" + velocidadeMaxima + "km/h" +
                ", velocidadeAtual=" + velocidadeAtual + "km/h" +
                ", ligado=" + ligado +
                '}';
    }
    public CarroCorrida() {}

    public void acelerar(float valor) {
        if (ligado == true) {
            this.velocidadeAtual = Math.min(velocidadeAtual + valor , velocidadeMaxima);
            System.out.printf("Voçê pode acelerar o carro até %.1f km/h.\n" , velocidadeMaxima);
        } else
            System.out.println("Voçê não pode acelerrar com o carro desligado.");

    }

    public void frear(float valor) {
        if (velocidadeAtual > 0) {
            System.out.println();
            velocidadeAtual = Math.max(0,velocidadeAtual - valor);
        } else
            System.out.println("Voçê pode frear até o carro chegar a 0km/h.");
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        if (velocidadeAtual == 0) {
            System.out.println("O carro está desligado.");
            this.ligado = false;
        } else {
            System.out.println("O carro está em movimento, voçê precisa parar o carro antes de desligar");
        }
    }

    public void parar() {
        this.velocidadeAtual = 0;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}