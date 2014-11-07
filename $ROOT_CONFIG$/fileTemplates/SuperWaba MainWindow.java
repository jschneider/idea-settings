package ${PACKAGE_NAME};

#parse("File Header.java")

import waba.ui.*; import waba.fx.*;

public class ${NAME} extends MainWindow {

String col0[] = {"Options","Cut","Copy","Paste"}; String col1[] = {"About ${NAME}","Info"};

public ${NAME}() { setDoubleBuffer(true); setBorderStyle(TAB_ONLY_BORDER); setTitle("${NAME}"); setMenuBar(new MenuBar(new String[][]{col0,col1})); }

public void onStart() {

}

public void onEvent(Event event) {

}

public void onPaint(Graphics g) {

}

} 