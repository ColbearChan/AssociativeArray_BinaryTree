/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurecw;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author 16076710
 */
public class ModuleBinaryTree implements IModuleBinaryTree {

    private static ArrayList collection = new ArrayList<Module>();
    private static int moduleSize = 0;
    private static int depth = 1;
    private Module module;
    private ModuleBinaryTree left;
    private ModuleBinaryTree right;

    public ModuleBinaryTree() {

    }

    @Override
    public void add(Module m) {
        if (module == null) {
            System.out.println("This tree has a null module");
            module = m;
            System.out.println("Module is added in layer " + depth);
            depth = 1;
            moduleSize++;
            System.out.println("The size of the tree now is: " + moduleSize);

        } else if (m.getModuleID().compareTo(module.getModuleID()) > 0) {
            if (right == null) {
                System.out.println("The right tree of this tree is null");
                right = new ModuleBinaryTree();
                System.out.println("A new right tree is created");
            }
            System.out.println("Going to the right tree");
            depth++;
            right.add(m);
        } else if (m.getModuleID().compareTo(module.getModuleID()) < 0) {
            if (left == null) {
                System.out.println("The left tree of this tree is null");
                left = new ModuleBinaryTree();
                System.out.println("A new left tree is created");
            }
            System.out.println("Going to the left tree");
            depth++;
            left.add(m);

        } else {
            depth = 1;
            System.out.println("This module id is already exist");
        }
    }

    @Override
    public void clear() {
        module = null;
        left = null;
        right = null;
        moduleSize = 0;
    }

    @Override
    public Module getModule(String moduleID) {
        if (module == null) {
            System.out.println("There is no such module");
            depth = 1;
            return null;
        } else if (moduleID.compareTo(module.getModuleID()) > 0) {
            if (right != null) {
                System.out.println("Going to the right tree");
                depth++;
                return right.getModule(moduleID);
            } else {
                System.out.println("There is no such module");
                depth = 1;
                return null;
            }
        } else if (moduleID.compareTo(module.getModuleID()) < 0) {
            if (left != null) {
                System.out.println("Going to the left tree");
                depth++;
                return left.getModule(moduleID);
            } else {
                System.out.println("There is no such module");
                depth = 1;
                return null;
            }
        } else {
            System.out.println("The following module is found in layer "
                    + depth + " :");
            System.out.println("Module name: " + module.getModuleName());
            System.out.println("Module ID: " + module.getModuleID());
            depth = 1;
            return module;
        }
    }

    @Override
    public Collection<Module> getModules() {
        collection.clear();
        inOrderTraversal(this);
        return collection;
    }

    @Override
    public boolean isEmpty() {
        return module == null;
    }

    @Override
    public Module remove(String moduleID) {
        if (module == null) {
            System.out.println("There is no such module");
            return null;
        } else if (moduleID.compareTo(module.getModuleID()) > 0) {
            if (right != null) {
                System.out.println("Going to the right tree");
                return right.remove(moduleID);
            } else {
                System.out.println("There is no such module");
                return null;
            }
        } else if (moduleID.compareTo(module.getModuleID()) < 0) {
            if (left != null) {
                System.out.println("Going to the left tree");
                return left.remove(moduleID);
            } else {
                System.out.println("There is no such module");
                return null;
            }
        } else {
            System.out.println("Found the tree of this module");
            if (right == null && left == null) {
                System.out.println("This tree is a leaf");
                Module dummy = module;
                module = null;
                System.out.println("The following module is removed:");
                System.out.println(dummy.getModuleName());
                System.out.println(dummy.getModuleID());
                moduleSize--;
                System.out.println("The amount of modules now is " + moduleSize);
                return dummy;
            } else if (right == null && left != null) {
                System.out.println("This tree has a left descendent");
                Module dummy = module;
                module = left.module;
                right = left.right;
                left = left.left;
                System.out.println("The following module is removed:");
                System.out.println(dummy.getModuleName());
                System.out.println(dummy.getModuleID());
                moduleSize--;
                return dummy;
            } else if (right != null & left == null) {
                System.out.println("This tree has a right descendent");
                Module dummy = module;
                module = right.module;
                left = right.left;
                right = right.right;
                System.out.println("The following module is removed:");
                System.out.println(dummy.getModuleName());
                System.out.println(dummy.getModuleID());
                moduleSize--;
                return dummy;
            } else {
                System.out.println("This tree has two descendent");
                if (right.module == null && left.module != null) {
                    Module dummy = module;
                    module = left.module;
                    right = left.right;
                    left = left.left;
                    System.out.println("The following module is removed");
                    System.out.println(dummy.getModuleName());
                    System.out.println(dummy.getModuleID());
                    moduleSize--;
                    return dummy;
                } else if (right.module != null && left.module == null) {
                    Module dummy = module;
                    module = right.module;
                    left = right.left;
                    right = right.right;
                    System.out.println("The following module is removed");
                    System.out.println(dummy.getModuleName());
                    System.out.println(dummy.getModuleID());
                    moduleSize--;
                    return dummy;
                } else {
                    addTreeWhileRemoving(left, right);
                    Module dummy = module;
                    module = right.module;
                    left = right.left;
                    right = right.right;
                    System.out.println("The following module is removed:");
                    System.out.println(dummy.getModuleName());
                    System.out.println(dummy.getModuleID());
                    moduleSize--;
                    return dummy;
                }
            }
        }
    }

    private void addTreeWhileRemoving(ModuleBinaryTree additionTree,
            ModuleBinaryTree rootTree) {
        if (rootTree.left == null || rootTree.left.module == null) {
            rootTree.left = additionTree;
            System.out.println("The transition was successfull");
        } else {
            addTreeWhileRemoving(additionTree, rootTree.left);
        }
    }

    private void inOrderTraversal(ModuleBinaryTree t) {
        if (t != null) {
            inOrderTraversal(t.left);
            collection.add(t.module);
            inOrderTraversal(t.right);
        }
    }

    @Override
    public int size() {
        return moduleSize;
    }

}
