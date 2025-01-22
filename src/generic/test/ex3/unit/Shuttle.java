package generic.test.ex3.unit;

public class Shuttle<T extends BioUnit> {
    /*
    제네릭 타입 사용, showInfo() 메서드를 통해 탑승한 유닛의 정보를 출력한다.
     */

    private T unit;

    public void in(T unit) {
        this.unit = unit;
    }

    public void showInfo() {
        System.out.println(unit.getName() + unit.getHp());
    }

}
