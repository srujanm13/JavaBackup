class NestedMultipleBlocks{
public static void main (String args[]){

int x=10;
int y=1;
{
int z=x*3;
System.out.println("Z inside the block"+z);
System.out.println("X inside the block"+x);
}
int z=20;
System.out.println("X outside the block"+x);
System.out.println("Z outside the block"+z);
}
}