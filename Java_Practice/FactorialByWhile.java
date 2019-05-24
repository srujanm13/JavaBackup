class FactorialByWhile{
public static void main(String args[]){

int number=10;
long fact=1;
int counter=1;
while(counter<=number)
{
fact=fact*counter;
counter++;
}
System.out.println("Factorial of a NUmber is "+fact);
}

}