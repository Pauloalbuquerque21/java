public class calculadoraIMC {
    public static void main(String[] args) {
        //peso div(altura * atura)
        int peso = 95;
        float altura = 1.83f;
        float result = peso / (altura * altura);
        System.out.println("Seu peso ideal " +result);
    }
}
