public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        Personagem h = new Personagem("Homer", "Masculino");
        Personagem m = new Personagem("Marge", "Feminino");
        Personagem b = new Personagem("Bart", "Masculino");
        Personagem mo = new Personagem("Moll", "Masculino");
        Personagem l = new Personagem("Lisa", "Feminino");
        Personagem ma = new Personagem("Maggie", "Feminino");
        Personagem n = new Personagem("Ned Flanders", "Masculino");
        Personagem s = new Personagem("Sr. Burns", "Masculino");
        Personagem atual;

        System.out.println("----------------------Lista------------------------------");
        lista.Adiciona(h);
        lista.Adiciona(m);
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.EsvaziaLista();
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.Adiciona(h);
        lista.Adiciona(0, b);
        lista.Adiciona(1, mo);
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.EsvaziaLista();
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.Adiciona(h);
        lista.Adiciona(b);
        lista.AdicionaNoComeco(l);
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.EsvaziaLista();
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.Adiciona(h);
        lista.Adiciona(ma);
        lista.Adiciona(0, b);
        lista.Adiciona(1, m);
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("Lisa está na lista: " + lista.Contem(l));
        System.out.println("----------------------------------------------------------");

        System.out.println("\n----------------------Lista------------------------------");
        lista.EsvaziaLista();
        lista.Adiciona(s);
        lista.Adiciona(n);
        lista.AdicionaNoComeco(l);
        lista.AdicionaNoComeco(ma);
        lista.Adiciona(1, b);
        lista.Remove(3);
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        // Adições na lista
        lista.AdicionaNoComeco(n);
        lista.AdicionaNoComeco(b);
        lista.Adiciona(m);
        lista.Adiciona(1, ma);
        lista.AdicionaNoComeco(h);
        lista.Adiciona(lista.tamanho(), s);

        // Imprime lista após as adições
        System.out.println("\n----------------------Lista------------------------------");
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        // Remoções na lista
        lista.RemovedoFim();
        lista.Remove(1);
        lista.RemovedoComeco();

        // Imprime lista após as remoções
        System.out.println("\n----------------------Lista------------------------------");
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        // Verificações na lista
        System.out.println("\n----------------------Lista------------------------------");
        System.out.println("Marge está na lista: " + lista.Contem(m));
        System.out.println("Homer está na lista: " + lista.Contem(h));
        System.out.println("Bart está na lista: " + lista.Contem(b));
        System.out.println("Maggie está na lista: " + lista.Contem(ma));
        System.out.println("O tamanho da lista eh: " + lista.tamanho());
        System.out.println("----------------------------------------------------------");

        // Esvazia a lista
        lista.EsvaziaLista();

        // Imprime a lista vazia
        System.out.println("\n----------------------Lista------------------------------");
        for (int i = 0; i < lista.tamanho(); i++) {
            atual = (Personagem) lista.Pega(i);
            System.out.println(atual.getNome());
        }
        System.out.println("----------------------------------------------------------");

    }

}