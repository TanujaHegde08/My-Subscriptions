import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static List< List<Double>> solution(double[] npCost, double budget) {
        List<List<Double>> res = new ArrayList<>();
        Arrays.sort(npCost);
        backtrack(res, new ArrayList<>(), npCost, budget, 0);
        return res;
    }

    public static void backtrack ( List<List<Double>> res, List<Double> tempList, double[] npCost, double remain, int start) {
        if(remain<0) return;
        else {
            if(tempList.size()>1) res.add(new ArrayList<>(tempList));

            for(int i=start; i<npCost.length; i++) {
                tempList.add(npCost[i]);
                backtrack(res, tempList, npCost, remain-npCost[i], i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        String[] npName = {"TOI", "HINDU", "ET", "BM", "HT"};
        double[] npCost = {26, 20.5, 34, 10.5, 18};

        HashMap<Double, String> myMap = new HashMap<>();

        for(int i=0; i<npName.length; i++)
            myMap.put(npCost[i], npName[i]);

        double budget = 40;
        List<List<Double>> result = solution(npCost, budget);

        //mapping the sum to the corrosponding npName;
        List<List <String>> strResult = new ArrayList<>();
        for(int i=0; i<result.size(); i++) {
            List< String> combination = new ArrayList<>();
            List<Double> curr = result.get(i);

            for(int j=0; j<curr.size(); j++)
                combination.add(myMap.get(curr.get(j)));

            strResult.add(combination);
        }

        for(int i=0; i< strResult.size(); i++)
            System.out.println(strResult.get(i));
    }
}
