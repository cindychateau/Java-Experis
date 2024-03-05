-- Despliega todas las columnas de la tabla de usuarios
SELECT * FROM usuarios;

-- Despliega nombre y edad de la tabla de usuarios
SELECT nombre, edad FROM usuarios;

-- Despliega todas las columnas de la tabla de usuarios DONDE el id = 2
SELECT * FROM usuarios WHERE id = 2;

-- Despliega todas las columnas de la tabla de usuarios DONDE nombre es Martina
SELECT * FROM usuarios WHERE nombre LIKE "Martina";

-- Despliega nombre y edad de la tabla de usuarios donde nombre comience con Al
SELECT nombre, edad FROM usuarios WHERE nombre LIKE "Al%";

-- Despliega nombre y edad de la tabla de usuarios donde nombre termina con o
SELECT nombre, edad FROM usuarios WHERE nombre LIKE "%o";

SELECT * FROM usuarios WHERE nombre LIKE "%r%"; -- Busca los registros que tengan como nombre alguna r

-- Despliega todas las columnas de la tabla de usuarios WHERE nombre termina con o Y edad es mayor a 24
SELECT * FROM usuarios WHERE nombre LIKE "%o" AND edad > 24;

-- Despliega todas las columnas de la tabla de usuarios WHERE nombre termina con o O edad sea mayor a 24
SELECT * FROM usuarios WHERE nombre LIKE "%o" OR edad > 24;

-- Despliega todas las columnas de la tabla de usuarios WHERE nombre termina con o O edad sea mayor a 24
-- Ordenando por edad de mayor a menor
SELECT * FROM usuarios WHERE nombre LIKE "%o" OR edad > 24 ORDER by edad DESC;

-- Despliega todas las columnas de la tabla de usuarios WHERE nombre termina con o O edad sea mayor a 24
-- Ordenando por nombre A-Z
SELECT * FROM usuarios WHERE nombre LIKE "%o" OR edad > 24 ORDER by nombre ASC;

SELECT * FROM usuarios ORDER by edad ASC;

SELECT * FROM usuarios LIMIT 2, 3; -- 0->inicio, 3 cantidad

-- SELECT columnas FROM tabla WHERE condicionales ORDER LIMIT