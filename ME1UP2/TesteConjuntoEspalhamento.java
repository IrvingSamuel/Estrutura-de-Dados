import java.util.List;

public class TesteConjuntoEspalhamento {

    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        List<String> palavras = conjunto.pegaTodas();
        System.out.println("Palavras no conjunto:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        conjunto.remove("Rafael");
        System.out.println("\nPalavras no conjunto após remover 'Rafael':");
        palavras = conjunto.pegaTodas();
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        System.out.println("\nO conjunto contém 'Ana'? " + conjunto.contem("Ana"));
        System.out.println("O conjunto contém 'Rafael'? " + conjunto.contem("Rafael"));

        System.out.println("\nTamanho do conjunto: " + conjunto.tamanho());

        // Adicionando palavras repetidas
        conjunto.adiciona("Ana");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");
        System.out.println("\nTamanho do conjunto após adicionar palavras repetidas: " + conjunto.tamanho());
    }
}

________________________________________________________________________________________

public class TesteConjuntoGenerico {
    public static void main(String[] args) {
        ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");
        System.out.println(conjunto.pegaTodos());
    }
}
