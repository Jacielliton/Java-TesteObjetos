class Carro {
    String modelo;
    int velocidadeAtual;

    // Método para acelerar
    void acelerar(int incremento) {
        velocidadeAtual += incremento;
        System.out.println("O carro acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    // Método para frear
    void frear(int decremento) {
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
        System.out.println("O carro freiou. Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
