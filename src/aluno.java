

void main() {
}

public class Aluno {
     String nome;
     String email;
     int matricula;
     String sala;
     int periodo;


    Aluno (String nome, String email, int matricula, String sala, int periodo){
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.sala = sala;
        this.periodo = periodo;

    }

    Aluno (String nome, String email){
        this.nome = nome;
        this.email = email;

    }

    public String Getnome() {
        return nome;
    }

    public String Getemail() {
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

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

}
