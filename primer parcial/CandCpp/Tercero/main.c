#include <stdio.h>
#include <stdlib.h>
/*
Construir un programa para calcular el factorial de N. El valor de N debe ser
ingresado por el usuario.
 */
int main() {
    int a=0,b=1;
    printf("Ingrese su numero: \n");
    scanf("%i",&a);
    for (int i=1;i<=a;i++){
        b*=i;
    }
    printf("El resultado es: %i\n",b);
    return 0;
}

