class F2C{
public static void main(String args[]){
float tempinf=20;
System.out.println("Temperatur in celsius is"+f2c(tempinf));
}
public static double f2c(float temp){
return (temp-32)*5/9;

}

}