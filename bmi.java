import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("BMI���v�Z");
        for(int i=0; i<2; i++){
        Scanner scan = new Scanner(System.in);
            System.out.print("�E�g��(m)����́F");
                double height =  scan.nextDouble();
            System.out.print("�E�̏d(Kg)����́F");
                double weight =  scan.nextDouble();
                double bmi = weight / Math.pow(height, 2);
                System.out.println("BMI��"+String.format("%.2f",bmi));
	    }

    }
}
