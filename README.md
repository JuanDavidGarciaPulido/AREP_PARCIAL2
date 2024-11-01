# AREP_PARCIAL2

## Descripción del proyecto
Este proyecto es una solución web que explora dos algoritmos de búsqueda: la búsqueda lineal y la búsqueda binaria. Se ha diseñado, construido y desplegado una aplicación web que estará disponible en tres máquinas virtuales EC2 de AWS.

## Tecnologías
- Maven
- Git
- GitHub
- Spring
- HTML5
- JavaScript

## Arquitectura

![Arquitectura del Proyecto](https://github.com/user-attachments/assets/222b6f30-e470-48aa-89d6-2db77b15ee2f)

**Math Services:** Servicio encargado de computar las funciones de ordenamiento (Búsqueda Lineal y Búsqueda Binaria).

**Service Proxy:** Recibe las solicitudes de los clientes y las delega a las dos instancias del servicio de ordenamiento utilizando un algoritmo de round-robin.

## Instalación y ejecución local del proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/JuanDavidGarciaPulido/AREP_PARCIAL2.git
   ```

2. Navegar a la carpeta raíz del proyecto:
   ```bash
   cd AREP_PARCIAL2
   ```

3. Compilar el código del proyecto y generar el archivo JAR:
   ```bash
   mvn clean install
   ```

4. Abrir tres terminales de comando y ejecutar el siguiente comando, cambiando el puerto según corresponda (8080 para el proxy, 8081 y 8082 para los Math Services):
   ```bash
   java -jar target/AREP_PARCIAL2-1.0-SNAPSHOT.jar --server.port=8080
   ```
   ```bash
   java -jar target/AREP_PARCIAL2-1.0-SNAPSHOT.jar --server.port=8081
   ```
   ```bash
   java -jar target/AREP_PARCIAL2-1.0-SNAPSHOT.jar --server.port=8082
   ```

![Ejecución Local](https://github.com/user-attachments/assets/27b0ff8a-582a-45d6-9a5c-268a8fff258a)

## Despliegue en EC2

1. Crear las tres instancias de EC2 (asegurarse de permitir tráfico en el puerto 8080 en todas las instancias).

![Despliegue en EC2](https://github.com/user-attachments/assets/9fb3aa29-7a46-4c47-87f0-d6ea6411a5ba)

2. Clonar los repositorios y compilarlos en cada una de las instancias (modificar la configuración del Proxy en el archivo `HttpConnectionExample`).

3. Ejecutar el siguiente comando en cada una de las instancias:
   ```bash
   java -jar target/AREP_PARCIAL2-1.0-SNAPSHOT.jar
   ```

Para usar la aplicación, ingresa a la dirección IP pública de la instancia del Proxy en el puerto 8080 de tu navegador. En este caso, sería: `http://54.83.191.205:8080/`.

## Video de demostración

[Demostración del funcionamiento](https://github.com/user-attachments/assets/a31fd176-d997-493c-9d2d-b8fc3b40e46c)
