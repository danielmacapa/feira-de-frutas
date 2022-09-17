public class Main {
    public static void main(String[] args) {

        // deifinindo o array
        String frutasPedidas[] = {"laranja", "banana", "pera", "maçã", "uva", "abacaxi", "mamão"};
        String frutasCompradas[] = {"laranja", "uva", "mamão", "pera"};

        double pedido = frutasPedidas.length;
        double comprado = frutasCompradas.length;
        double c = comprado / pedido;
        double g = 0;
        //System.out.println(pedido);

        if (c <= 1 && c >= 0.9) {
            g = 10;
            System.out.println("Correspondência de 90%, gorjeta de R$ 10,00.");
        } else if (c < 0.9 && c >= 0.75) {
            g = 5;
            System.out.println("Correspondência de 75%, gorjeta de R$ 5,00.");
        } else if (c < 0.75 && c >= 0.5) {
            g = 3;
            System.out.println("Correspondência de 50%, gorjeta de R$ 3,00.");
        } else if (c < 0.5 && c >= 0) {
            System.out.println("Correspondência menor que 50%, sem gorjeta.");
        } else {

            System.out.println("Informe a lista correta.");
        }

        //preços
        //"laranja", "banana", "pera", "maçã", "uva", "abacaxi", "mamão"
        int fcomp = frutasCompradas.length;
        double total = 0.0;

        for (int i = 0; i < fcomp; i++) {
            if (frutasCompradas[i] == "laranja") {
                total += 2.75;
            } else if (frutasCompradas[i] == "banana") {
                total += 3.10;
            } else if (frutasCompradas[i] == "pera") {
                total += 4.56;
            } else if (frutasCompradas[i] == "maçã") {
                total += 2.22;
            } else if (frutasCompradas[i] == "uva") {
                total += 6.23;
            } else if (frutasCompradas[i] == "abacaxi") {
                total += 5.5;
            } else if (frutasCompradas[i] == "mamão") {
                total += 2;
            }

        }
        System.out.println("O valor total a pagar é de: "+(total+g));
    }
}