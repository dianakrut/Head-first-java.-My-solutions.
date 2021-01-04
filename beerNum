public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;

        while (beerNum > 0) {
            String word = getString(beerNum);

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу");

            beerNum = beerNum - 1;
            word = getString(beerNum);

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }

    private static String getString(int beerNum) {
        String word = "бутылок";
        if (beerNum <= 5 || beerNum > 20) {
            if (beerNum % 10 == 1) {
                word = "бутылка";
            } else if (beerNum % 10 < 5) {
                word = "бутылки";
            }
        }
        return word;
    }
}
