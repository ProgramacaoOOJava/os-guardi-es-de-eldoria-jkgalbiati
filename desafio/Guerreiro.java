package desafio;

public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, int forca) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Força: " + this.forca);
        double poderTotal = this.poderBase + this.forca;
        System.out.println("Poder Total: " + poderTotal);
        System.out.println();
    }

    public int getForca() { return forca; }
}