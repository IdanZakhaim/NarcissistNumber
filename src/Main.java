public class Main {
    public static void main(String[] args) {
        double unity;
        int num1;
        int num2;
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
        }
        for (int i = 10; i < 1000; i++) {
            unity=i%10;//אחדות
            num1=i;
            if (i<100){
                num1=num1/10;
                if (((Math.pow(num1,2)+(Math.pow(unity,2)))==i)){
                    System.out.print(i);
                }
            }
            if (i>=100){
                num2=num1/100; // מאות
                num1=num1/10;
                num1=num1%10;//// עשרות
                if (((Math.pow(unity,3)+Math.pow(num1,3)+Math.pow(num2,3)))==i){
                    System.out.print(" "+i);
                }
            }
            }
        }
    }
        //צריך להוציא את השארית מ10 של i כל פעם, לחלק את i כל הזמן ב10 ולהוציא את השארית מ10 עד שהמספר קטן מ10 ולחבר את האת התוצאות של השארית אם החזקה