/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurecw;

/**
 *
 * @author Daniel Brown revised D Lightfoot 2018-02
 */
 
public interface IModule {

    /**
     * Retrieves the Module's ID
     * @pre true
     * @return the Module's ID
     */
    public String getModuleID();
    
    /**
     * Retrieves the name of the Module
     * @pre true
     * @return the name of the Module
     */
    public String getModuleName();
}
