package desafios;

public class Desafio01_TwoSum {

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
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[]{};
    }
}