
public class Aluno {
    private String nome;
    private String email;
    private int matricula;
    private String sala;
    private int periodo;


    Aluno(String leo, String mail, int i1, String nome, int i) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.sala = sala;
        this.periodo = periodo;

    }

    Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;

    }

    public int getMatricula() {
        return matricula;
    }

    public String getSala() {
        return sala;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setPeriodo() {
        this.periodo = periodo;
    }
}