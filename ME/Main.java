public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vetor lista = new Vetor();

        System.out.printf("Hello and welcome!");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();

        /*
        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("George");
        */

        for (int i = 0; i < 15; i++) {
            Aluno novoAluno = new Aluno();
            novoAluno.setNome("Aluno"+(i+1));
            lista.Adiciona(novoAluno);
        }
        System.out.println("\n");


        /*
        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        */

        System.out.println("Total de alunos: " +lista.getTotalDealunos());
        lista.removeAluno(0);
        lista.removeAluno(0);
        System.out.println("Total de alunos: " +lista.getTotalDealunos());
        Aluno novoAluno = new Aluno();
        novoAluno.setNome("George");
        lista.adicionaPosicao(17, novoAluno);
        Aluno novoAluno2 = new Aluno();
        novoAluno2.setNome("Irving");
        lista.adicionaPosicao(18, novoAluno2);

        lista.printAluno();

        System.out.println(lista);
        System.out.println(lista.contem(a4 ));

    }
}
