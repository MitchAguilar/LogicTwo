#include <stdio.h>
#include <stdlib.h>
/*
Una pareja desea invertir su dinero en un banco, el cual otorga el 2% de
interés. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de
un año si la ganancia de cada mes es reinvertida? El usuario ingresará el
valor inicial a invertir.
 */
int main() {
    double a=0,b=0,c=0;
    printf("Caunto dinero decea invertir?:\n");
    scanf("%lf",&a);
    c=a;  
    for (int i=0;i<12;i++){
        b=a*(0.02);
        a+=b;
    }
    c=a+b;
    printf("La ganancia anual es de: %lf\n",c);
    return 0;
}

