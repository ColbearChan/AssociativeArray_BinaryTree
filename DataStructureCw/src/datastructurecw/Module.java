/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurecw;

/**
 *
 * @author 16076710
 */
public class Module implements IModule {

    private String moduleId;
    private String moduleName;

    public Module(String moduleId, String moduleName) {
        this.moduleId = moduleId;
        this.moduleName = moduleName;
    }

    @Override
    public String getModuleID() {
        return moduleId;
    }

    @Override
    public String getModuleName() {
        return moduleName;
    }

}
