
import java.util.Scanner;

public class index {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //calendar a= new calendar();
            //System.out.println(a.toString());

            //calendar b= new calendar(7,4,1999);
            //System.out.println(b.toString());
            System.out.println();
            calendar ca = new calendar();

            System.out.println("Write day");
            int d = sc.nextInt();
            if (d < 1 || d > 31) {
                System.out.println("Day wrong");
                return;
            }
            System.out.println("Write a month");
            int e = sc.nextInt();
            if (e < 1 || e > 31) {
                System.out.println("month wrong");
                return;
            }
            System.out.println("Write a year");
            int f = sc.nextInt();
            if (f < 1900 || f > 2050) {
                System.out.println("Year wrong");
                return;
            }
            //3)
            ca.leer(d, e, f);
            //4)
            if (ca.bisiesto() == true) {
                System.out.println("Year 'bisiesto'");
            } else {
                System.out.println("year no 'bisiesto'");
            }
            //5)
            System.out.println("Days of month: " + ca.dayofmonth(2));
            //6)

            //7)
            System.out.println("Short Date: " + ca.shortdate());

            //8)
            //9)
            System.out.println("Long Date: " + ca.longdate());

            //10)
        }
    }

    public static class calendar {

        private int day;
        private int month;
        private int year;
        public int[] Nb = new int[12];
        public int[] Yb = new int[12];
        public String[] Mo = new String[12];
        public String[] Da = new String[7];
        public int[] Ts= new int[10];
        public String[] Mday= new String[7];
        public void Sday(int day) {
            this.day = day;
        }

        public void Smonth(int month) {
            this.month = month;
        }

        public void Syear(int year) {
            this.year = year;
        }

        public int Gday() {
            return day;
        }

        public int Gmonth() {
            return month;
        }

        public int Gyear() {
            return year;
        }

        public calendar() {
            Sday(1);
            Smonth(1);
            Syear(1900);
        }

        public calendar(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void leer(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public boolean bisiesto() {
            int y = Gyear();
            if ((Gyear() % 4 == 0 && Gyear() % 100 != 0) || (Gyear() % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }

        public int dayofmonth(int month) {
            MFC();
            MFC2();
            if (bisiesto()) {
                return Yb[month - 1];
            } else {
                return Nb[month - 1];
            }
        }

        private void validate() {
            leer(day, month, year);
            int d1 = 1, m2 = 1, y2 = 1900;

        }

        public String shortdate() {
            String re = "(";
            if (Gday() < 10) {
                re += "0" + Gday();
            } else {
                re += Gday();
            }
            re += "-";
            if (Gmonth() < 10) {
                re += "0" + Gmonth();
            } else {
                re += Gmonth();
            }
            re += "-";
            re += Gyear() + ")";

            return re;
        }

        public int elapsed(int a, int b, int c) {
            int days = 0;
            for (int i = 0; i < (c - 1900); i++) {
                for (int j = 0; j < (b); j++) {
                    for (int k = 0; k < a; k++) {
                        //pend
                    }
                }
            }
            return days;
        }

        public String longdate() {
            String lon = "";
            Das();
            MoD();
            int d = 0;
            int ba = 1600;
            for (int i = 0; i < (Gyear()-1600); i++) {
                if (Gyear() >= ba && Gyear() < ba + 100) {
                    d=0;
                }
                if(Gyear()>=ba+100&&Gyear()<ba+200){
                    d=5;
                }
                if(Gyear()>=ba+200&&Gyear()<ba+300){
                    d=3;
                }
                if(Gyear()>=ba+300&&Gyear()<ba+400){
                    d=1;
                }
                if(Gyear()>=ba+400&&Gyear()<ba+500){
                    d=0;
                }
            }
            System.out.println("que treas "+d);
            d = ((Gmonth())+(Gday()+d));
            System.out.println("que trae aquí "+d);
            SevenTable();
            for (int i = 0; i < Ts.length; i++) {
                if(Ts[i]<=d){
                    if(Ts[i]==d){
                        d=0;
                    }else{
                        if(Ts[i]==7){
                            d-=7;
                        }else{
                            d-=Ts[i-1];
                        }
                    }
                }
            }
            System.out.println("qu aqundf "+d);
            ModificDay();
            //http://es.wikihow.com/calcular-el-día-de-la-semana
            return lon += Mday[d] + " " + Gday() + " de " + Mo[Gmonth() - 1] + " de " + Gyear();
        }
        public void ModificDay(){
            Mday[0]="Saturday";
            Mday[1]="Sunday";
            Mday[2]="Monday";
            Mday[3]="Tuesday";
            Mday[4]="Wednesday";
            Mday[5]="Thursday";
            Mday[6]="Saturday";
        }
        public void SevenTable(){
            Ts[0]=7;
            Ts[1]=14;
            Ts[2]=21;
            Ts[3]=28;
            Ts[4]=35;
            Ts[5]=42;
            Ts[6]=49;
            Ts[7]=56;
            Ts[8]=63;
            Ts[9]=70;
        }
        public void MFC() {
            Nb[0] = 31;
            Nb[1] = 28;
            Nb[2] = 31;
            Nb[3] = 30;
            Nb[4] = 31;
            Nb[5] = 30;
            Nb[6] = 31;
            Nb[7] = 31;
            Nb[8] = 31;
            Nb[9] = 30;
            Nb[10] = 30;
            Nb[11] = 31;
        }

        public void MFC2() {
            Yb[0] = 31;
            Yb[1] = 29;
            Yb[2] = 31;
            Yb[3] = 30;
            Yb[4] = 31;
            Yb[5] = 30;
            Yb[6] = 31;
            Yb[7] = 31;
            Yb[9] = 30;
            Yb[10] = 30;
            Yb[11] = 31;
        }

        public void MoD() {
            Mo[0] = "January";
            Mo[1] = "February";
            Mo[2] = "March";
            Mo[3] = "April";
            Mo[4] = "May";
            Mo[5] = "June";
            Mo[6] = "July";
            Mo[7] = "August";
            Mo[8] = "September";
            Mo[9] = "October";
            Mo[10] = "November";
            Mo[11] = "December";
        }

        public void Das() {
            Da[0] = "Monday";
            Da[1] = "Tuesday";
            Da[2] = "Wednesday";
            Da[3] = "Thursday";
            Da[4] = "Friday";
            Da[5] = "Saturday";
            Da[6] = "Sunday";
        }

        @Override
        public String toString() {
            return "Dia: " + Gday() + " month: " + Gmonth() + " year: " + Gyear();
        }

    }
}
