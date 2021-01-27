package day26_arrays;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str="I love java, java is a cool programming and it's more useful than javascript";

        int count=0;
        int count1=0;

        String[] array=str.split(" ");

        for(int i=0; i<array.length; i++){

            if(array[i].toLowerCase().contains("java")){
                count++;

            }

            if(array[i].equalsIgnoreCase("java")){
                count1++;
            }


        }
        System.out.println(count);
        System.out.println(count1);
    }
}
