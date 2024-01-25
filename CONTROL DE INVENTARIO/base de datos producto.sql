use Juguetes_DB

CREATE TABLE Juguetes (
    id INT IDENTITY(100,1) PRIMARY KEY,
    nombre VARCHAR(255),
    valor DECIMAL(10, 2),
    cantidad INT,
	disponible VARCHAR(1)
);


SELECT * FROM Juguetes
drop table Juguetes