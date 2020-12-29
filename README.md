# spring-boot-graphql-mysql
Es un pequeño programa usando spring boot y graphql.
## Environment usado:

1. MacBook Pro (13-inch, 2018, Four Thunderbolt 3 Ports)
2. Procesador: 2.3 GHz Quad-Core Intel Core i5 
3. Memoria: 8 GB 2133 MHz LPDDR3
4. SO: MacOS Catalina 10.15.7 (19H114)

## Compilar:
Desde consola:
```
mvnw spring-boot:run
```

Desde Eclipse:
Boton secundario del mouse, RunAs
```
SpringBootApp
```
# Configurar Mysql
Si estas en una mac, y tienes Mamp, no debes hacer nada.
Si usas windows o linux, y usas Lampp o Wampp o solo MySQL:
```
spring.datasource.url= jdbc:mysql://localhost:8889/testdb?useSSL=false
``` 
Debe cambiarse el puerto **8889** 
```
spring.datasource.url= jdbc:mysql://localhost:3306/testdb?useSSL=false
```
