# Java OOP Fundamentos

Fundamentos de POO en Java aplicados en ejercicios prácticos: encapsulamiento,
herencia, polimorfismo y abstracción.

## Estructura del repositorio

Cada paquete dentro de `src/` corresponde a un tema trabajado:

- **`basicos/`** — Clases, objetos, atributos, métodos y constructores.
    - `Persona`

- **`encapsulamiento/`** — Atributos `private`, getters/setters, validaciones.
    - `CuentaBancaria`

- **`herencia/`** — `extends`, `super`, `@Override`, polimorfismo con clases padre/hija.
    - `Animal` (padre) → `Perro`, `Gato` (hijas)

- **`abstraccion/`** — Dos formas de lograr abstracción en Java.
    - `abstract class`: `Vehiculo` (padre) → `Carro`, `Moto` (hijas)
    - `interface`: `FiguraGeometrica` → `Circulo`, `Cuadrado`

- **`interfaces/`** — Interfaces múltiples (una clase implementando varios contratos a la vez).
    - `Volador`, `Nadador` → `Pato` (implementa ambas)

- **`excepciones/`** — Manejo de errores en tiempo de ejecución.
    - `Main` — `try/catch` básico con `ArrayIndexOutOfBoundsException`.
    - `MainFinally` — bloque `finally`, se ejecuta siempre haya error o no.
    - `Rana`, `MainThrow` — `throw` con excepción genérica de Java.
    - `MainChecked` — checked exception (`FileNotFoundException`).
    - `EdadInvalidaException`, `MainPersonalizada` — excepción personalizada,
      heredando de `RuntimeException`.

- **`colecciones/`** — Estructuras de datos dinámicas de la librería estándar.
    - `MainArrayList`, `Producto`, `MainInventario` — `ArrayList`: listas dinámicas,
      mantienen orden de inserción, permiten duplicados.
    - `MainHashMap` — `HashMap`: pares clave-valor, sin orden garantizado,
      claves únicas.
    - `MainHashSet` — `HashSet`: valores únicos, sin duplicados, sin orden garantizado.

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA (o cualquier IDE compatible con Java).
2. Ejecutar la clase `main` correspondiente al paquete que se quiera probar
   (cada paquete tiene su propia clase de prueba con `main`).

## Progreso

- [x] Clases, objetos, constructores
- [x] Encapsulamiento
- [x] Herencia
- [x] Polimorfismo
- [x] Abstracción (abstract class)
- [x] Abstracción (interface)
- [x] Interfaces múltiples
- [x] Excepciones (try/catch, finally, throw, checked/unchecked, personalizadas)
- [x] Colecciones (ArrayList, HashMap, HashSet)
- [ ] Generics
- [ ] Streams y expresiones lambda