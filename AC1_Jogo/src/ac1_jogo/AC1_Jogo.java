package ac1_jogo;

public class AC1_Jogo {

    public static void main(String[] args) {
        double defesa;

        Pokemon MyPokemon1 = new Pokemon("Flareon", "Fogo", 10);
        System.out.println("____________________________ ");
        Pokemon MyPokemon2 = new Pokemon("Blastoise", "Agua", 10);
        System.out.println("____________________________ ");

        Batalhas batalhas = new Batalhas();

        System.out.println("Seu Pokémon: ");
        MyPokemon1.imprimeAtributos();
        System.out.println("Pokémon Inimigo: ");
        MyPokemon2.imprimeAtributos();

        
        batalhas.startBattle();
    }

}
