package bichinho;

import java.util.Scanner;

public class Animais {

    Scanner sc = new Scanner(System.in);

    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private Boolean estado;
    private int caloria;
    private int forca;

    public Animais() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getCaloria() {
        return caloria;
    }

    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void nascer() {

        System.out.println("Nome do animal: ");
        setNome(sc.nextLine());

        System.out.println("Classe do animal: ");
        setClasse(sc.nextLine());

        System.out.println("Familia: ");
        setFamilia(sc.nextLine());

        setIdade(0);
        setForca(10);
        setCaloria(10);
        setEstado(true);

        System.out.println( "O animal se chama " + nome + " é da classe " + classe + " da familia " + familia + ". O animal possui força de " + forca + ", caloria de " + caloria + " e idade de " +idade);

    }

    public void morrer() {

        setForca(0);
        setEstado(false);

        System.out.println("O animal morreu!");
    
    }

    public void comer() {

        if (getCaloria() < 100 || getEstado() != false) {

            setCaloria(getCaloria() + 10);
            setForca(getForca() - 2);
            System.out.println("O animal comeu e agora sua força é de " + forca +" e suas calorias valem " + caloria);

        }
    }

    public void correr() {

        if (getEstado() != false && getCaloria() > 5) {

            setForca(getForca() - 5);
            setCaloria(getCaloria() - 5);
            System.out.println("O animal está correndo!! Agora sua força é de " + forca + " e suas calorias valem " + caloria);

        } else {

            morrer();

        }

    }

    public void dormir() {

        if (getEstado() != false) {

            setForca(getForca() + 10);
            setCaloria(getCaloria() + 2);
            System.out.println( "O animal está domingo agora! Sua força aumentou para " + forca + " e suas calorias aumentaram para " + caloria);

        } else {

            morrer();

        }

    }

}
