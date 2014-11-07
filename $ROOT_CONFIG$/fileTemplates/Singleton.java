package ${PACKAGE_NAME};
#parse("File Header.java")
public class ${NAME}{
    private static ${NAME} instance = new ${NAME}();

    public static ${NAME} getInstance(){
        return instance;
    }

    private ${NAME}(){
    }
}

