/* Inserta a la persona a la lista */
INSERT INTO persona(nombre, apellido) VALUES('Juan','Perez');
INSERT INTO persona(nombre, apellido) VALUES('Karla','Esparza');
INSERT INTO persona(nombre, apellido) VALUES('Eduardo','Alvarez');

/* Muestra lista completa de persona */
SELECT * FROM persona;

/* Modifica el nombre de la persona segun el id indicado */
UPDATE persona SET nombre = 'Juanito' WHERE id_persona = 1;

/* Elimina la persona segun el id indicado */
DELETE FROM persona WHERE id_persona = 3;

