# TP-Patrones-Estructurales

# Integrantes
- Enzo Matías Gonzalez - *50504*
- Juan Pablo Manucha - *48562*
- Jairo Axel Martinez - *50089*

## Descripción

Este repositorio contiene un trabajo práctico sobre *patrones de diseño estructurales* en Java.  
El objetivo es ilustrar cómo aplicar distintos patrones para organizar y simplificar la forma en que las clases y objectos 
se relacionan entre sí de forma mas flexible, desacoplada y reutilizable.

## Patrones incluidos

Los patrones estructurales que fueron abordados son:

- *Adapter*
- *Brigde*
- *Composite*
- *Decorator*
- *Facade*
- *Flyweight*
- *Proxy*

## Estructura del proyecto

TP-PatronesCreacionales/  
├── src/  
│ ├── Adapter/  
│ │ ├── Main.java   ← Punto de entrada de la aplicación   
│ │ └── ....        ← Clases que implementan los patrones  
│ ├── Bridge/   
│ │ ├── Main.java   ← Punto de entrada de la aplicación   
│ │ └── ....        ← Clases que implementan los patrones  
│ ├── Composite/  
│ │ ├── Main.java   ← Punto de entrada de la aplicación   
│ │ └── ....        ← Clases que implementan los patrones    
│ ├── Decorator/  
│ │ ├── Main.java   ← Punto de entrada de la aplicación   
│ │ └── ....        ← Clases que implementan los patrones    
│ ├── Facade/  
│ │ ├── Main.java   ← Punto de entrada de la aplicación   
│ │ └── ....        ← Clases que implementan los patrones  
│ ├── Flyweight/  
│ │ ├── Main.java   ← Punto de entrada de la aplicación   
│ │ └── ....        ← Clases que implementan los patrones  
│ ├── Proxy/  
│ │ ├── Main.java   ← Punto de entrada de la aplicación   
│ │ └── ....        ← Clases que implementan los patrones   
├── .gitignore  
├── LICENSE  
└── README.md  


- `Main.java` contiene la clase principal que ejecuta ejemplos de los patrones.
- Cada patrón está organizado dentro de su carpeta que lleva el nombre del patrón.

## Cómo compilar y ejecutar

1. Asegúrate de tener instalado **JDK 21**.
2. Desde la raíz del proyecto, compila todos los archivos Java en un directorio `out`:

   ### En Linux / macOS
   ```bash
   javac -d out $(find src -name "*.java")
   ```
   ### En Windows PowerShell
   ```bash
   javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName })
   ```
3. Ejecuta la clase principal:
   ```bash
   java -cp out Main
   ```