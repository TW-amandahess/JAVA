package desafios; // Indica a pasta onde o arquivo está

import java.util.HashMap;
import java.util.Map;

public class Desafio01_TwoSum { // O nome da classe deve ser igual ao do arquivo

    // Cada desafio terá seu próprio método main para você testar isoladamente
    public static void main(String[] args) {
        Desafio01_TwoSum solucao = new Desafio01_TwoSum();

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