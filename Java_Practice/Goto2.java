class Goto2{
public static void main(String args[]){
int i=1;
int j=2;

first:{
System.out.println(i);

second:{
System.out.println(j);
third:{
	
if(i==1)
break second;
System.out.println(i*j);
}
}
System.out.println("I am out of second block");

}
}
}
