 import java.util.Scanner;
public class index{
 public static void main(String[] arg){
  Scanner sc= new Scanner(System.in);
  while(true){
  //calendar a= new calendar();
  //System.out.println(a.toString());
  
  //calendar b= new calendar(7,4,1999);
  //System.out.println(b.toString());
  System.out.println();
  calendar ca= new calendar();

  System.out.println("Write day");
  int d=sc.nextInt();
  if(d<1||d>31){System.out.println("Day wrong");return;}
  System.out.println("Write a month");
  int e=sc.nextInt();
  if(e<1||e>31){System.out.println("month wrong");return;}
  System.out.println("Write a year");
  int f=sc.nextInt();
  if(f<1900||f>2050){System.out.println("Year wrong");return;}
  ca.leer(d,e,f);
  if(ca.bisiesto()==true){System.out.println("Year 'bisiesto'");}else{System.out.println("year no 'bisiesto'");}
  
  //new calendar();
  }
 }

 public static class calendar{
  private int  day;
  private int  month;
  private int  year;
  public int[] Nb=new int[12];
  public int[] Yb=new int[12]:
 public void Sday(int day){ 
	this.day=day;
 }
 public void Smonth(int month){
	this.month=month;
 }
 public void Syear(int year){
	this.year=year;
 }
 public int Gday(){
	return day;
 }
 public int Gmonth(){
	return month;
 }
 public int Gyear(){
	return year;
 }
 

 public calendar(){
	Sday(1);
	Smonth(1);
	Syear(1900);
 }
 public calendar(int day,int month,int year){
 	this.day=day;
	this.month=month;
	this.year=year;
 } 
 public void leer(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
 } 


 public boolean bisiesto(){ 
	int y=Gyear();
	if((Gyear()%4==0 && Gyear()%100!=0)||(Gyear()%400==0)){return true;}else{return false;}
 }

 public void MFC(){ 
 Nb[0]=31;
 Nb[1]=28;
 Nb[2]=31;
 Nb[3]=30;
 Nb[4]=31;
 Nb[5]=30;
 Nb[6]=31;
 Nb[7]=31;
 Nb[8]=30;
 Nb[9]=31;
 Nb[10]=30;
 Nb[11]=31;
 }
 public void MFC2(){
 Yb[0]=31;
 Yb[1]=29;
 Yb[2]=31;
 Yb[3]=30;
 Yb[4]=31;
 Yb[5]=30;
 Yb[6]=31;
 Yb[7]=31;
 Yb[9]=30;
 Yb[10]=30;
 Yb[11]=31;

 }
 @Override
 public String toString() {
       return "Dia: "+Gday()+" month: "+Gmonth()+" year: "+Gyear();	
 }
 
 }
}
