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
public class DataStructureCw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Module module1 = new Module("U08500", "module1");
        Module module2 = new Module("U08300", "module2");
        Module module3 = new Module("U08800", "module3");
        Module module4 = new Module("U07500", "module4");
        Module module5 = new Module("U08400", "module5");
        Module module6 = new Module("U08700", "module6");
        Module module7 = new Module("U09000", "module7");
        Module module8 = new Module("U07300", "module8");
        Module module9 = new Module("U07800", "module9");
        Module module10 = new Module("U08300", "module10");
        ModuleBinaryTree modules = new ModuleBinaryTree();
        System.out.println("-----Starting to put a module-----");
        modules.add(module1);
        System.out.println("-----Starting to put a module-----");
        modules.add(module2);
        System.out.println("-----Starting to put a module-----");
        modules.add(module3);
        System.out.println("-----Starting to put a module-----");
        modules.add(module4);
        System.out.println("-----Starting to put a module-----");
        modules.add(module5);
        System.out.println("-----Starting to put a module-----");
        modules.add(module6);
        System.out.println("-----Starting to put a module-----");
        modules.add(module7);
        System.out.println("-----Starting to put a module-----");
        modules.add(module8);
        System.out.println("-----Starting to put a module-----");
        modules.add(module9);
        System.out.println("-----Starting to put a module-----");
        modules.add(module10);
        System.out.println("---------==========");

        System.out.println(modules.size());
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U08500");
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U08300");
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U08800");
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U07500");
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U08400");
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U08700");
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U09000");
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U07300");
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U07800");
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U01000");
        System.out.println("-----Starting to find a module-----");
        modules.getModule("U10000");
        ModuleBinaryTree tree2 = new ModuleBinaryTree();
        tree2.getModule("U08008");
        
        System.out.println("----printing out from the collection----");
        for(Module m: modules.getModules()){
            System.out.println(m.getModuleName());
        }
        System.out.println("The size of the collection is " + modules.getModules().size());
        
        System.out.println("-----Starting to remove a module-----");
        modules.remove("U07800");   
        
        System.out.println("---Creating tree2---");
        tree2 = new ModuleBinaryTree();
        tree2.add(module1);
        tree2.add(module2);
        System.out.println("---Removing module---");
        tree2.remove("U08500");
        System.out.println("-------get module 1:");
        tree2.getModule("U08500");
        System.out.println("-------get module 2:");
        tree2.getModule("U08300");
        
        System.out.println("---Creating tree3---");
        ModuleBinaryTree tree3 = new ModuleBinaryTree();
        tree3.add(module1);
        tree3.add(module3);
        System.out.println("---Removing module---");
        tree3.remove("U08500");
        System.out.println("-------get module 1:");
        tree3.getModule("U08500");
        System.out.println("-------get module 3");
        tree3.getModule("U08800");
        

        System.out.println("---Removing module---");
        modules.remove("U07500");
        System.out.println("---Removing module---");
        modules.remove("U07300");
        System.out.println("---Removing module---");
        modules.remove("U08300");        
        System.out.println("----printing out from the collection----");
        for(Module m: modules.getModules()){
            System.out.println(m.getModuleName());
        }
        
        System.out.println("---Removing module---");
        modules.remove("U08500");
        System.out.println("---getting module----");
        modules.getModule("U08800");
        System.out.println("---getting module----");
        modules.getModule("U08400");
        System.out.println("----printing out from the collection----");
        for(Module m: modules.getModules()){
            System.out.println(m.getModuleName());
        }
        
        System.out.println("---Removing module---");
        modules.remove("U08000");
        System.out.println("---Removing module---");
        modules.remove("U10000");
        System.out.println("----Creating a new tree----");
        ModuleBinaryTree tree4 = new ModuleBinaryTree();
        System.out.println("---Removing module---");
        tree4.remove("123456");
        
        System.out.println("-----pringting from the collection-----");
        for(Module m: modules.getModules()){
            System.out.println(m.getModuleName());
        }
        System.out.println("modules is empty? " + modules.isEmpty());
        modules.clear();
        System.out.println("modules is cleared");
        System.out.println("modules is empty? " + modules.isEmpty());
        System.out.println("-----printing from the collection------");
        
        System.out.println("=======Creating a student=========");
        Student person1 = new Student("Chan", "16076710", "Robotics");
        System.out.println("=====adding a module====");
        person1.addModule(module1);
        System.out.println("=====adding a module====");
        person1.addModule(module2);
        System.out.println("=====adding a module====");
        person1.addModule(module3);
        System.out.println("=====printing out from the collection====");
        for(Module m: person1.getModules()){
            System.out.println(m.getModuleName());
        }
        System.out.println("======removing a module=======");
        person1.removeModule("U08500");
        System.out.println("=====printing out from the collection====");
        for(Module m: person1.getModules()){
            System.out.println(m.getModuleName());
        }*/

        Student student1 = new Student("Chan", "16076710", "Robotics");
        Student student2 = new Student("hCan", "16076709", "Engineering");
        StudentAssociativeArray array = new StudentAssociativeArray();
        array.put(student1);
        System.out.println("-------------------");
        array.put(student2);
        System.out.println("-------------------");
        Student student3 = new Student("Ben", "16076708", "History");
        array.put(student3);

        array.remove("Ben");
        array.getStudent("hCan");
        array.getStudent("Chan");
        array.getStudent("Ben");

        Student student4 = new Student("Jack", "16076707", "Art");
        Student student5 = new Student("Jones", "16076706", "Politics");
        System.out.println("----------------------");
        array.put(student4);
        System.out.println("----------------------");
        array.put(student5);
        System.out.println("-----printing from the set---------");
        for (Student s : array.getStudents()) {
            System.out.println(s.getSurname());
        }
        array.getStudent("Ben");
        System.out.println("=====================");
        Student student6 = new Student("Chan", "Overwritten", "Overwritten");
        array.put(student6);

        System.out.println("Is student 2 in the array? " + array.containsValue(student2));
        System.out.println("Is Ben in the array? " + array.containsValue(student3));

        System.out.println("===================");
        System.out.println("Is the array empty? " + array.isEmpty());
        System.out.println("printing out surnames from the set");
        for (String s : array.keySet()) {
            System.out.println(s);
        }
        array.clear();
        System.out.println("The array is cleared");
        System.out.println("Is the array empty? " + array.isEmpty());

        array.remove("Me");
    }

}
