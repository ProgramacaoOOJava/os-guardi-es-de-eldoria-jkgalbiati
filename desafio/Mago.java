package desafio;

public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, int mana) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.mana = mana;
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Mana: " + this.mana);
    }

    @Override
    public void usarHabilidadeEspecial() {
        // Requisito 1: Mensagem personalizada para o Mago!
        System.out.println(this.nome + " usou sua habilidade especial: Explosão Arcana! Gastou de mana, restam " + (this.mana - 15) + " pontos.");
    }

    public int getMana() { return mana; }
}