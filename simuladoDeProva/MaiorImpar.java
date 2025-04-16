public static void imprimirMaiorImpar(int[] v, int n) {
    int maiorImpar = Integer.MIN_VALUE;
    boolean encontrouImpar = false;

    for (int i = 0; i < n; i++) {
        if (v[i] % 2 != 0) { 
            if (!encontrouImpar || v[i] > maiorImpar) {
                maiorImpar = v[i];
                encontrouImpar = true;
            }
        }
    }

    if (encontrouImpar) {
        System.out.println("Maior número ímpar: " + maiorImpar);
    } else {
        System.out.println("Não há números ímpares no vetor.");
    }
}
