#include <stdio.h>
/*
Realizar un programa que permita realizar una división, sin emplear los
operadores / y %. El dividendo y el divisor deben ser ingresados por el
usuario; el programa debe imprimir el residuo y el cociente de la división.
*/
int main() {
    int a = 12, b = 5, c=0, d=0, e = 0;
    while (e == 0) {
        a = a - b;
        if (a < 0) {
            d = a + b;
            break;
        }
        c++;
    }
    printf("%i Res   %i\n", c, d);
    return (0);
}

