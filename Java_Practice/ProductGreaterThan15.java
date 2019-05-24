class ProductGreaterThan15{
public static void main(String args[])
{
int i=15,j=15;


for(int y=0;y<=i;y++)
{
for(int z=0;z<=j;z++)
{
if((y*z)>15)
continue;
System.out.println(y +"*"+ z + "="+(y*z));
}

}


}

}