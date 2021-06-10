import java.util.Scanner;
import java.lang.String;

class nhapxauab {
 
    public static void main(String[] args) {
        String s1,s2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap xau s1: ");
        s1 = scanner.nextLine();
        System.out.println("Moi nhap xau s2: ");
        s2 = scanner.nextLine();
        
        System.out.println(" s1 la :"+ s1);
        System.out.println(" s2 la :"+ s2);
 
    }
}
class nhapxauabsangso{
    
        public static void main(String[] args) {
            String s;
           Scanner sc = new Scanner(System.in);
           System.out.println("Moi nhap xau s: ");
            s = sc.nextLine();
            System.out.print(s.length());
        }
    }
class demotrycath{

    public static void main(String[] args) {
    
            
        try {
            int data = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Phép chia cho 0");
    }
}
class tinhtongab{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Moi nhap xau a: ");
            int a = sc.nextInt();
            
            System.out.println("Moi nhap xau b: ");
            int b = sc.nextInt();

            System.out.println(("ket qua a+b: ")+ (a + b));
        }
}



