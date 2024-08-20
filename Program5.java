//import stuff here?
import java.lang.Math; //for rounding
//Your code here

public class Program1
{
    public static void main(String[] args){

int  miles = 289;
int gallons = 9; 
double mileage = 0.0;
      Double ob = new Double(mileage);
      System.out.println(ob);
ob = (double) miles/gallons;
System.out.println("The Royale can go "+miles+" miles on "+ gallons+" gallons of gas and the mileage is "+(Math.round(ob* 100.0)/100.0)+
" miles per gallon");

miles = 412;
 gallons = 40; 
 mileage = 0.0;
ob = (double) miles/gallons;
System.out.println("The Koopa King can go "+miles+" miles on "+ gallons+" gallons of gas and the mileage is "+(Math.round(ob* 100.0)/100.0)+
" miles per gallon");

 miles = 361;
 gallons = 18; 
 mileage = 0.0;
ob = (double) miles/gallons;
System.out.println("The Pipe Frame can go "+miles+" miles on "+ gallons+" gallons of gas and the mileage is "+(Math.round(ob* 100.0)/100.0)+
" miles per gallon");

  miles = 161;
 gallons = 11; 
 mileage = 0.0;
ob = (double) miles/gallons;
System.out.println("The Bandwagon can go "+miles+" miles on "+ gallons+" gallons of gas and the mileage is "+(Math.round(ob* 100.0)/100.0)+
" miles per gallon");

}}
//Paste console output below:
/*
The Royale can go 289 miles on 9 gallons of gas and the mileage is 32.11 miles per gallon
The Koopa King can go 412 miles on 40 gallons of gas and the mileage is 10.3 miles per gallon
The Pipe Frame can go 361 miles on 18 gallons of gas and the mileage is 20.06 miles per gallon
The Bandwagon can go 161 miles on 11 gallons of gas and the mileage is 14.64 miles per gallon
*/

