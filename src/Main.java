import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose your unit (imperial, metric)");
        String unit=sc.nextLine();
        Astana astana=new Astana();
        TempAdapter celsToFahren=new TempAdapter(astana);
        if (unit.equals("imperial")){
            System.out.println("It is "+celsToFahren.getTemp()+" degrees by fahrenheit in Astana");
        }else if (unit.equals("metric")){
            System.out.println("It is "+astana.getTemp()+" degrees by celsius in Astana");
        }
    }
}