package desafio;

public class Main {    
    public static void main(String[] args) {

        // Instanciando um Guerreiro (Classe específica - Herança)
        // Parâmetros: Nome, Nível, Pontos de Vida, Poder Base, Força
        Guerreiro guerreiro = new Guerreiro("Ragnar", 5, 120, 15.0, 10);
        
        // Instanciando um Mago (Classe específica - Herança)
        // Parâmetros: Nome, Nível, Pontos de Vida, Poder Base, Mana
        Mago mago = new Mago("Eldrin", 4, 70, 25.5, 80);

        // Exibindo os status personalizados de cada um
        System.out.println("--- STATUS DOS HERÓIS (NÍVEL AVENTUREIRO) ---");
        System.out.println();
        
        guerreiro.exibirStatus();
        guerreiro.usarHabilidadeEspecial();
        mago.exibirStatus();
        mago.usarHabilidadeEspecial();
    }
}