package desafio;

public class Personagem {    
    // Atributos mudados para 'private' para proteger os dados (Encapsulamento)
    private String nome;      
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;
    
    // Construtor usando o 'this'
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {  
        this.nome = nome;         
        this.classe = classe;                      
        this.nivel = nivel;                           
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Método para exibir os dados na tela
    public void exibirStatus() {            
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Pontos de Vida: " + this.pontosDeVida);
        System.out.println("Poder Base: " + this.poderBase);
        System.out.println(); // Linha em branco para separar os personagens
    }

    // Métodos Getters 
    public String getNome() { return nome; }
    public String getClasse() { return classe; }
    public int getNivel() { return nivel; }
    public int getPontosDeVida() { return pontosDeVida; }
    public double getPoderBase() { return poderBase; }
}