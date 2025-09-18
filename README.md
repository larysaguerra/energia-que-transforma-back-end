# Energia que transforma - Backend

_Proyecto final de programa Talento Tech 2_

## Introducción 📺

_Este proyecto es el backend del proyecto final donde verificamos el uso de tecnologias como Java, Spring Boot y MySQL, tambien como la conexión entre la base de datos y autenticación de usuario usando JWT (JSON Web Token)_

### Pre-requisitos 📄

Necesitas descargar los archivos del proyecto, tener descargado **JDK 24**, algún gestor de base de datos (Recomendado **XAMPP**), **Postman** para realizar las peticiones HTTP y la **Terminal** de tu maquina

### Iniciar el programa 💡

En la terminal, ir al lugar donde tienes descargado el proyecto y entrar a la raiz del proyecto.

```
$ .\energia-que-transforma-back-end
```

Lo siguiente que debemos hacer es crear una base de datos en el gestor de base de datos llamado **energia** usando la herramienta o el siguiente script en el gestor:

```
CREATE DATABASE energia
```

despues, ejecutar el programa usando un editor de texto como IntelliJ (Opcional), o usando el siguiente comando:

```
$ mvn spring-boot:run
```

### Ejecución del programa ⚙️

Una vez el programa esté ejecutandose, podemos realizar las peticiones HTTP usando **Postman** con la url "**localhost:8080**"

### Pruebas con peticiones HTTP

Dentro de Postman, tienes que elegir entre metodo **_GET, POST o PUT_** y tienes que elegir que modelo quieres probar usando esta url **localhost:8080/metodosHTTP**, las siguientes son los modelos para poder ejecutar estos metodos:

* User: **localhost:8080/user**
* Tipo: **localhost:8080/tipo**
* Producto: **localhost:8080/producto**
* Calculo: **localhost:8080/calculo**

Y cada uno de estas URL's se añaden los metodos que estan guardados en el paquete **Controllers** como por ejemplo, para guardar un nuevo usuario se usa la siguiente URL **localhost:8080/user/saveusers** y copiando el body en Postman como un archivo **JSON**

```
{
    "nombre": "Mateo",
    "apellido: "Henao",
    "email": "mateo@gmail.com",
    "password": "PruebaContraseña10",
    "rol": "Admin
}
```

---
Con 💜 y sudor por [MattHenao](https://github.com/MattHenao), [LarysaGuerra](https://github.com/larysaguerra), [Monkeyxcx](https://github.com/Monkeyxcx), [uvapaza](https://github.com/uvapaza), [samindavidduarte-ctrl](samindavidduarte-ctrl)
