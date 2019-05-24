class fact{
public static void main(String args[]){

int number=5;
System.out.println("Factorial of "+ number + "is"+fact(number));

}
public static long fact(int number){
if(number==1)
return 1;
return number*fact(number-1);
}
}