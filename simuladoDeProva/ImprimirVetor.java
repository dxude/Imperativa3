public static void imprimirVetor(int[] v, int n) {
    System.out.print("{ ");
    for (int i = 0; i < n; i++) {
        System.out.print(v[i]);
        if (i < n - 1) {
            System.out.print(", ");
        }
    }
    System.out.println(" }");
}
