/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurecw;

import java.util.Collection;

/**
 *
 * @author 16076710
 */
public class Student implements IStudent {

    private String course;
    private String surname;
    private String studentId;
    private boolean status = true;
    private ModuleBinaryTree moduleTree = new ModuleBinaryTree();

    public Student(String surname, String course, String studentId) {
        this.course = course;
        this.studentId = studentId;
        this.surname = surname;
    }

    @Override
    public void addModule(Module module) {
        moduleTree.add(module);
    }

    @Override
    public String getCourse() {
        return course;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public Collection<Module> getModules() {
        return moduleTree.getModules();
    }

    @Override
    public String getStudentID() {
        return studentId;
    }

    @Override
    public Module removeModule(String moduleID) {
        return moduleTree.remove(moduleID);
    }

    public void setStatus(boolean s) {
        status = s;
    }

    public boolean getStatus() {
        return status;
    }

}
