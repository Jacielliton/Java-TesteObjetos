public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Corolla";

        // Interagindo com o objeto
        System.out.println("Modelo do carro: " + meuCarro.modelo);
        meuCarro.acelerar(50);
        meuCarro.frear(20);
    }
}
