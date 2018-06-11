public class AppStarter {


    public static void main(String[] args) {

        Questao8 q8 = new Questao8();
        q8.retornaValor(159,155);

        Questao9 q9 = new Questao9(1);
        q9.insert(15);
        q9.insert(7);
        q9.insert(28);
        q9.insert(12);
        q9.insert(35);

        q9.sum(12); // teste procurando valor


    }
}
