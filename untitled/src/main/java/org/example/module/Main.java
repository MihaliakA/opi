package org.example.module;

interface Student {
    void study();
}

interface Teacher {
    void teach();
}

class ITStudent implements Student {
    @Override
    public void study() {
        System.out.println("IT student is studying");
    }
}

class ITTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("IT teacher is teaching");
    }
}

class ProgrammingStudent implements Student {
    @Override
    public void study() {
        System.out.println("Programming student is studying");
    }
}

class ProgrammingTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Programming teacher is teaching");
    }
}

interface UniversityFactory {
    Student createStudent();
    Teacher createTeacher();
}

class ITDepartmentFactory implements UniversityFactory {
    @Override
    public Student createStudent() {
        return new ITStudent();
    }

    @Override
    public Teacher createTeacher() {
        return new ITTeacher();
    }
}

class ProgrammingDepartmentFactory implements UniversityFactory {
    @Override
    public Student createStudent() {
        return new ProgrammingStudent();
    }

    @Override
    public Teacher createTeacher() {
        return new ProgrammingTeacher();
    }
}

public class Main {
    public static void main(String[] args) {
        UniversityFactory itFactory = new ITDepartmentFactory();
        Student itStudent = itFactory.createStudent();
        Teacher itTeacher = itFactory.createTeacher();

        UniversityFactory programmingFactory = new ProgrammingDepartmentFactory();
        Student programmingStudent = programmingFactory.createStudent();
        Teacher programmingTeacher = programmingFactory.createTeacher();

        itStudent.study();
        itTeacher.teach();

        programmingStudent.study();
        programmingTeacher.teach();
    }
}
