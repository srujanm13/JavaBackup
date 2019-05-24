class FactorialOfNumber{

public static void main(String args[]){

int number=100;
double factorial=1;
for(int j=1;j<=number;j++){
factorial=factorial*j;
}
System.out.println("Factorial of "+number+" is "+factorial);
}
}