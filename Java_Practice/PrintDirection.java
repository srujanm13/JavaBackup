class PrintDirection{
public static void main(String args[]){
String dir;
dir="S";
switch(dir)
{
case "83":
System.out.println("South Direction");
break;
case "n":
System.out.println("North Direction");
break;
case "e":
System.out.println("East direction");
break;
case "w":
System.out.println("West Direction");
break;
default:
System.out.println("Direction is not correct");
break;
}
System.out.println("The End");
}
}