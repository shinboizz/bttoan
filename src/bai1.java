import java.lang.Math;
import java.util.Scanner;
  
class bai1 {
  
    
    public static void main(String[] args) {
        double a = 2, b = 3, z;
        z = Math.pow(a, b);
        System.out.println(a + "^" + b + " = " + z);
    }
}
class nhapab {
    public static void main(String[] args)
    {
       int n;
       System.out.println("Nhap vao mot so nguyen:");
       Scanner sc = new Scanner(System.in);
 
       n = sc.nextInt();
 
       if (n >= 0){
          System.out.println("Đây là một số nguyên dương");
       } 
       else {
          System.out.println("Đây là số nguyên âm");
       }
    
}
class maxminab {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhập vào số thứ nhất: ");
        firstNumber = scanner.nextInt();
        System.out.print("Nhập vào số thứ hai: ");
        secondNumber = scanner.nextInt();
             
    
        int maxNumber = Math.max(firstNumber, secondNumber);
        System.out.println("Số lớn nhất trong 2 số " + firstNumber + " và " + secondNumber +
            " là " + maxNumber);

         int minNumber = Math.min(firstNumber, secondNumber);
        System.out.println("Số nhỏ nhất trong 2 số " + firstNumber + " và " + secondNumber +
            " là " + minNumber);
    }

    
}
class CanBacHai {
    public static double squareRoot(int number) {
        double temp;
 
        double sr = number / 2;
 
        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);
 
        return sr;
    }
    public static void main(String[] args)
    {
        System.out.print("Nhập vào số num:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("Căn bậc hai của "+ num+ " là: "+squareRoot(num));
    }
}
}