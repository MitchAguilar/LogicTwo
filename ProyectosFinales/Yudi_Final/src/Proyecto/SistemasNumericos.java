package Proyecto;

public class SistemasNumericos {

    int tam1, tam2;
    Binario ValorOne, ValorTwo;
    String pint = "", bina = "";
    int val1[];
    int val2[];
    int a, b, aa;

    public SistemasNumericos(Binario one, Binario two, int tam1, int tam2) {
        ValorOne = one;
        ValorTwo = two;
        this.tam1 = tam1;
        this.tam2 = tam2;
        //var of values
        a = Math.max(tam1, tam2);
        b = Math.min(tam1, tam2);
        aa = (a - b);
        val1 = new int[a];
        val2 = new int[a];
    }

    public void normalizarArreglos() {
        //////////////////////igualación///////////////////////
        //meter el primer valor
        if (ValorOne.number.length() == ValorTwo.number.length()) {
            for (int i = 0; i < a; i++) {
                val1[i] = Integer.parseInt(ValorOne.number.charAt(i) + "");
                val2[i] = Integer.parseInt(ValorTwo.number.charAt(i) + "");
            }
        } else if (ValorOne.number.length() > ValorTwo.number.length()) {
            for (int i = 0; i < a; i++) {
                val1[i] = Integer.parseInt(ValorOne.number.charAt(i) + "");
            }
            for (int i = aa; i < a; i++) {
                val2[i] = Integer.parseInt(ValorTwo.number.charAt(i - aa) + "");
            }
        } else {
            for (int i = 0; i < a; i++) {
                val2[i] = Integer.parseInt(ValorTwo.number.charAt(i) + "");
            }
            for (int i = (a - b); i < a; i++) {
                val1[i] = Integer.parseInt(ValorOne.number.charAt(i - aa) + "");
            }
        }
    }

    public void OperSum() {
        //mostrar como quedan los arreglos que ne éste caso van a ser las sumas
        System.out.println("\n\n-_-_-_- OPERATION SUM -_-_-_-\n");
        System.out.print("    ");
        for (int i = 0; i < a; i++) {
            System.out.print(" [" + val1[i] + "]");
            pint += "----";
        }
        System.out.println("\n+");
        System.out.print("    ");
        for (int i = 0; i < a; i++) {
            System.out.print(" [" + val2[i] + "]");
        }
        System.out.println("\n    " + pint);

        ///////operación suma
        int aux = 0;
        String acum = "";
        for (int i = a - 1; i >= 0; i--) {
            if (aux == 0) {
                if ((val1[i] + val2[i]) == 2) {
                    aux = 1;
                    acum += 0;
                } else {
                    acum += val1[i] + val2[i];
                }
            } else {
                switch (val1[i] + val2[i]) {
                    case 2:
                        aux = 1;
                        acum += 1;
                        break;
                    case 1:
                        aux = 1;
                        acum += 0;
                        break;
                    default:
                        aux = 0;
                        acum += 1;
                        break;
                }
            }
        }

        if (aux == 1) {
            acum += 1;
        } else {
            System.out.print("    ");
        }
        for (int i = acum.length() - 1; i >= 0; i--) {
            System.out.print(" [" + acum.charAt(i) + "]");
        }
        System.out.print("\n");
    }

    public void OperRest() {
        //mostrar como quedan los arreglos que ne éste caso van a ser las restas
        pint = "";
        System.out.println("\n\n-_-_-_- OPERATION SUBTRACTION -_-_-_-\n");
        System.out.print("    ");
        for (int i = 0; i < a; i++) {
            System.out.print(" [" + val1[i] + "]");
            pint += "----";
        }
        System.out.println("\n-");
        System.out.print("    ");
        for (int i = 0; i < a; i++) {
            System.out.print(" [" + val2[i] + "]");
        }
        System.out.println("\n    " + pint);
        ///////operación resta
        int aux1 = 0;
        String acum1 = "";
        //convertir para comprobar
        String num1 = "", num2 = "";
        for (int i = 0; i < a; i++) {
            num1 += val1[i];
            num2 += val2[i];
        }
        long number = Integer.parseInt(num1, 2);
        long number2 = Integer.parseInt(num2, 2);
        if (number == number2) {
            for (int i = 0; i < a; i++) {
                acum1 += 0;
            }
        } else if (number > number2) {
            for (int i = a - 1; i >= 0; i--) {
                if (aux1 == 0) {
                    switch (val1[i] - val2[i]) {
                        case 0:
                            aux1 = 0;
                            acum1 += 0;
                            break;
                        case 1:
                            aux1 = 0;
                            acum1 += 1;
                            break;
                        default:
                            aux1 = 1;
                            acum1 += 1;
                            break;
                    }
                } else {
                    switch (val1[i] - val2[i]) {
                        case 0:
                            aux1 = 1;
                            acum1 += 1;
                            break;
                        case 1:
                            aux1 = 0;
                            acum1 += 0;
                            break;
                        default:
                            aux1 = 1;
                            acum1 += 0;
                            break;
                    }
                }
            }
        } else {
            for (int i = a - 1; i >= 0; i--) {
                if (aux1 == 0) {
                    switch (val2[i] - val1[i]) {
                        case 0:
                            aux1 = 0;
                            acum1 += 0;
                            break;
                        case 1:
                            aux1 = 0;
                            acum1 += 1;
                            break;
                        default:
                            aux1 = 1;
                            acum1 += 1;
                            break;
                    }
                } else {
                    switch (val2[i] - val1[i]) {
                        case 0:
                            aux1 = 1;
                            acum1 += 1;
                            break;
                        case 1:
                            aux1 = 0;
                            acum1 += 0;
                            break;
                        default:
                            aux1 = 1;
                            acum1 += 0;
                            break;
                    }
                }
            }
        }

        if (aux1 == 1) {
            acum1 += 1;
        } else {
            System.out.print("    ");
        }
        for (int i = acum1.length() - 1; i >= 0; i--) {
            System.out.print(" [" + acum1.charAt(i) + "]");
        }
        System.out.print("\n");
    }

    public void OperMult() {
        //mostrar como quedan los arreglos que ne éste caso van a ser las multiplicación
        pint = "";
        System.out.println("\n\n-_-_-_- OPERATION MULTIPLY -_-_-_-\n");
        System.out.print("    ");
        for (int i = 0; i < a; i++) {
            System.out.print(" [" + val1[i] + "]");
            pint += "----";
        }
        System.out.println("\nX");
        System.out.print("    ");
        for (int i = 0; i < a; i++) {
            System.out.print(" [" + val2[i] + "]");
        }
        System.out.println("\n    " + pint);
        bina = "";
        int NuOne = Dec(Long.parseLong(ValorOne.number.toString()));
        int NumTwo = Dec(Long.parseLong(ValorTwo.number.toString()));
        bin((NuOne * NumTwo));
        System.out.print("    ");
        for (int i = 0; i < bina.length(); i++) {
            System.out.print(" [" + bina.charAt(i) + "]");
        }
        System.out.print("\n");
    }

    public void bin(int a) {//num binario
        if (a < 1) {
            return;
        } else {
            bin(a / 2);
            bina += (a % 2) + "";
        }
    }

    public int Dec(long number) {//num decima
        int DECIMAl = 0;
        int Arr[] = new int[100];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) Math.pow(2, i);
        }
        String b = number + "";
        int le = b.length() - 1;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != '0') {
                DECIMAl += Arr[le];
            }
            le--;
        }
        return DECIMAl;
    }

    public void OperDiv() {
        //mostrar como quedan los arreglos que ne éste caso van a ser las divición
        pint = "";
        System.out.println("\n\n-_-_-_- OPERATION DIVIDE -_-_-_-\n");
        System.out.print("    ");
        this.bina = "";
        long number = Integer.parseInt(ValorOne.number, 2);
        long number2 = Integer.parseInt(ValorTwo.number, 2);
        if (number == number2) {
            for (int i = 0; i < a; i++) {
                System.out.print(" [" + val1[i] + "]");
                pint += "----";
            }
            System.out.println("\n/");
            System.out.print("    ");
            for (int i = 0; i < a; i++) {
                System.out.print(" [" + val2[i] + "]");
            }
            int NuOne = Dec(Long.parseLong(ValorOne.number.toString()));
            int NumTwo = Dec(Long.parseLong(ValorTwo.number.toString()));

            bin((NuOne / NumTwo));
        } else if (number > number2) {
            for (int i = 0; i < a; i++) {
                System.out.print(" [" + val1[i] + "]");
                pint += "----";
            }
            System.out.println("\n/");
            System.out.print("    ");
            for (int i = 0; i < a; i++) {
                System.out.print(" [" + val2[i] + "]");
            }
            int NuOne = Dec(Long.parseLong(ValorOne.number.toString()));
            int NumTwo = Dec(Long.parseLong(ValorTwo.number.toString()));

            bin((NuOne / NumTwo));
        } else {
            for (int i = 0; i < a; i++) {
                System.out.print(" [" + val2[i] + "]");
                pint += "----";
            }
            System.out.println("\n/");
            System.out.print("    ");
            for (int i = 0; i < a; i++) {
                System.out.print(" [" + val1[i] + "]");
            }
            int NuOne = Dec(Long.parseLong(ValorOne.number.toString()));
            int NumTwo = Dec(Long.parseLong(ValorTwo.number.toString()));

            bin((NumTwo / NuOne));
        }

        System.out.println("\n    " + pint);
        System.out.print("    ");
        for (int i = 0; i < bina.length(); i++) {
            System.out.print(" [" + bina.charAt(i) + "]");
        }
    }
}
