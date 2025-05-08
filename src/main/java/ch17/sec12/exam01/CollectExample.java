package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("김자바", "남", 95));
        totalList.add(new Student("오해어", "여", 93));

//        stream 안 쓰고
//        List<Student>maleList = new ArrayList<>();
//        for(Student student : totalList){
//            if(student.getSex().equals("남")){
//                maleList.add(student);
//            }
//        }

//        상위 2명
//        List<Student>topList = totalList.stream()
//                .sorted((a,b)->Integer.compare(b.getScore(),a.getScore()))
//                .limit(2)
//                .toList();
//        totalList.forEach(System.out::println);

        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();
        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));
        System.out.println();

        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );
        System.out.println(map);
    }
}
