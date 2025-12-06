import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private String titulo;
    private int capacidadeMaxima;

    private ArrayList<Aluno> inscritos = new ArrayList<Aluno>();

    public Disciplina(String codigo, String titulo, int capacidadeMaxima) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean isLotada() {
        return inscritos.size() >= capacidadeMaxima;
    }

    public List<Aluno> getAlunos() {
        return inscritos;
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

    public List<Aluno> getInscritos() {
        return inscritos;
    }
}