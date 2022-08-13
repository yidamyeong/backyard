package designpatterns.prototype.example;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student david = new Student("David");
        Student jason = new Student("Jason");
        List<Student> students = new ArrayList<>();
        students.add(david);
        students.add(jason);

        // List 는 Cloneable 를 구현하지 않음. (ArrayList 는 함)
        // 따라서 아래 코드는 컴파일 에러
//        List<Student> clone = ((ArrayList<Student>) students).clone();

        // 대신 이 방법으로 쓴다.
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }

}
