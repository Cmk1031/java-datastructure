package generic.test.ex3.unit;

public class UnitPrinter {
    /*
    UnitPrinter.printV1()` 은 제네릭 메서드로 구현해야 한다.
    `UnitPrinter.printV2()` 는 와일드카드로 구현해야 한다.
    이 두 메서드는 셔틀에 들어있는 유닛의 정보를 출력한다
     */

    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {

    }

    public static void printV2(Shuttle<? extends BioUnit> t1) {

    }

}
