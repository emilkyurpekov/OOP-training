package ClassesAndObjects.EX03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<CAr> carList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double tire1Pressure = Double.parseDouble(tokens[5]);
            int tire1Age = Integer.parseInt(tokens[6]);
            double tire2Pressure = Double.parseDouble(tokens[7]);
            int tire2Age = Integer.parseInt(tokens[8]);
            double tire3Pressure = Double.parseDouble(tokens[9]);
            int tire3Age = Integer.parseInt(tokens[10]);
            double tire4Pressure= Double.parseDouble(tokens[11]);
            int tire4Age = Integer.parseInt(tokens[12]);
            CAr current  = new CAr(model,engineSpeed,enginePower,cargoWeight,cargoType,tire1Pressure,tire1Age,tire2Pressure,
                    tire2Age, tire3Pressure,tire3Age,tire4Pressure,tire4Age);

            carList.add(current);
        }
        String command = scanner.nextLine();
        if(command.equals("fragile")){
            for (CAr cAr : carList) {
              if(cAr.getTires().ifTirePressureIsUnder() && cAr.getCargo().getType().equals("fragile")){
                  System.out.printf("%s%n", cAr.getModel());
              }

            }
        }
        else if(command.equals("flamable")){
            for (CAr cAr : carList) {
                if(cAr.getCargo().getType().equals("flamable") && cAr.getEngine().getPower()> 250){
                    System.out.printf("%s%n", cAr.getModel());
                }
            }
        }
    }
}
// double tire1Pressure= ;
// int tire1Age;
// double tire2Pressure;
//  int tire2Age;
//  double tire3Pressure;
//    int tire3Age;
//   double tire4Pressure;
//  int tire4Age;