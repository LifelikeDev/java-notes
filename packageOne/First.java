package com.lifelike.dev.packageOne;
import com.lifelike.dev.packageTwo.*;

public class First {

        protected String protectedMessage = "Here's some protected message";

//    public static void main(String[] args) {
//
//       /* ACCESS MODIFIERS
    //       Default    -   classes or methods are only accessible to other classes within
    //                          the same package, and not outside of that package
    //       Public     -   classes or methods are accessible everywhere in the project
    //                          can be accessed outside of the name package as well
    //       Protected  -   methods are accessible only to sub-classes or
    //                          children classes of the parent class in any other package
    //       Private    -   methods are only visible and accessible to the class
    //                          in which such classes are defined
//         */
//        Third thirdClass = new Third();
//
//
//        // defaultMessage not accessible to this class since it has a default access
//        // modifier and is only accessible to classes within packageTwo
////        System.out.println(thirdClass.defaultMessage);
//
//        System.out.println(thirdClass.publicMessage);
//
//        // protectedMessage not accessible to this class since this class is not a
//        // a sub-class of Third
////        System.out.println(thirdClass.protectedMessage);
//
//    }

    public static void main(String[] args) {

        Second second = new Second();
        // privateMessage not accessible to this class since it is private and only
        // visible to the class in which it is defined
//        System.out.println(second.privateMessage);

    }


}
