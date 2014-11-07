package ${PACKAGE_NAME};
#parse("File Header.java")

import junit.framework.*;
#if (${TESTED_CLASS_PACKAGE_NAME} != "" && ${TESTED_CLASS_NAME} != "")
import ${TESTED_CLASS_PACKAGE_NAME}.${TESTED_CLASS_NAME};
#end

public class ${NAME} extends TestCase {
#if (${TESTED_CLASS_NAME} != "")
   ${TESTED_CLASS_NAME} object;
#end

    protected void setUp() throws Exception {
        object = new ${TESTED_CLASS_NAME}(); 
    }


}