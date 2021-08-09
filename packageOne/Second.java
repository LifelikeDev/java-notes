package com.lifelike.dev.packageOne;
import com.lifelike.dev.packageTwo.*;

public class Second {

    /* ACCESS MODIFIERS
       Default    -   classes or methods are only accessible to other classes within
                          the same package, and not outside of that package
       Public     -   classes or methods are accessible everywhere in the project
                          can be accessed outside of the name package as well
       Protected  -   methods are accessible only to sub-classes or
                          children classes of the parent class in any other package
       Private    -   methods are only visible and accessible to the class
                          in which such classes are defined
     */

    private String privateMessage = "This is a private message";
}
