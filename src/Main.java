import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 7, 13, 2};
        List<List<Integer>> subsets = new ArrayList<>();
        subSet(arr, 0, new ArrayList<>(),subsets);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
        System.out.println("[]");
    }

    public static void subSet(int[] arr, int n, List<Integer> count,List<List<Integer>> subsets) {
        if (!count.isEmpty()){
            subsets.add(new ArrayList<>(count));
        }
        for (int i = n; i < arr.length; i++) {
            count.add(arr[i]);
            subSet(arr, i+1, count, subsets);
            count.remove(count.size()-1);
        }
    }
}