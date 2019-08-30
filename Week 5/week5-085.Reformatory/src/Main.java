
public class Main {

    public static void main(String[] args) {
        
        Reformatory eastHelsinkiReformatory = new Reformatory();

        Person brian = new Person("Brian", 33, 175, 78);
        Person pekka = new Person("Mikko", 0, 52, 4);

        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(pekka);
        eastHelsinkiReformatory.weight(pekka);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);

        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

    }
}
