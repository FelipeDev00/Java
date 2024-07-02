/* aqui já começam as modificações, todos os atributos definidos como private, aumentando a segurança e não permitindo que o usuário inicie ou altere seu valor, a menos que seja por meio de um método GET ou SET criado na própria classe Carro */

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    /* Neste caso, será usado apenas um método construtor com quatro atributos, para deixar o código mais limpo e focar em todos os conceitos */

    public Carro(String modelo, String marca, int ano, String cor){
        this.modelo=modelo;
        this.marca=marca;
        this.ano=ano;
        this.cor=cor;
    }


    /* Neste momento, será criado um método GET e SET para cada um dos atributos da classe Carro */
	
    /* Aqui, o primeiro método GET (getModelo) criado para o atributo modelo, do tipo String e tem uma única função, que é retornar o valor do atributo modelo*/
    public String getModelo() {
        return modelo;

    }

    /* Aqui, o primeiro método SET (setModelo) criado para o atributo modelo, que recebe uma String como parâmetro e inicializa ou atualiza o valor do atributo modelo e a linha this.modelo faz referência à própria classe, igual ao método modificador */
    public void setModelo(String modelo) {
        this.modelo = modelo; 

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
