package top.homework.设计模式.实验11.题1;

import java.util.*;

// 学生类
class Student57 {
    private String name;
    private int age;
    private String gender;

    public Student57(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gender='" + gender + "'}";
    }
}

// 班级类，包含学生列表
class Class57 implements Iterable<Student57> {
    private List<Student57> students;

    public Class57() {
        students = new ArrayList<>();
    }

    public void addStudent(Student57 student) {
        students.add(student);
    }

    @Override
    public Iterator<Student57> iterator() {
        // 返回一个按照年龄从大到小排序的迭代器
        return new AgeDescendingIterator57(students);
    }
}

// 自定义迭代器，按照年龄从大到小排序
class AgeDescendingIterator57 implements Iterator<Student57> {
    private List<Student57> sortedStudents;
    private int currentIndex;

    public AgeDescendingIterator57(List<Student57> students) {
        // 对学生列表进行排序
        sortedStudents = new ArrayList<>(students);
        sortedStudents.sort(Comparator.comparingInt(Student57::getAge).reversed());
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < sortedStudents.size();
    }

    @Override
    public Student57 next() {
        return sortedStudents.get(currentIndex++);
    }
}

// 客户端类
