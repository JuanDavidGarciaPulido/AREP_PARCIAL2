# AREP_PARCIAL2
Avance parcial: Creación de instancias EC2 e instalación de programas necesarios, clases base creadas, POM actualizado y corregido, index.html adaptado, ambas funciones de búsqueda implementadas. 

# Descripción del proyecto:
Solución web que explora dos algortimos de búsqueda, la búsqueda lineal y la búsqueda binaria mediante el diseño, construya y despliegue un aplicación web la cual estará desplegada en tres máquinas virtuales de EC2 de AWS.
## Tecnologías 
Maven, git, github, Spring, html5, y js.

## Arquitectura

![image](https://github.com/user-attachments/assets/222b6f30-e470-48aa-89d6-2db77b15ee2f)

Math Services: Servicio para computar las funciones de ordenamiento (Linear Search y Binary Search).

Service Proxy: Recibe las solicitudes de llamado desde los clientes y se las delega a las dos instancias del servicio de ordenamiento usando un algoritmo de round-robin.

## Funcionamiento

# Instalación
Clonar el repositorio: git clone https://github.com/JuanDavidGarciaPulido/AREP_PARCIAL2.git

Compilar clases del proyecto: mvn clean install



# Como correrlo en EC2

## Crear las tres instancias de EC2
![image](https://github.com/user-attachments/assets/9fb3aa29-7a46-4c47-87f0-d6ea6411a5ba)

## Clonar los repositorios y compilarlos en dichas instancias

## Ejecutar el proyecto usando el comando: 



# Video demostración funcionamiento.


