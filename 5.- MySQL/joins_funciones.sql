SELECT * FROM usuarios;

SELECT nombre, edad, ciudad FROM usuarios
JOIN direcciones ON direccion_id = direcciones.id
WHERE edad > 21
ORDER by ciudad DESC
LIMIT 0, 3;

SELECT * FROM pedidos;

SELECT total, envio, created_at, nombre FROM pedidos
JOIN usuarios ON usuario_id = usuarios.id
WHERE total > 500 AND created_at > '2022-02-01'
ORDER BY envio ASC
LIMIT 0, 1;

SELECT nombre, edad, actividad FROM usuarios
JOIN usuarios_has_hobbies ON usuario_id = usuarios.id
JOIN hobbies ON hobbie_id = hobbies.id
WHERE nombre LIKE 'Elena'
ORDER BY actividad ASC
LIMIT 0, 2;

SELECT * FROM usuarios
LEFT JOIN pedidos ON usuario_id = usuarios.id;

SELECT nombre, CONCAT_WS(' ', calle, num, ciudad, cp) as direccion FROM usuarios
JOIN direcciones ON direccion_id = direcciones.id
ORDER BY direccion ASC;

SELECT nombre, LENGTH(nombre) FROM usuarios;

SELECT REPLACE(nombre, 'o', 'x') FROM usuarios;

-- COUNT(), MAX(), MIN(), SUM(), AVG()
SELECT SUM(total) FROM pedidos WHERE usuario_id = 2;

SELECT ciudad, AVG(edad) FROM usuarios
JOIN direcciones ON direccion_id = direcciones.id
GROUP BY ciudad;

SELECT nombre, edad, ciudad FROM usuarios
JOIN direcciones ON direccion_id = direcciones.id;