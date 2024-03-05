SELECT * FROM usuarios;

-- Guardar un nuevo registro
INSERT INTO usuarios (nombre, edad, direccion_id) VALUES ('Pedro', 28, 2);

-- Eliminar un registro
DELETE FROM usuarios WHERE id = 9;

-- Actualizamos edad al registro con id 10
UPDATE usuarios SET edad = 29 WHERE id = 10;

UPDATE usuarios SET edad = 30, nombre = "Pedrito" WHERE id = 10;