
package br.ulbra.classes;

public class Jogador {
    
    private String nome;
    private String posicao; // =1(defesa) =2(meio-campo)  =3(ataque)
    private int anoNacimento;
    private String nacionalidade;
    private double altura;
    private double peso;
    
    //SETTERS E GETTERS
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    public String getPosicao(){
        return posicao;
    }
    
    public void setAnoNacimento(int anoNacimento){
        this.anoNacimento = anoNacimento;
    }
    public int getAnoNacimento(){
        return anoNacimento;
    }
    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getNascionalidade(){
        return nacionalidade;
    }
    
    public void setAltura (double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    
    //METODOS GERAIS
    public Jogador(){
        //Método construtor
    }
    public int calcularIdade(int anoInicial){
        return (2022 - anoInicial); 
    }
    public int tempoAposentadoria(int idade, String posicao){
        if (posicao.equals("defesa") && idade < 40){
            return 40 - idade;
        } else if (posicao.equals("meio-campo") && idade < 38) {
            return 38 - idade;
        } else if (posicao.equals("atacante") && idade < 35){
            return 35 - idade;
        } else {
            return 0;
        }
    }
}
