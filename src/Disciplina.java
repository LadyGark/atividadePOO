import java.util.List;

public class Disciplina {
    private String codigo;
    private String titulo;
    private int capacidadeMaxima;



   // List<Aluno> = new ArrayList<Aluno>();

    // boolean isLotada() //?????

    // List<Aluno> getAlunos() ????????

    Disciplina(String codigo, String titulo, int capacidadeMaxima) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.capacidadeMaxima = capacidadeMaxima;

    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

}


void main() {
}