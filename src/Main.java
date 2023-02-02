import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        System.out.println("Dizideki Elemanların Frekansı");

        int [] list = {10, 20, 20, 10 , 10, 20, 5, 10};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        int count;
        for (int i = 0;i < list.length; i++ ){
            count = 1;
            for (int j = 0; j< list.length; j++){
                if(i!=j  &&  (list[i]==list[j])){
                    count++;
                }
            }
            if (i == 0 && list[i] == list[i + 1]) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
            if (i == 0 && list[i] != list[i + 1]) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
            if (i != 0 && list[i] != list[i - 1]) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
        }
    }
}
