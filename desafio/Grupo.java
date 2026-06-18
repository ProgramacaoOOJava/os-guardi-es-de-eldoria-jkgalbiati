package desafio;

import java.util.ArrayList;

public class Grupo {
    private ArrayList<Personagem> membros;

    public Grupo() {
        this.membros = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem p) {
        if (p != null) {
            this.membros.add(p);
        }
    }

    public void listarPersonagens() {
        if (membros.isEmpty()) {
            System.out.println("O grupo está vazio.");
            return;
        }
        // Loop for-each corrigido e seguro
        for (Personagem p : membros) {
            if (p != null) {
                p.exibirStatus();
                p.usarHabilidadeEspecial();
                System.out.println("----------------------------------------");
            }
        }
    }

    public void batalhar(Personagem a, Personagem b) {
        if (a == null || b == null) {
            System.out.println("Não é possível realizar um duelo com guerreiros inexistentes!");
            return;
        }
        
        System.out.println("⚔️ DUELO ÉPICO: " + a.getNome() + " VS " + b.getNome() + " ⚔️");
        
        double poderTotalA = a.getNivel() * a.getPoderBase();
        double poderTotalB = b.getNivel() * b.getPoderBase();

        if (poderTotalA > poderTotalB) {
            System.out.println(a.getClasse() + " " + a.getNome() + " venceu! Poder total calculado: " + (int)poderTotalA);
        } else if (poderTotalB > poderTotalA) {
            System.out.println(b.getClasse() + " " + b.getNome() + " venceu! Poder total calculated: " + (int)poderTotalB);
        } else {
            System.out.println("Empate! Ambos caíram com " + (int)poderTotalA + " de poder.");
        }
        System.out.println();
    }
}