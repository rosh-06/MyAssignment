package week1.day1;

public class Twowheeler {
int noOfWheels= 6;
short noOfMirrors = 1;
long chassisNumber= 885878;
boolean isPuncture= true;
String bikeName ="My RE";
double runningKM = 36.7;
 public static void main(String[] args) 
 {
	Twowheeler My = new Twowheeler();
	System.out.println("Number of wheels" + My.noOfWheels);
	System.out.println("Number of mirrors" + My.noOfMirrors);
	System.out.println("Classic Number is" + My.chassisNumber);
	System.out.println("Bike is puncture " + My.isPuncture);
	System.out.println("My bike name" + My.bikeName);
	System.out.println("Kilometers running" + My.runningKM);
}


}
