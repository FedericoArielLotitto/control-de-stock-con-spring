CREATE TABLE producto (
    id BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    precio DOUBLE,
    cantidad INT,
    fecha_vencimiento DATETIME NOT NULL
);

INSERT INTO producto
(nombre                     , precio, cantidad, fecha_vencimiento    ) VALUES
('Lemon pie'                , 220   , 2       , '2021-07-16 16:00:00'),
('Cheescake'                , 300.00, 2       , '2021-07-15 17:30:00'),
('Torta balcarce'           , 300.00, 2       , '2021-07-15 17:30:00'),
('Pavlova de dulce de leche', 250.75, 2       , '2021-07-18 17:30:00');


