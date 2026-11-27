LIBRERÍAS (.jar) DEL PROYECTO
=============================
Este proyecto no usa Maven ni Gradle. Descarga estos .jar y ponlos
directamente en esta carpeta (lib/). Usa versiones recientes.

1. sqlite-jdbc  (driver de SQLite, de xerial)
   Archivo: sqlite-jdbc-<versión>.jar
   Dónde:   https://github.com/xerial/sqlite-jdbc/releases
            o Maven Central: org.xerial : sqlite-jdbc

2. FlatLaf  (look and feel moderno para Swing)
   Archivo: flatlaf-<versión>.jar
   Dónde:   https://www.formdev.com/flatlaf/  (sección Download)
            o Maven Central: com.formdev : flatlaf

3. slf4j-api  (probablemente necesario)
   Las versiones nuevas de sqlite-jdbc usan SLF4J para sus mensajes de
   log. Si al ejecutar aparece NoClassDefFoundError: org/slf4j/...,
   descarga este jar.
   Archivo: slf4j-api-<versión>.jar
   Dónde:   Maven Central: org.slf4j : slf4j-api
   Nota: si después sale el aviso "No SLF4J providers were found", es
   solo una advertencia; el programa funciona. (Para quitarla puedes
   agregar slf4j-nop-<misma versión>.jar.)

CÓMO SE USAN
------------
- VS Code: .vscode/settings.json ya incluye "lib/**/*.jar", así que se
  detectan solos (revisa "Referenced Libraries" en el panel JAVA PROJECTS).
- Eclipse: clic derecho en el proyecto > Build Path > Configure Build
  Path > Libraries > Add JARs... y selecciona los .jar de lib/.
