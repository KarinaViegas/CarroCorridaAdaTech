import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Olá, sou responsavel pela corrida Circut ADA, e quero saber se a sua equipe quer participar da corrida.");
        System.out.println("Para inscrevermos o seu carro, vamos precisar que o seu piloto passe algumas informações.");

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Piloto me fale o seu nome:");
        String nomePiloto = scanner.next();
        System.out.println("E agora sua idade;");
        int idadePiloto =  scanner.nextInt();
        System.out.println("Passe também o nome da sua equipe:");
        String equipePiloto = scanner.next();
        System.out.println();
        System.out.println("O seu sexo:");
        String sexo = scanner.next();
        System.out.println(sexo);

        Piloto piloto1 = new Piloto(nomePiloto , idadePiloto , equipePiloto , SexoPiloto.valueOf(sexo.toUpperCase()));


        System.out.println();

        System.out.println("Perfeito!!! Agora que temos as suas informações piloto, queremos saber o número do seu carro.");
        System.out.println();
        System.out.println("Número do carro:");
        int numeroCarroCorrida = scanner.nextInt();
        System.out.println("Preciso que voçê me fale a velocidade máxima do seu carro:");
        float velocidadeMaxima = scanner.nextFloat();
        CarroCorrida carroCorrida1 = new CarroCorrida();
        carroCorrida1.setNumero(numeroCarroCorrida);
        carroCorrida1.setVelocidadeMaxima(velocidadeMaxima);
        carroCorrida1.setPiloto(piloto1);

        System.out.println("Perfeito, vamos para a corrida!!!");
        System.out.println();
        System.out.println("Pilotos, liguem os seus motores! 1,2,3...JÁ!");
        System.out.println();
        carroCorrida1.ligar();

        System.out.println("Piloto, vc precisa passar o quanto voçê quer acelerar:");
        float velocidadeAcelerada = scanner.nextFloat();
        carroCorrida1.acelerar(velocidadeAcelerada);
        System.out.println();

        System.out.println("Muito bem, voçê fez uma ótima largada. Talvez esteja na hora de passar pelo Pit Stop.");

        System.out.println();

        System.out.println("Você precisa frear o carro para parar no Pit Stop e reabastecer o seu carro.");
        while (carroCorrida1.getVelocidadeAtual()>0){
            System.out.println("Você precisa chegar a 0km/h para parar o carro.");
            System.out.println("Passe o quanto voçê quer frear:");
            float velocidadeFreada = scanner.nextFloat();
            carroCorrida1.frear(velocidadeFreada);
        }
        System.out.println("Voçê parou o carro");
        System.out.println();


        System.out.println("carro reabastecido. vamos voltar para corrida. Já estamos perto da linha de chegada.");
        System.out.println("Passe o quanto voçê quer acelerar:");
        velocidadeAcelerada = scanner.nextFloat();
        carroCorrida1.acelerar(velocidadeAcelerada);

        System.out.println("Parabéns Piloto, voçê chegou em primeiro lugar. Agora vamos parar para voçê poder comemorar com a sua equipe.");
        System.out.println();

        carroCorrida1.parar();

        carroCorrida1.desligar();
        System.out.println();

        System.out.println(carroCorrida1);




    }


}
