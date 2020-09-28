/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurecw;

import java.util.Set;
/**
 *
 * @author Daniel Brown revised D Lightfoot 2018-02 
 *  Collection changed to Set 2018-02-23
 */
 
public interface IStudentAssociativeArray {
    
    /**
     * Empties the associative array.
     * @pre true
     */
    public void clear();
    
    /**
     * Determines whether a Student surname exists as a key inside the associative
     * array.
     * @pre true
     * @param surname The student surname (key) to locate
     * @return true iff the surname exists as a key in the associative array
     */
    public boolean containsSurname(String surname);
        
    
    /**
     * Determines whether a Student object exists as a value inside the associative
     * array.
     * @pre true
     * @param student The Student object to locate
     * @return true iff the Student object 'student' exists as a value in the associative array
     */
    public boolean containsValue(Student student);
    
    /**
     * Returns a Student object mapped to the supplied surname.
     * @pre true
     * @param surname The student surname (key) to locate
     * @return the Student object mapped to the key surname if the surname
     * exists as key in the associative array, otherwise null
     */
    public Student getStudent(String surname);
    
    /**
     * Determines if the associative array is empty or not.
     * @pre true
     * @return true iff the associative array is empty
     */
    public boolean isEmpty();
    
    /**
     * Returns a Set view of the surnames (keys) contained by the associative
     * array
     * @pre true
     * @return a Set view of the surnames (keys) contained by the associative
     * array
     */
    public Set<String> keySet();
    
    /**
     * Inserts a Student into the associative array, with the key of the supplied
     * Student's surname.
     * Note: If the surname already exists as a key, then then the original entry is
     * overwritten. This method should return the previous associated value if one exists, otherwise null
     * @pre true
     */
    public Student put(Student student);
    
    /**
     * Removes and returns a Student from the associative array, with the key
     * the supplied surname.
     * @param surname The surname (key) to remove.
     * @pre true
     * @return the removed Student object mapped to the surname, or null if
     * the surname does not exist.
     */
    public Student remove(String surname);
    
    /**
     * Returns the number of Students in the associative array
     * @pre true
     * @return number of Students in the associative array. 0 if empty
     */
    public int size();
    
    /**
     * Returns a Set view of the Students contained by the associative
     * array
     * @pre true
     * @return a Set view of Student objects contained by the associative
     * array
     */
    public Set<Student> getStudents();
    
}
