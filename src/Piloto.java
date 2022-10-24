public class Piloto {
    private String nome;
    private Integer idade;
    private String equipe;

    private SexoPiloto sexo;


    public Piloto(
            String nomePiloto,
            Integer idadePiloto,
            String equipePiloto,
            SexoPiloto sexoPiloto)

    {
        setNome(nomePiloto);
        setIdade(idadePiloto);
        setEquipe(equipePiloto);
        setSexo(sexoPiloto);

    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", equipe='" + equipe + '\'' +
                ", sexo=" + sexo +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public SexoPiloto getSexo() {
        return sexo;
    }

    public void setSexo(SexoPiloto sexo) {
        this.sexo = sexo;
    }



}
