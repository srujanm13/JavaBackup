class ShortCircuitAnd{

public static void main(String args[]){

int a=50,c=0;
if(c==0&&a++<100){
a=150;
}
System.out.println(a);
}
}