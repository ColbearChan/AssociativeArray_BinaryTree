/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurecw;

import java.util.Collection;

/**
 *
 * @author Daniel Brown revised D Lightfoot
 */
public interface IModuleBinaryTree {

    /**
     * Adds a Module object to binary search tree
     *
     * @pre true
     * @param module The module to add to the tree
     */
    public void add(Module module);

    /**
     * Empties the binary search tree
     *
     * @pre true
     */
    public void clear();

    /**
     * Retrieves a Module object from the tree for given an associated moduleID
     *
     * @pre true
     * @param moduleID The module ID of the Module object to be retrieved
     * @return a Module object with the moduleID equal to that provided,
     * otherwise if it does not exist returns null
     */
    public Module getModule(String moduleID);

    /**
     * Provides a Collection view of the Modules in the binary search tree
     *
     * @pre true
     * @return a Collection view of the Modules in the binary search tree
     */
    public Collection<Module> getModules();

    /**
     * Determines if the tree is empty or not.
     *
     * @pre true
     * @return true if the tree is empty, otherwise false
     */
    public boolean isEmpty();

    /**
     * Removes and returns a Module from the tree for a given module ID
     *
     * @param moduleID The module ID of the module to be removed
     * @pre true
     * @return the removed Module object with the provided moduleID, or null if
     * a Module with the provided moduleID does not exist.
     */
    public Module remove(String moduleID);

    /**
     * Returns the number of Modules in the tree
     *
     * @pre true
     * @return number of Modules in the tree. 0 if empty
     */
    public int size();

}
