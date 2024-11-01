# AREP_PARCIAL2
# Descripción del proyecto:
Solución web que explora dos algortimos de búsqueda, la búsqueda lineal y la búsqueda binaria mediante el diseño, construya y despliegue un aplicación web la cual estará desplegada en tres máquinas virtuales de EC2 de AWS.

## Tecnologías 
Maven, git, github, Spring, html5, y js.

## Arquitectura

![image](https://github.com/user-attachments/assets/222b6f30-e470-48aa-89d6-2db77b15ee2f)

Math Services: Servicio para computar las funciones de ordenamiento (Linear Search y Binary Search).

Service Proxy: Recibe las solicitudes de llamado desde los clientes y se las delega a las dos instancias del servicio de ordenamiento usando un algoritmo de round-robin.

# Instalación y ejecución local del proyecto
Clonar el repositorio: git clone https://github.com/JuanDavidGarciaPulido/AREP_PARCIAL2.git

Navegar a la carpeta raíz del proyecto: cd AREP_PARCIAL2

Compilar código del proyecto y generar jar: mvn clean install

Abrir tres terminales de comando y ejecutar el comando  java -jar cambiando el puerto (8080 para el proxy, 8081 y 8082 para los Math Service)

    ```
        java -jar target/AREP_PARCIAL2-1.0-SNAPSHOT.jar --server.port=8080
    ```

    ```
        java -jar target/AREP_PARCIAL2-1.0-SNAPSHOT.jar --server.port=8081
    ```
    
    ```
        java -jar target/AREP_PARCIAL2-1.0-SNAPSHOT.jar --server.port=8082
    ```

![image](https://github.com/user-attachments/assets/27b0ff8a-582a-45d6-9a5c-268a8fff258a)

# Como desplegar en EC2

## Crear las tres instancias de EC2 (Permitir tráfico en el puerto 8080 en todas las instancias)

![image](https://github.com/user-attachments/assets/9fb3aa29-7a46-4c47-87f0-d6ea6411a5ba)

Clonar los repositorios y compilarlos en dichas instancias (Modificar la Configuración del Proxy en el archivo HttpConnectionExample)

Ejecutar el comando en cada una de las instancias:
    ```
        java -jar target/AREP_PARCIAL2-1.0-SNAPSHOT.jar 
    ```
Para usar la aplicación se debe ingresar a la dirección IP pública de la instancia del Proxy en el puerto 8080 de nuestro navegador, en este caso es http://54.83.191.205:8080/


# Video demostración funcionamiento.


https://github.com/user-attachments/assets/a31fd176-d997-493c-9d2d-b8fc3b40e46c




