class Employee_Month_Salary{
public static void main(String args[]){
String s[][][][]={{{{"Srujan"},{"January","Feb","March","April"},{"100","200","300"}}}};

for(String[][][] s1:s){
for(String[][] s2:s1){
for(String[] s3:s2){
for(String s4:s3){
System.out.print(s4+"\t");
}
System.out.println("\n");
}
}
}
}
}
