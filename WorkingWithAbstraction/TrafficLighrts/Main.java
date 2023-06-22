package WorkingWithAbstraction.TrafficLighrts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] signals = scanner.nextLine().split(" ");
        int iterationsCount = Integer.parseInt(scanner.nextLine());
        List<TrafficLight> trafficLightList = new ArrayList<>();
        for (String signal : signals) {
            Color color = Color.valueOf(signal);
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLightList.add(trafficLight);
        }
        for (int i = 0; i < iterationsCount; i++)
        {
            for (TrafficLight trafficLight : trafficLightList) {
                trafficLight.changeLightColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }
    }
}
