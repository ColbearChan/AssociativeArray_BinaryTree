/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurecw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 16076710
 */
public class StudentAssociativeArray implements IStudentAssociativeArray {

    private Set<Student> studentSet = new HashSet<Student>();
    private Set<String> surnameSet = new HashSet<String>();
    private int arraySize = 2;
    private int studentSize = 0;
    private Student[] arrainas = new Student[arraySize];
    private double loadFactor = 0;

    public StudentAssociativeArray() {

    }

    @Override
    public void clear() {
        arrainas = new Student[arraySize];
        surnameSet.clear();
        studentSet.clear();
    }

    @Override
    public boolean containsSurname(String surname) {
        boolean contain = false;
        for (String s : surnameSet) {
            if (s.equals(surname)) {
                contain = true;
            }
        }
        return contain;
    }

    @Override
    public boolean containsValue(Student student) {
        boolean contain = false;
        for (Student s : studentSet) {
            if (s.equals(student)) {
                contain = true;
            }
        }
        return contain;
    }

    @Override
    public Student getStudent(String surname) {
        int key = 0;
        int position;
        int index = 1;
        System.out.println("starting to get student");
        for (int i = 0; i < surname.length(); i++) {
            key = key + (int) surname.charAt(i);
        }
        System.out.println("the key is " + key);
        position = key % arrainas.length;
        System.out.println("The position would be " + position);
        try {
            while (!arrainas[position].getSurname().equals(surname)
                    && arrainas[position] != null) {
                position = (position + index ^ 2) % arrainas.length;
                System.out.println("The student is not here, the next position is "
                        + position);
                index++;
            }
        } catch (NullPointerException e) {

        }
        if (arrainas[position] == null
                || !arrainas[position].getStatus()) {
            System.out.println("There is no such a student here");
            return null;
        } else {
            System.out.println("The following student is found:");
            System.out.println(arrainas[position].getSurname());
            System.out.println(arrainas[position].getStudentID());
            System.out.println(arrainas[position].getCourse());
            return arrainas[position];
        }
    }

    @Override
    public boolean isEmpty() {
        Student[] sample = new Student[arraySize];
        return Arrays.equals(sample, arrainas);
    }

    @Override
    public Set<String> keySet() {
        return surnameSet;
    }

    @Override
    public Student put(Student student) {
        System.out.println("The current load factor is " + loadFactor);
        int key = 0;
        int probingIndex = 1;
        int position;
        if (loadFactor > 0.75) {
            System.out.println("The current load factor is over 75%");
            System.out.println("Activate resizing");
            loadFactorReaching();
        }
        System.out.println("starting to put student");
        for (int i = 0; i < student.getSurname().length(); i++) {
            key = key + (int) student.getSurname().charAt(i);
        }
        System.out.println("the key is " + key);
        position = key % arrainas.length;
        System.out.println("The position would be " + position);
        if (containsSurname(student.getSurname())) {
            while (arrainas[position] != null
                    && !arrainas[position].getSurname().
                            equals(student.getSurname())) {
                position = (position + probingIndex ^ 2) % arrainas.length;
                System.out.println("The position is used, the next position is "
                        + position);
                probingIndex++;
            }
            Student s = getStudent(student.getSurname());
            System.out.println(s.getSurname() + s.getCourse() + s.getStudentID()
                    + " is going to be overwritten");
            arrainas[position] = student;
            System.out.println("The student is added to the array in position "
                    + position);
            studentSet.remove(s);
            studentSet.add(student);
            return s;
        } else {
            while (arrainas[position] != null) {
                position = (position + probingIndex ^ 2) % arrainas.length;
                System.out.println("The position is used, the next position is "
                        + position);
                probingIndex++;
            }
            arrainas[position] = student;
            System.out.println("The student is added to the array in position "
                    + position);
            studentSet.add(student);
            surnameSet.add(student.getSurname());
            studentSize++;
            loadFactor = (double) studentSize / (double) arraySize;
            return null;
        }
    }

    @Override
    public Student remove(String surname) {
        System.out.println("Starts to remove the student");
        if (getStudent(surname) != null) {
            studentSet.remove(getStudent(surname));
            getStudent(surname).setStatus(false);
            surnameSet.remove(surname);
            System.out.println("Student " + surname + " is removed.");
            return getStudent(surname);
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        return studentSize;
    }

    @Override
    public Set<Student> getStudents() {
        return studentSet;
    }

    private void loadFactorReaching() {
        System.out.println("The previous array size is " + arraySize);
        System.out.println("The previous student size is " + studentSize);
        System.out.println("The previous load factor is " + loadFactor);
        arraySize = arraySize * 2;
        System.out.println("The new array size is " + arraySize);
        studentSize = 0;
        Student[] newArray = new Student[arraySize];
        for (Student s : studentSet) {
            int key = 0;
            int index = 1;
            int position;

            for (int i = 0; i < s.getSurname().length(); i++) {
                key = key + (int) s.getSurname().charAt(i);
            }
            System.out.println("the key is " + key);
            position = key % newArray.length;

            while (newArray[position] != null) {
                position = (position + index ^ 2) % newArray.length;
                System.out.println("The position is used, the next position is "
                        + position);
                index++;
            }
            newArray[position] = s;
            System.out.println("The student is added to the new array "
                    + "in position " + position);
            studentSize++;
        }
        arrainas = newArray;
        loadFactor = (double) studentSize / (double) arraySize;
        System.out.println("The array size now is " + arraySize);
        System.out.println("The student size now is " + size());
        System.out.println("The load factor now is " + loadFactor);
    }
}
