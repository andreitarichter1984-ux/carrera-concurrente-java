# Simulador de carrera concurrente en Java

Simulador de una carrera de caballos desarrollado como actividad del módulo de **Programación de Servicios y Procesos** del ciclo de Desarrollo de Aplicaciones Multiplataforma (DAM).

## Captura

<img width="792" height="475" alt="carrera-ganador" src="https://github.com/user-attachments/assets/a159a5e1-59db-4d4f-bc5f-bd9a84d19798" />



## Funcionamiento

- Cada caballo es un **hilo** independiente que avanza por tramos con **tiempos aleatorios**.
- Los nombres de los caballos se pueden cambiar antes de empezar la carrera.
- Las **barras de progreso** se actualizan en tiempo real mientras los hilos corren, sin bloquear la ventana.
- Un hilo "juez" espera con `join()` a que lleguen los tres caballos y anuncia el ganador.

## Tecnologías

- **Java**: hilos con `Runnable`, `Thread` y `join()`
- **Swing**: interfaz gráfica con `JProgressBar`, diseñada con el editor visual de NetBeans
- `SwingUtilities.invokeLater` para actualizar la interfaz de forma segura desde otros hilos
- **Maven** para la gestión del proyecto

## Estructura

- `CaballoEj3.java`: cada caballo, implementado como `Runnable`.
- `VentanaCarrera.java`: la ventana, que lanza los hilos y muestra el ganador.
- `CarreraDeCaballosEj3.java`: clase principal que abre la ventana.

## Autora

Andrea Amador Richter, estudiante de DAM en Planeta FP (Málaga).
