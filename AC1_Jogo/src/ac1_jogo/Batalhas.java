package ac1_jogo;

public class Batalhas {

    private int meuPokemonVida;
    private int outroPokemonVida;
    private String meuPokemonNome;
    private String outroPokemonNome;

    public void MyPokemon1(String nome, int HPPokemon) {
        this.meuPokemonVida = HPPokemon;
        this.meuPokemonNome = nome;
    }

    public void MyPokemon2(String nome, int HPPokemon) {
        this.outroPokemonVida = HPPokemon;
        this.outroPokemonNome = nome;
    }

    public void startBattle() {

        System.out.println("A batalha vai começar!");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        if (meuPokemonVida > outroPokemonVida) {

            System.out.println("Você venceu! Parabéns");

        } else {

            System.out.println("Você perdeu, tente novamente!");

        }

    }
}
