import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("BMIを計算");
        Scanner scan = new Scanner(System.in);
            System.out.print("・身長(m)を入力：");
                double height =  scan.nextDouble();
            System.out.print("・体重(Kg)を入力：");
                double weight =  scan.nextDouble();
                double bmi = weight / Math.pow(height, 2);
                System.out.println("BMIは"+String.format("%.2f",bmi));
    }
}
