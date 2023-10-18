import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> firdtSet = new HashSet<>();
        System.out.println(firdtSet);


//         hashset -> mutable
        var secondSet = new HashSet<Integer>();
        secondSet.add(7);
        secondSet.add(1);
        secondSet.add(7);

//        sets can't have duplicates

        System.out.println(secondSet.size());
        System.out.println(secondSet);


//        immutable set
//        Set.of -> immutable
        var immutable = Set.of(1, 2, 3, 4);
//        immutable.add(10);
        System.out.println(immutable.size());



//        union
        Set<Integer> union = new HashSet<>();
        union.addAll(secondSet);
        union.addAll(immutable);
        System.out.println(union);
        System.out.println(union.size());



//        intersection
        Set<Integer> intersection = new HashSet<>(secondSet);
        intersection.retainAll(immutable);
        System.out.println(intersection);
        System.out.println(intersection.size());

    }
}
