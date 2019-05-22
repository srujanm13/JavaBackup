class DoWhileExample{

public static void main(String args[]){
int x=102;
System.out.println("Numbers divisible by 3 are below");
do{
System.out.println("I am inside");
if(x%3==0)
System.out.println(x);
x++;
}while(x<100);

}
}