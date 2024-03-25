public class Vetor {
    private Aluno[] alunos = new Aluno[100];

    private int totalDealunos = 0;

    public void Adiciona(Aluno aluno) {
        this.alunos[this.totalDealunos] = aluno;
        this.totalDealunos++;
    }

    public int getTotalDealunos() {
        return totalDealunos;
    }

    public void printAluno(){
        int count = 0;
        for(int i = 0; i < this.alunos.length; i++){
            if(count < this.totalDealunos){
                if(alunos[i] != null){
                    System.out.println("Aluno"+(count+1)+": "+ this.alunos[i].getNome());
                    count++;
                }
            }
            else{
                break;
            }
        }
    }

    public void adicionaPosicao(int posicao, Aluno aluno) {
        if(this.alunos[posicao] == null) {
            this.alunos[posicao] = aluno;
            this.totalDealunos++;
        }
        else{
            System.out.println("Já ha um aluno cadastrado na posicao "+ posicao +", procurando proximo ponto livre na lista");
            for (int k = posicao+1; k < this.alunos.length; k++) {
                if(this.alunos[k] == null) {
                    this.alunos[k] = aluno;
                    this.totalDealunos++;
                    System.out.println("Novo aluno cadastrado na posicao " + k);
                    break;
                }
            }
        }

    }
    
    public void removePrimeiros(int quantidade){
        int removidos = quantidade;
        if (removidos > this.totalDealunos){
            System.out.println("\nNumero de alunos cadastrados menor que o solicitado para exclusao!\n deletando todos os alunos...\n\n");
            removidos = totalDealunos;
        }
        if(removidos == 0){
            System.out.println("\nNao ha como deletar 0 alunos!\n\n");
        }
        else{
            for (int i = 0; i < this.alunos.length; i++){
                while(this.alunos[i] != null && removidos > 0){
                    for (int k = i; k < this.alunos.length - 1; k++) {
                        this.alunos[k] = this.alunos[k + 1];
                    }
                    this.alunos[this.totalDealunos-1] = null;
                    this.totalDealunos--;
                    removidos--;
                }
                if(removidos == 0){
                    break;
                }
            }
        }
    }

    public void Alunopega(int posicao) {
        //implementar
    }

    public void removeAluno(int posicao) {
        if(this.alunos[posicao] != null) {
            for (int i = 0; i < this.alunos.length; i++) {
                if (i == posicao) {

                    // shifting elements
                    for (int k = i; k < this.alunos.length - 1; k++) {
                        this.alunos[k] = this.alunos[k + 1];
                    }
                    this.alunos[this.totalDealunos-1] = null;
                    this.totalDealunos--;
                }
            }
        }
        else{
            System.out.println("Nao ha aluno cadastrado na posicao " + posicao);
        }
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalDealunos; i++) {
            if (aluno == this.alunos[i]) {
                return true;
            }
        }
        return false;

    }

    public int tamanho() {
        return this.totalDealunos;
    }

    public String toString() {
        return null;
    }

}
