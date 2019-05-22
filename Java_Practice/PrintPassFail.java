class PrintPassFail{

public static void main (String args[]){

int srujan_marks=75,sanjeev_marks=98;
if(srujan_marks>35)
{
System.out.println("Srujan is Passed");
}
else 
{
System.out.println("Srujan is Failed");
}

if(sanjeev_marks>35)
{
System.out.println("Sanjeev is Passed");
}
else 
{
System.out.println("Sanjeev is Failed");
}

if(sanjeev_marks>srujan_marks)
{
System.out.println("Sanjeev Scored more than Srujan");
}
else if(sanjeev_marks<srujan_marks){
System.out.println("Srujan Scored more than Sanjeev");
}
else{
System.out.println("Both scored equal");
}
}
}