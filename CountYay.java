public class CountYay {
    public static void main(String[] args) {
        for(int i = 100; i > 0; i--) {
            if(i % 3 == 0) {
                if(i % 3 == 0 && i % 11 == 0) {
                    System.out.print("Yay! ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
}