class NestedWhileExample
{
    public static void main(String arg[])
    {
      int i=4;
while(i<=10)
{
int j=1;
while (j<=10){
System.out.println(i + " * " +j + "="+(i*j)  );
j++;
}
i++;
}
    
    }
}