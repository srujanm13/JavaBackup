class BtechYearBranchChapters{
public static void main(String args[]){
int year=1;
char branch='E';
switch(year){
case 1:
System.out.println("English,Maths,Chemistry");
break;
case 2:
switch(branch){
case 'E':
System.out.println("SDLC,PDC");
break;
case 'C':
System.out.println("C,JAVA");
break;
case 'M':
System.out.println("Mechtronics,Lorry");
break;
}

break;
case 3:
switch(branch){
case 'E':
System.out.println("SDLC3,PDC3");
break;
case 'C':
System.out.println("C3,JAVA3");
break;
case 'M':
System.out.println("Mechtronics3,Lorry3");
break;
}
break;
case 4:
switch(branch){
case 'E':
System.out.println("SDLC4,PDC4");
break;
case 'C':
System.out.println("C4,JAVA4");
break;
case 'M':
System.out.println("Mechtronics4,Lorry4");
break;
}
break;
}

}
}