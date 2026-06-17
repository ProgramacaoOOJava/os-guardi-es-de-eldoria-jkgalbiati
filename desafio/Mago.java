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
        System.out.println();
    }

    public int getMana() { return mana; }
}