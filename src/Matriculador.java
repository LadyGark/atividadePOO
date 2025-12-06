import java.util.ArrayList;
import java.util.List;

public class Matriculador {
    private List<Disciplina> ofertas = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();

    public void cadastrarDisciplina(Disciplina D) {
        if (D == null) return;

        ofertas.add(D);
    }
    public void cadastrarAluno(Aluno A) {
        if (A == null) return;

        alunos.add(A);
    }
    public static void main(String[] args) {

        // criando disciplinas
        Disciplina d1=new Disciplina("POO1","Programação Orientada a Objetos",20);
        Disciplina d2=new Disciplina("IA1","Inteligencia Artificial",20);

        // criando alunos
        Aluno a1 = new Aluno("ana", "ana@gmail.com", 101, "A", 1);
        Aluno a2 = new Aluno("gustavo", "gustavo@gmail.com", 102, "B", 2);
        Aluno a3 = new Aluno("Luana", "Luana@gmail.com", 103, "C", 3);
        Aluno a4 = new Aluno("alice", "alice@gmail.com", 104, "D", 4);
        Aluno a5 = new Aluno("luan", "luan@gmail.com", 105, "E", 5);
        Aluno a6 = new Aluno("laila", "laila@gmail.com", 106, "F", 6);
        Aluno a7 = new Aluno("celina", "celina@gmail.com", 107, "G", 7);
        Aluno a8 = new Aluno("maia", "maia@gmail.com", 108, "H", 8);
        Aluno a9 = new Aluno("lola", "lola@gmail.com", 109, "I", 9);
        Aluno a10 = new Aluno("leo", "leo@gmail.com", 110, "J", 10);
        Aluno a11 = new Aluno("monique", "monique@gmail.com", 111, "K", 11);
        Aluno a12 = new Aluno("bernado", "bernado@gmail.com", 112, "L", 12);
        Aluno a13 = new Aluno("carmem", "carmem@gmail.com", 113, "M", 13);
        Aluno a14 = new Aluno("wilian", "wilian@gmail.com", 114, "N", 14);
        Aluno a15 = new Aluno("leandra", "leandra@gmail.com", 115, "O", 15);
        Aluno a16 = new Aluno("kauan", "kauan@gmail.com", 116, "P", 16);
        Aluno a17 = new Aluno("eduarda", "eduarda@gmail.com", 117, "Q", 17);
        Aluno a18 = new Aluno("lucas", "lucas@gmail.com", 118, "R", 18);
        Aluno a19 = new Aluno("karen", "karen@mail.com", 119, "S", 19);
        Aluno a20 = new Aluno("camila", "camila@gmail.com", 120, "T", 20);

        d1.getAlunos().add(a1);
        d1.getAlunos().add(a2);
        d1.getAlunos().add(a3);
        d1.getAlunos().add(a4);
        d1.getAlunos().add(a5);
        d1.getAlunos().add(a6);
        d1.getAlunos().add(a7);
        d1.getAlunos().add(a8);
        d1.getAlunos().add(a9);
        d1.getAlunos().add(a10);

        d2.getAlunos().add(a11);
        d2.getAlunos().add(a12);
        d2.getAlunos().add(a13);
        d2.getAlunos().add(a14);
        d2.getAlunos().add(a15);
        d2.getAlunos().add(a16);
        d2.getAlunos().add(a17);
        d2.getAlunos().add(a18);
        d2.getAlunos().add(a19);
        d2.getAlunos().add(a20);

        IO.println("Alunos em POO1: " + d1.getAlunos().size());
        IO.println("Alunos em IA I: " + d2.getAlunos().size());
    }
}


