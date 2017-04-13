package segundo.ejercicio;

public class SegundoEjercicio {

    public static void main(String[] args) {
        password a = new password();
        int lon=20;
        //--------seguridad devil---------//
        
        //password numerico
        System.out.println("Baja seguridad: " + new password(lon).toString());
        //password alfabetico
        a.pass(lon);
        System.out.println("Baja seguridad: " + a.toString()+"\n");

        //----------seguridad media--------//
        
        //con mayusculas
        a.passM(lon);
        System.out.println("Media seguridad: " + a.toString());
        //con minusculas
        a.passm(lon);
        System.out.println("Media seguridad: " + a.toString()+"\n");
        
        //-------seguridad alta------//
        a.passAl(lon);
        System.out.println("Alta seguridad: " + a.toString()+"\n");
        
        //-------nivel super humano------//
        a.passMa(lon);
        System.out.println("Altisima seguridad: " + a.toString()+"\n");
        
        //-------nivel Dios-------//
        a.levelGod(lon);
        System.out.println("Nivel Dios: "+a.toString());
    }

    public static class password {

        private int longitud = 0;
        private String contraseña = "";
        String al = "abcdefghijklmnopqrstuvwxyz";
        String AL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String com="¡¢£¤¥¦§¨©ª«¬®¯°±²³´µ¶¸»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÐÑÒÓÔÕæǑɔɘɦʮΔΥΨΫήεℜℵ↔∏⊗š‰";
        String acc="!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_abcdefghijklmnopqrstuvwxyz{|}~";
        public password() {

        }

        public int getLongitud() {
            return longitud;
        }

        public void setLongitud(int longitud) {
            this.longitud = longitud;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public password(int longitud) {
            this.longitud = longitud;
            String p = "";
            for (int i = 0; i < getLongitud(); i++) {
                p += b();
            }
            setContraseña(p);
        }

        public void pass(int l) {
            this.longitud = l;
            char cont;
            String ac = "";
            for (int i = 0; i < getLongitud(); i++) {
                cont = al.charAt(c());
                ac += cont;
            }
            setContraseña(ac);
        }

        public void passM(int l) {
            this.longitud = l;
            char cont;
            String ac = "";
            for (int i = 0; i < getLongitud(); i++) {
                if (i % 2 == 0) {
                    cont = AL.charAt(c());
                    ac += cont;
                } else {
                    ac += b();
                }
            }
            setContraseña(ac);
        }
        
        public void passAl(int l){
            this.longitud=l;
            String ac = "";
            int con=2;
            for (int i = 0; i < getLongitud(); i++) {
                if(i%2==0){
                    if(con%2==0){
                        ac+=al.charAt(c());
                    }else{
                        ac+=AL.charAt(c());
                    }
                    con++;
                }else{
                    ac+=b();
                }
            }
            setContraseña(ac);
        }
        public void passm(int l) {
            this.longitud = l;
            char cont;
            String ac = "";
            for (int i = 0; i < getLongitud(); i++) {
                if (i % 2 == 0) {
                    cont = al.charAt(c());
                    ac += cont;
                } else {
                    ac += b();
                }
            }
            setContraseña(ac);
        }
        
        public void passMa(int l){
            String best="";
            this.longitud=l;
            int cont1=2;
            int cont2=3;
            for (int i = 0; i < getLongitud(); i++) {
                if(i%2==0){
                    if(cont1%2==0){
                        best+=AL.charAt(c());
                    }else{
                        best+=al.charAt(c());
                    }
                    cont1++;
                }else{
                    if(cont2%2==0){
                        best+=b();
                    }else{
                        best+=acc.charAt(d());
                    }
                    cont2++;
                }
            }
            setContraseña(best);
        }
        //nivel Dios
        public void levelGod(int a){
            this.longitud=a;
            String add="";
            for (int i = 0; i < getLongitud(); i++) {
                int b=god();
                if(b==1){
                    add+=al.charAt(c());
                }else if(b==2){
                    add+=AL.charAt(c());
                }else if(b==3){
                    add+=acc.charAt(d());
                }else if(b==4){
                    add+=com.charAt(e());
                }else{
                    add+=b();
                }
            }
            setContraseña(add);
        }
        //rango de los aleatorios
        public int god(){
            int a = 0;
            return a = (int) (Math.random() * (5 + 1));
        }
        
        public int b() {
            int a = 0;
            return a = (int) (Math.random() * (9 + 0));
        }

        public int c() {
            int a = 0;
            return a = (int) (Math.random() * (26 + 0));
        }
       
        public int d(){
            int a=0;
            return a=(int)(Math.random()*(92+0));
        }
        public int e(){
            int a=0;
            return a=(int)(Math.random()*(66+0));
        }

        @Override
        public String toString() {
            return "password:   " + "longitud= " + longitud + ", contrase\u00f1a= " + contraseña;
        }

    }
}
/*
Haz una clase llamada Password que siga las siguientes condiciones:
1. Que tenga los atributos longitud y contraseña. Por defecto, la longitud será de 8.
2. Los constructores serán los siguiente:
a) Un constructor por defecto.
3. Un constructor con la longitud que nosotros le pasemos. Generará una contraseña
aleatoria con esa longitud.
4. Los métodos que implementa serán:
a) esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte
debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números.
b) generarPassword(): genera la contraseña del objeto con la longitud que
tenga.
c) Método get para contraseña y longitud.
d) Método set para longitud.
Ahora, crea una clase principal:
1. Permita ingresar una contraseña, y dependiendo del texto ingresado se define el
valor del atributo longitud
2. Al final, muestra la contraseña y si es o no fuerte.
 */
kadaosmu@gmail.com
