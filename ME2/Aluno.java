public class Aluno {
    private String nome;
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public String toString(){
        return this.nome;
    }

    public boolean equals(Object o){
        Aluno outro = (Aluno)o;
        return this.nome.equals(outro.nome);
    }

}
