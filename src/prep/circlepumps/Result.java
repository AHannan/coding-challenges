package prep.circlepumps;

import java.util.List;


class Result {

    /*
     * Complete the 'truckTour' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY petrolpumps as parameter.
     */

    public static int truckTour(List<List<Integer>> petrolpumps) {
        int start = 0;
        int petrolLeft = 0;
        int totalPetrol = 0;

        for (int i = 0; i < petrolpumps.size(); i++) {
            List<Integer> petrolPump = petrolpumps.get(i);
            int petrol = petrolPump.get(0);
            int distance = petrolPump.get(1);

            totalPetrol += petrol - distance;
            petrolLeft += petrol - distance;

            if (petrolLeft < 0) {
                start = i + 1;
                petrolLeft = 0;
            }
        }

        return totalPetrol >= 0 ? start : -1;
    }


    public static void main(String[] args) {
        System.out.println(truckTour(List.of(List.of(1, 5), List.of(10, 3), List.of(3, 4), List.of(8, 4))));
    }

}