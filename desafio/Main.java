package desafio;

public class Main {    
    public static void main(String[] args) {

        // Instanciando o primeiro objeto (Arthemis) 
        Personagem heroi1 = new Personagem("Arthemis", "Arqueira", 5, 80, 12.5);
        // Chamando o método para exibir o primeiro personagem
        heroi1.exibirStatus();        

        // Instanciando o segundo objeto (Guerreiro) 
        Personagem heroi2 = new Personagem("Ragnar", "Guerreiro", 3, 110, 15.0);
        // Chamando o método para exibir o segundo personagem
        heroi2.exibirStatus();        
    }
}