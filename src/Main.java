import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Main solucao = new Main();

        int[] numbers = {1, 2, 5, 8, 15, 17};
        int target = 13;

        int[] resultado = solucao.twoSum(numbers, target);

        if (resultado.length > 0) {
            System.out.println("indices encontrados: [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("nenhuma combinacao encontrada");
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(numbers[i], i);
        }

        return new int[]{};
    }
}