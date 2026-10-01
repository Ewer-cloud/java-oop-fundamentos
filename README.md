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
    - `Libro`, `MainEqualsHashCode` — `equals()`/`hashCode()`: por qué `==` y el
      `equals()` heredado de `Object` comparan memoria, no contenido; cómo
      sobrescribirlos para que un `HashSet` reconozca objetos con los mismos
      datos como iguales.

- **`patrones/`** — Patrones de diseño aplicados con ejemplos propios.
    - `singleton/` — garantiza una única instancia de una clase en todo el
      programa, con constructor privado y un método estático de acceso.
        - `Configuracion` — ejemplo guiado (idioma de una app).
        - `ContadorVisitas` — ejercicio propio (contador compartido).
    - `factory/` — centraliza la creación de objetos relacionados en un solo
      método, para no repetir la lógica de decisión en todo el código.
        - `Animal` (abstracta), `Perro`, `Gato` — jerarquía de ejemplo.
        - `AnimalFactory` — decide qué clase instanciar según un texto.
    - `observer/` — un sujeto avisa automáticamente a una lista de
      observadores cuando ocurre algo, sin llamarlos uno por uno.
        - `Observador` (interfaz), `Sujeto`, `Suscriptor`.
    - `decorator/` — agrega comportamiento a un objeto envolviéndolo en
      capas, sin modificar su clase original ni usar una subclase por
      cada combinación posible.
        - `Cafe` (interfaz), `CafeSimple`, `CafeDecorador` (abstracta),
          `ConLeche`, `ConChocolate`.

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
- [x] equals() y hashCode()
- [x] Patrones de diseño (Singleton, Factory, Observer, Decorator)
- [ ] Generics
- [ ] Streams y expresiones lambda