package homework3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HW {

    public static void main(String[] arg) {

        String[] words = ("Произведение «Обломов» начинается с описания внешности " +
                "Обломова и его жилья – в комнате бардак, которого хозяин будто не замечает, " +
                "грязь и пыль. Как рассказывает автор, накануне Илья Ильич получил письмо от старосты, " +
                "что в его родном поместье – Обломовке – нужно навести порядок, но он никак не решится " +
                "туда поехать, а только планирует и мечтает. Позвав после утреннего чаю своего слугу " +
                "Захара, они обсуждают необходимость съехать с квартиры, так как хозяину жилья, " +
                "как и разным поставщикам продуктов, Обломов давно не платит (нет денег), " +
                "и потому хозяин объявил, чтобы они съезжали.")
                .toLowerCase().split("[\\p{Space}\\p{Punct}]+");

        List<String> wordsList = Arrays.asList(words);

        HashSet<String> uno = new HashSet<>(wordsList); // уникальные через сет

        HashMap<String, Integer> countMap = new HashMap<>();

        Map<String, Long> collectMap = wordsList.stream().collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting())); // через стримы создаем мапу, функия отображает само на себя (т.е. возвращает слово, далее счет)
/*        for (String word : wordsList) {
            Integer counter = countMap.getOrDefault(word, 0) + 1;
            countMap.put(word, counter); */





/*            if (countMap.containsKey(word)) {
                Integer count = countMap.get(word) + 1;
                countMap.put(word, count);
            } else {
                countMap.put(word, 1);
            } */
//        }
    }
}

