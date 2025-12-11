public class Ordenação_simples {
    public static void main(String[] args) {
        int[] numeros = {5,2,9,1,3};

        for(int i = 0; i < numeros.length-1;i++){
            for (int j = 0;j < numeros.length-1-i;j++){
                if (numeros[j]>numeros[j+1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }

                
            }
        }

        System.out.println("Ordenador:");
        for(int n : numeros){
            System.out.println(n);
        }
        
    }
    
}
