import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т","У","Х"};
        for (int i = 0; i < letters.length; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                for (int k = 1; k < 199; k++) {
                    String letter = letters[i];
                    String region = String.valueOf(k);
                    if (k < 10) {
                        region = "0" + region;
                    }
                    String number = String.format("%s%d%d%d%s%s%s", letter, j, j, j, letter, letter, region);


                    ArrayList<String> list = new ArrayList<>();
                    list.add(number);
                    for (int l = 0; l < list.size(); l++) {
                        System.out.println(list.get(l));
                    }
                    Collections.sort(list);
                }




            }
        }
    }
}