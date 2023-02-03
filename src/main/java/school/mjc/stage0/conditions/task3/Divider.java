package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if (number > 0){
            boolean b = number % 5 == 0 || number % 11 == 0;
            if(b){
                System.out.println("Dividable");
            }else {
                System.out.println("Non-dividable");
            }
        }else {
            System.out.println("cannot divide by zero");
        }
    }
}
