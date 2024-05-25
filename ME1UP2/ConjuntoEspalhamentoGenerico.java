import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamentoGenerico {

    private List<List<Object>> tabela = new ArrayList<List<Object>>();
    private int tamanho = 0;

    public ConjuntoEspalhamentoGenerico() {
        for (int i = 0; i < 26; i++) {
            LinkedList<Object> lista = new LinkedList<Object>();
            tabela.add(lista);
        }
    }

    private int calculaIndiceDaTabela(Object objeto) {
        int codigoDeEspalhamento = objeto.hashCode();
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % tabela.size();
    }

    public void adiciona(Object objeto) {
        if (!this.contem(objeto)) {
            int indice = this.calculaIndiceDaTabela(objeto);
            List<Object> lista = this.tabela.get(indice);
            lista.add(objeto);
            this.tamanho++;
        }
    }

    public List<Object> pegaTodos() {
        List<Object> objetos = new ArrayList<Object>();
        for (int i = 0; i < this.tabela.size(); i++) {
            objetos.addAll(this.tabela.get(i));
        }
        return objetos;
    }

    public void remove(Object objeto) {
        if (this.contem(objeto)) {
            int indice = this.calculaIndiceDaTabela(objeto);
            List<Object> lista = this.tabela.get(indice);
            lista.remove(objeto);
            this.tamanho--;
        }
    }

    public boolean contem(Object objeto) {
        int indice = this.calculaIndiceDaTabela(objeto);
        List<Object> lista = this.tabela.get(indice);
        return lista.contains(objeto);
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void imprimeTabela() {
        for (List<Object> lista : this.tabela) {
            System.out.print("[");
            for (int i = 0; i < lista.size(); i++) {
                System.out.print("*");
            }
            System.out.println("]");
        }
    }
}
