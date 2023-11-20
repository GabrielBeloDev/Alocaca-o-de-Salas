package Model;

public class Solicitacao {
    private int ano,vagas;
    private float semestre;
    private String curso, horario,disciplina, finalidade;

    public Solicitacao(int ano, int vagas, float semestre, String curso, String horario, String disciplina, String finalidade) {
        this.ano = ano;
        this.vagas = vagas;
        this.semestre = semestre;
        this.curso = curso;
        this.horario = horario;
        this.disciplina = disciplina;
        this.finalidade = finalidade;
    }

    public int getAno() {
        return ano;
    }

    public int getVagas() {
        return vagas;
    }

    public float getSemestre() {
        return semestre;
    }

    public String getCurso() {
        return curso;
    }

    public String getHorario() {
        return horario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getFinalidade() {
        return finalidade;
    }
}
