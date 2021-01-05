public class Phrases {
    public static void main(String[] args) {
        String[] Wordlist1 = {"красивый", "умопомрачительный", "нестандартный", "великий", "благородный", "нерпинужденный",
                "ограниченный", "посредственный", "таинственный", "неизбежный"};
        String[] Wordlist2 = {"английский", "бюрократический", "фэнтезийный", "архетипичный", "англо-саксонский", "отечественный",
                "советский", "механический"};
        String[] Wordlist3 = {"метод", "язык", "казус", "уровень развития", "факап", "практикум", "шаблон", "клон",
                "класс", "массив", "радиус взаимодействия", "прибор"};
        int a = Wordlist1.length;
        int b = Wordlist2.length;
        int c = Wordlist3.length;

        int rand1 = (int) (Math.random()*a);
        int rand2 = (int) (Math.random()*b);
        int rand3 = (int) (Math.random()*c);

        String phrases = Wordlist1[rand1] + " " + Wordlist2[rand2] + " " + Wordlist3[rand3];
        System.out.println(phrases);
    }
}