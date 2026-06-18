package desafio;

public class Personagem {    
    protected String nome;      
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;
    
    // Construtor alinhado
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {  
        this.nome = nome;         
        this.classe = classe;                      
        this.nivel = nivel;                           
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    public void exibirStatus() {            
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Pontos de Vida: " + this.pontosDeVida);
        System.out.println("Poder Base: " + this.poderBase);
    }

    public void usarHabilidadeEspecial() {
        System.out.println(this.nome + " usou uma habilidade especial.");
    }

    // Getters essenciais
    public String getNome() { return this.nome; }
    public String getClasse() { return this.classe; }
    public int getNivel() { return this.nivel; }
    public int getPontosDeVida() { return this.pontosDeVida; }
    public double getPoderBase() { return this.poderBase; }
}