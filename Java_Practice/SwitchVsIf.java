class SwitchVsIf{
public static void main(String args[]){
char alp='@';

switch(alp){
case 'a':
case 'e':
System.out.println("This is a vowel");
case 'b':
case 'd':
System.out.println("This is a alphabet");
break;
case '@':
System.out.println("This is a special character");
break;
}



}
}