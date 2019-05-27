/**
 * Created by catr1ne55 on 20.05.17.
 */
class Converter {
    private static String[] Rome = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static int[] Arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int romeToArab(String rome) {

        StringBuffer romeNumber = new StringBuffer(rome);
        int arabNumber = 0, i = 0;
// Проверяем переданную строку на наличие символов
        if (romeNumber.length() > 0) {
            while (true) {
                do {

                    if (Rome[i].length() <= romeNumber.length()) {
                        // Выделяем из строки подстроку и сравниваем со
                        // значением из массива Arab
                        if (Rome[i].equals(romeNumber.substring(0, Rome[i].length()))) {
                            // После чего прибавляем число соответствующее
                            // индексу элемента римской цифры из массива Arab
                            arabNumber += Arab[i];
                            // и удаляем из строки римскую цифру
                            romeNumber.delete(0, Rome[i].length());
                            if (romeNumber.length() == 0)
                                return arabNumber;
                        } else
                            break;
                    } else
                        break;
                } while (romeNumber.length() != 0);
                i++;
            }
        }
        return 0;

    }

    public static String arabToRome(int num) {
        String roman = "";

        while (num > 0) {
            int maxFound = 0;
            for (int i=0; i < Arab.length; i++) {
                if (num >= Arab[i]) {
                    maxFound = i;
                    break;
                }
            }
            roman += Rome[maxFound];
            num -= Arab[maxFound];
        }

        return roman;

    }
}
