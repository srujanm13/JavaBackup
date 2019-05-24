class AvgofNumbers{
public static void main(String args[]){

int sum=0;
int i=1;
int avg=0;

for(int j=0;j<=10;j++) {
sum=sum+(i*i);
avg=sum/i;
System.out.println("Sum of numbers are"+sum);
System.out.println("Avg of Numbers"+avg);
i++;

}
}


}