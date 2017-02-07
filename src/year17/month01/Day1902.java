package year17.month01;

public class Day1902 {

}

class Parent {
    public Parent method01() {
        return new Parent();
    }

    public void method02(Parent parent) {

    }
}

class Sub extends Parent {

    @Override
    public Sub method01() {
        return new Sub();
    }

    // @Override
    public void method02(Sub sub) {
    }

}
