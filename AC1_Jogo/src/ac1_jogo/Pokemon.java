package ac1_jogo;

public class Pokemon {
   
    //Atributos

    private String nome;
    private String tipo;
    private int defesa;
    private int HPPokemon = 200;
    private int ATKPokemon;
    private int Nivel;

    public Pokemon(String nome, String tipo, int Nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.Nivel = Nivel;
        calculaNivel();
        calculaAtributos();
        imprimeAtributos();
    }

     public void imprimeAtributos() {

        System.out.println("Nome: " + this.nome + "|\n");
        System.out.println("Tipo: " + this.tipo + "|\n");
        System.out.println("HP: " + this.HPPokemon + "|\n");
        System.out.println("defesa: " + this.defesa + "|\n");
        System.out.println("ATK: " + this.ATKPokemon + "|\n");
        System.out.println("Nivel Pokemon: " + this.Nivel + "|\n");

    }

    //Metodos
    private void calculaNivel() {
        HPPokemon = HPPokemon + (Nivel + 2);
        defesa = defesa + (Nivel + 3);
        ATKPokemon = ATKPokemon + (Nivel + 3);
    }

    private void calculaAtributos() {

        switch (this.tipo) {
            case "Fogo":
                this.HPPokemon -= 20;
                this.defesa = 50;
                this.ATKPokemon = 15;
                break;

            case "Agua":
                this.HPPokemon -= 18;
                this.defesa = 70;
                this.ATKPokemon = 13;
                break;

            case "Terra":
                this.HPPokemon += 30;
                this.defesa = 80;
                this.ATKPokemon = 10;
                break;

            case "Planta":
                this.HPPokemon += 1;
                this.defesa = 67;
                this.ATKPokemon = 15;
                break;

        }

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getATKPokemon() {
        return ATKPokemon;
    }

    public void setATKPokemon(int ATKPokemon) {
        this.ATKPokemon = ATKPokemon;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }
    
}
