class Student_Marks{
public static void main(String args[]){
String s[][][]={{{"Srujan"},{"90","90","90","90","90","90"}},{{"Sanjeev"},{"91","91","91","91","91","91"}}};
for(String[][] s1:s)
{
for(String[] s2:s1)
{
for(String s3:s2){
System.out.print(s3+"\t");
}
System.out.print("\n");
}
}
}
}
