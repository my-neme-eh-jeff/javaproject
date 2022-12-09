package javapracs;
class Parent {
    public void parentPrint() {
       System.out.println("parent print called");
    }
    public static void staticMethod() {
       System.out.println("parent static method called");
    }
 }
 public class superAndSubObject extends Parent {
    public void parentPrint() {
       System.out.println("child print called");
    }
    public static void staticMethod() {
       System.out.println("child static method called");
    }
    public static void main(String[] args) {
       //SubclassReference invalid = new Parent();//Type mismatch: cannot convert from Parent to          SubclassReference
       Parent obj = new superAndSubObject();
       obj.parentPrint(); //method of subclass would execute as subclass object at runtime.
       obj.staticMethod(); //method of superclass would execute as reference of superclass.
       Parent obj1 = new Parent();
       obj1.parentPrint(); //method of superclass would execute as superclass object at runtime.
       obj1.staticMethod(); //method of superclass would execute as reference of superclass.
       superAndSubObject obj3 = new superAndSubObject();
       obj3.parentPrint(); //method of subclass would execute as subclass object at runtime.
       obj3.staticMethod(); //method of subclass would execute as reference of subclass.
    }
 }
 