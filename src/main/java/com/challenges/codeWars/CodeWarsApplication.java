package com.challenges.codeWars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CodeWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeWarsApplication.class, args);
    }

    //    Meu amigo John e eu somos membros do "Fat to Fit Club (FFC)". John está preocupado porque a cada mês uma lista com os pesos dos membros é publicada e a cada mês ele é o último da lista, o que significa que ele é o mais pesado.
//
//    Fui eu quem estabeleceu a lista, então eu disse a ele: "Não se preocupe mais, vou modificar a ordem da lista". Decidiu-se atribuir um "peso" aos números. O peso de um número será a partir de agora a soma de seus dígitos.
//
//    Por exemplo, 99 terá "peso" 18, 100 terá "peso" 1; portanto, na lista 100 virá antes de 99. Dada uma sequência com os pesos dos membros da FFC na ordem normal, você pode fornecer essa sequência ordenada pelos "pesos" de esses números?
//
//    Exemplo:
//            "56 65 74 100 99 68 86 180 90", ordenado pelos pesos dos números, passa a: "100 180 90 56 65 74 68 86 99"
//
//    Quando dois números têm o mesmo "peso", vamos classificá-los como se fossem strings (ordem alfabética) e não números: 100 é anterior a 180 porque seu "peso" (1) é menor que o de 180 (9) e 180 é anterior a 90, pois, tendo o mesmo "peso" (9), vem antes como uma corda.
//
//    Todos os números na lista são positivos e a lista pode estar vazia.
    public static String orderWeight(String strng) {
//        String[] sum = strng.split(" ");
//        String result = "";
//
//        for (int i = 0; i < sum.length ; i++) {
//            String[] numberI = sum[i].split("");
//            System.out.println("i==="+i);
//            long totalI = 0;
//            List<Long> drawI = new ArrayList<>();
//            for (int k = 0; k < numberI.length; k++) {
//                drawI.add(Long.parseLong(numberI[k]));
//                totalI += Long.parseLong(numberI[k]);
//            }
//            for (int j = 0; j < sum.length; j++) {
//                System.out.println(j);
//                List<Long> drawJ = new ArrayList<>();
//                long totalJ = 0;
//                String[] numberJ = sum[j].split("");
//                for (int k = 0; k < numberJ.length; k++) {
//                    drawJ.add(Long.parseLong(numberJ[k]));
//                    totalJ += Long.parseLong(numberJ[k]);
//                }
//                if (totalI <= totalJ) {
//                    if (totalI == totalJ) {
//                        if (drawI.get(0) >= drawJ.get(0)) {
//                            System.out.println("breaaaaaaaaaaak");
//                            continue;
////                            Expected :11 11 2000 10003 22 123 1234000 44444444 9999
////                            Actual   :22 2000 11 11 10003 123 1234000 44444444 9999
////                            Expected :11 11 2000 10003 22 123 1234000 44444444 9999
////                            Actual   :22 2000 11 11 10003 123 1234000 44444444 9999
//                        }
//                    }
//                    System.out.println("entrou fora do contine");
//                    String change = sum[i];
//                    sum[i] = sum[j];
//                    sum[j] = change;
//                }
//            }
//        }
        //implementar loop de um for so
        List<String> numbers = new ArrayList<>(Arrays.asList(strng.split(" ")));
        List<Long> heightVet = new ArrayList<>();
        Long[] SmallVet;
        long total = 0;
        long resultSmall = 999999;
        long resultHeight = 0;
        int min = 0;
        int max = 0;
        long heigh = 0;
        long small = 0;

        List<Long> drawJ = new ArrayList<>();
        for (int i = 4; i >= 1; i--) {
            for (int j = numbers.size() - 1; j >= 0; j--) {
                long convert = Long.parseLong(numbers.get(j));
                for (int k = 0; k < numbers.get(j).split("").length; k++) {
                    heightVet.add(Long.parseLong(numbers.get(j).split("")[k]));
                    total += Long.parseLong(numbers.get(j).split("")[k]);
                }
                System.out.println("numbers.size()");
                if (total > resultHeight) {
                    resultHeight = total;
                    total = 0;
                    max = j;
                    heigh = convert;
                } else if (total < resultSmall) {
                    resultSmall = total;
                    min = j;
                    small = convert;
                }
            }
            System.out.println(min+"and"+max);
            numbers.remove(heigh);
            numbers.remove(small);
//            numbers.remove(max);
            System.out.println(numbers.size());
            System.out.println(heigh + "and" + small);
        }

        return "result";
    }
}
