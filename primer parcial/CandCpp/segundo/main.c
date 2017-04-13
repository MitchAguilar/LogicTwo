#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
Realizar un programa que permita encontrar el MCD de dos números
naturales positivos diferentes entre sí, empleando el Metodo de Euclides. Los
números deben ser ingresados por el usuario
 */
int main() {
    int a = 0, b = 0;
    printf("Ingrese su primer numero\n");
    scanf("%i", &a);
    printf("Ingrese su segundo numero\n");
    scanf("%i", &b);
    while (a != b) {
        if (a < b) {
            b -= a;
        } else {
            a -= b;
        }
    }
    printf("El MCD de los numeros digitados es: %i\n",a);
    return (0);
}

