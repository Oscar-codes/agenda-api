# Agenda-Api

## Indicaciones para usar el proyecto Agenda-Api

**Configurando la base de datos MySQL**

La Base de datos que utilice para este proyecto fue hecha con MySQL Server para poder utilizarla hay que imporpar el archivo Query que se encuentra en la carperta musicbd.

#Importar una base de datos en MySQL 
Para importar un volcado de MySQL , lo primero que hay que hacer es crear la base de datos en la que se hará la importación. Para hacer esto, si no tienes ningún gestor de bases de datos, tienes que conectarte al servidor de bases de datos como usuario «root» desde el CMD.
```
mysql -u root –p
```

Esto hará que se abra el Shell de MySQL o MariaDB. A continuación, podrás crear la base de datos.
```
mysql> CREATE DATABASE agendabd;
```

Si todo ha ido bien, verás algo parecido a esto:
```
Query OK, 1 row affected (0.00 sec)
```

Una vez creada, hay que salir de ese Shell; para ello pulsa CTRL+D. Una vez estés en la línea de comandos normal, será el momento de lanzar el comando que se encargará de realizar la importación de la base de datos.

```
mysql -u username -p agendabd < agendabd.sql
```
`username` es el nombre del usuario con acceso a la base de datos.
`agendadb` es el nombre de la base de datos donde se realizará la importación.
`agendadb.sql `es el nombre del archivo que contiene todas las instrucciones sql que se van a importar.
Si durante el proceso de importación se produjera algún tipo de error, se mostrará en la pantalla. Como puedes ver, exportar e importar una base de datos en MySQL o MariaDB es un proceso muy sencillo.

## Indicaciones para usar el proyecto SpringBoot Agenda-Api

Para poder usar el proyecto puedes obtar por usar el IDE Spring Tool Suite , descargarlo aca  [Spring Boot ](https://spring.io/tools).
Una vez descargado descomprimir el archivo en la ruta que almacenaras los proyectos SpringBoot.

**Importando el Proyecto SpringBoot**
Antes de importar el proyecto  `Agenda-Api` asegurate de descomprimir los archivos en la ruta que contiene la carpeta `workspace-spring-tool-suite-4-4.10.0.RELEASE`.

Para importar el proyecto `Agenda-Api` desde el IDE Spring Boot tienes que dar Click en la pestaña File luego la opcion `Import`.

![Importando Proyecto](https://github.com/Oscar-codes/music-app/blob/master/imagenes/importar.png?raw=true)

Posteriormente en el cuadro de dialogo seleccionar la opcion `Existing Marven Projects`.
![Marven](https://github.com/Oscar-codes/music-app/blob/master/imagenes/marven.png?raw=true)

Seleccionaremos la direccion donde almacenamos el proyecto Agenda-Api.
![Marven Projects](https://github.com/Oscar-codes/music-app/blob/master/imagenes/Agenda%20Seleccionar.png?raw=true)

Asegurate de selccionar el archivo pom.xml antes de finalizar.
![Finalizar](https://github.com/Oscar-codes/music-app/blob/master/imagenes/agenda%20terminar.png?raw=true)

Al finalizar la importacion del proyecto music-api esperaremos unos segundos o minutos que descargue todas las dependencias & librerias.

## Configurando la libreria de Java
Cuando la importacion este completa procederemos a configurar las propiedades de Java esto para no tener conflictos con la version de Java que contiene el proyecto
`Agenda-Api` y la version que esta instalada en nuestro ordenador.

Desplegamos la carpeta raiz de nuestro proceto `Agenda-Api` y daremos click a la opcion `JRE System Library`.
![JRE System Library](https://github.com/Oscar-codes/music-app/blob/master/imagenes/Agenda%20java%20properties.png?raw=true)

Aca es importante seleccionar la version de Java que tenemos insalada en el ordenador para ello seleccionaremos la opcion 
`Worksapace Default JRE` ; Aplicamos los cambios y cerramos el cuadro de Dialogo.
![JRE por defecto](https://github.com/Oscar-codes/music-app/blob/master/imagenes/java%20por%20defecto.png?raw=true)

## Configurando las propiedades de la Aplicacion Agenda-Api
Para finalizar tenemos que configurar las propiedades de nuestro proyecto `Agenda-Api` para ello en el directorio raiz daremos click a la carpeta 
`src/main/resources` luego abrir el archivo `application.properties`.

![Propiedades](https://github.com/Oscar-codes/music-app/blob/master/imagenes/Agenda%20Properties.png?raw=true)

Dentro del archivo `application.properties` procederemos a asignar la configuracion Datasource para la conexion de nuestra Base de Datos MySQL colocamos
las siguientes propiedades:

```
# DATASOURCE (MYSQL 8.0)
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/agendadb?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=root
#JPA
spring.jpa.generate-ddl=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.show-sql=true
# Table names physically
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl

```

Asegurate de asignar la ruta correcta de tu base de datos en la propiedad `spring.datasource.url:` debes de usar el puerto de escucha asignado a tu base de datos MySQL , 
nombre de la Base de datos ademas asegurate de colocar correctamente el `username` & `password` de tu servidor MySQL.

Ahora que haz realizado todas estas Configuraciones podras hacer uso sin ningun problema del proyecto Agenda-Api.

