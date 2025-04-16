public static void criarParesImpares(int[] v, int n, int[] pares, int[] impares) {
    int indexPar = 0;
    int indexImpar = 0;

    for (int i = 0; i < n; i++) {
        if (v[i] % 2 == 0) {
            pares[indexPar++] = v[i];
        } else {
            impares[indexImpar++] = v[i];
        }
    }

    while (indexPar < pares.length) {
        pares[indexPar++] = -1;
    }
    while (indexImpar < impares.length) {
        impares[indexImpar++] = -1;
    }
}
