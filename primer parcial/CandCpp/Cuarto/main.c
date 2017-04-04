#include <stdio.h>
#include <stdlib.h>

/*
Construir un programa para calcular los N primeros dígitos de la serie de
Fibonacci. El valor de N debe ser ingresado por el usuario.
 */
int main() {
    int a = 0, b = 0, c = 1, d = 0;
    printf("Digite el numero hasta el que quiere calcular\n");
    scanf("%i", &a);
    for (int i = 1; i <= a; i++) {
        d = b + c;
        b = c;
        c = d;
    }
    printf("La serie fibonacci para ese numero es: %i\n", b);
    return 0;
}

