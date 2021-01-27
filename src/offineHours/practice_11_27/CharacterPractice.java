package offineHours.practice_11_27;

public class CharacterPractice {

    public static void main(String[] args) {

        int countLetters=0;
        int countDigits=0;
        int countSpecialCha=0;

        for (int i=1; i<=Character.MAX_VALUE; i++){

            char each=(char)i;

            if(!Character.isLetterOrDigit(each)) {

                countSpecialCha++;
            }else if(Character.isLetter(each)){
                countLetters++;
            }else{
                countDigits++;
            }


        }

        System.out.println(countDigits);
        System.out.println(countLetters);
        System.out.println(countSpecialCha);







    }
}
