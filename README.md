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
- [ ] Excepciones
- [ ] Colecciones (ArrayList, HashMap, etc.)
- [ ] Generics
- [ ] Streams y expresiones lambda