package desafio;

public class Main {    
    public static void main(String[] args) {

        // Instanciando os heróis do nível anterior
        Guerreiro ragnar = new Guerreiro("Ragnar", 5, 120, 15.0, 10);
        Mago eldrin = new Mago("Eldrin", 4, 70, 25.5, 80);
        
        // Novos heróis para montar grupos diferentes
        Guerreiro boramir = new Guerreiro("Boramir", 6, 140, 18.0, 12);
        Mago elenara = new Mago("Elenara", 8, 90, 37.5, 120);

        // Criando os dois grupos dinâmicos
        Grupo alianca = new Grupo();
        Grupo horda = new Grupo();

        // Alimentando os grupos
        alianca.adicionarPersonagem(ragnar);
        alianca.adicionarPersonagem(eldrin);

        horda.adicionarPersonagem(boramir);
        horda.adicionarPersonagem(elenara);

        // Mostrando os dados na tela
        System.out.println("=== INTEGRANTES DA ALIANÇA ===");
        alianca.listarPersonagens();
        System.out.println();

        System.out.println("=== INTEGRANTES DA HORDA ===");
        horda.listarPersonagens();
        System.out.println();

        // Rodando as simulações de combate do Nível Mestre
        System.out.println("=== SIMULAÇÃO DE COMBATE MATEMÁTICO ===");
        System.out.println();
        
        alianca.batalhar(ragnar, boramir);
        alianca.batalhar(eldrin, elenara);
    }
}