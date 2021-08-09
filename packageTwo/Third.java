package com.lifelike.dev.packageTwo;
import com.lifelike.dev.packageOne.*;

public class Third {

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

    String someMessage = "\"This is some default message written as a String.\"";
    public String publicMessage = "\"This is some public message. All are welcome to read.\"";
    protected String protectedMessage = "Here's some protected message";




}
