import java.util.Scanner;
class Student{
Scanner sc=new Scanner(System.in);
int roll_no;
String name;
String address;
String branch;
public void getData(){
System.out.println("Enter student roll no:");
this.roll_no=sc.nextInt();
System.out.println("Enter student name:");
this.name=sc.next();
System.out.println("Enter student address:");
this.address=sc.next();
System.out.println("Enter student branch");
this.branch=sc.next();
}
public void showData(){
System.out.printf("student roll
no:%d,name:%s,address:%s\n",this.roll_no,this.name,this.address,this.branch);
}
}
class Demostudent{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to store student detail:");
int n=sc.nextInt();
Student s[]=new Student[n];
for(int i=0;i<n;i++){
System.out.printf("Enter student no %d\n",i+1);
s[i] = new Student();
s[i].getData();
}
for(int i=0;i<n;i++){
s[i].showData();
}
}
}