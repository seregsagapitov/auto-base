SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS auto;

CREATE TABLE auto (
	id_auto INT(11) NOT NULL AUTO_INCREMENT,
    trademark_id INT(11) NOT NULL UNIQUE,
    model_id INT(11) NOT NULL UNIQUE,
    type_vagon_id INT(11)NOT NULL UNIQUE,
    year_produce INT(11) NOT NULL,
    mileage INT(11) NOT NULL,
    engine_capacity DECIMAL(5,2) NOT NULL,
    engine_power DECIMAL(5,2) NOT NULL,
    city_id INT(11) NOT NULL UNIQUE,
    price INT(11) NOT NULL,
    features VARCHAR(5000) DEFAULT NULL,
    PRIMARY KEY(id_auto) 
) ENGINE=InnoDB CHARSET=utf8mb4;

DROP TABLE IF EXISTS trademark;
CREATE TABLE trademark (
	id_trademark INT(11) NOT NULL AUTO_INCREMENT,
    title_trademark VARCHAR(100) NOT NULL,
	PRIMARY KEY(id_trademark),
    CONSTRAINT fk_auto_id_trademark FOREIGN KEY (id_trademark)
    REFERENCES auto (trademark_id)
	) ENGINE=InnoDB CHARSET=utf8mb4;

DROP TABLE IF EXISTS model;
CREATE TABLE model (
	id_model INT(11) NOT NULL AUTO_INCREMENT,
    title_model VARCHAR(100) NOT NULL,
	PRIMARY KEY(id_model),
    CONSTRAINT fk_auto_id_model FOREIGN KEY (id_model)
    REFERENCES auto (model_id)
    ) ENGINE=InnoDB CHARSET=utf8mb4;

DROP TABLE IF EXISTS type_vagon;
CREATE TABLE type_vagon (
	id_type_vagon INT(11) NOT NULL AUTO_INCREMENT,
    title_type_vagon VARCHAR(100) NOT NULL,
	PRIMARY KEY(id_type_vagon),
    CONSTRAINT fk_id_type_vagon FOREIGN KEY (id_type_vagon)
    REFERENCES auto (type_vagon_id)
    ) ENGINE=InnoDB CHARSET=utf8mb4;

DROP TABLE IF EXISTS city;
CREATE TABLE city (
	id_city INT(11) NOT NULL AUTO_INCREMENT,
    title_city VARCHAR(100) NOT NULL,
	PRIMARY KEY(id_city),
    CONSTRAINT fk_id_city FOREIGN KEY (id_city)
    REFERENCES auto (city_id)
    ) ENGINE=InnoDB CHARSET=utf8mb4;



INSERT INTO trademark (trademark) VALUES ('УАЗ');
INSERT INTO trademark (trademark) VALUES ('LADA');
INSERT INTO trademark (trademark) VALUES ('Renault');
INSERT INTO trademark (trademark) VALUES ('TOYOTA');
INSERT INTO trademark (trademark) VALUES ('NISSAN');

INSERT INTO model (model) VALUES ('Priora');
INSERT INTO model (model) VALUES ('Vesta');
INSERT INTO model (model) VALUES ('Kalina');
INSERT INTO model (model) VALUES ('Granta');
INSERT INTO model (model) VALUES ('X-Ray');
INSERT INTO model (model) VALUES ('Патриот');
INSERT INTO model (model) VALUES ('Kaptur');
INSERT INTO model (model) VALUES ('Logan');
INSERT INTO model (model) VALUES ('Land Cruiser');
INSERT INTO model (model) VALUES ('Navara');
INSERT INTO model (model) VALUES ('Sandero');
INSERT INTO model (model) VALUES ('Land Cruiser Prado');
INSERT INTO model (model) VALUES ('Teana');
INSERT INTO model (model) VALUES ('Camry');

INSERT INTO type_vagon (type_vagon) VALUES ('Седан');
INSERT INTO type_vagon (type_vagon) VALUES ('Универсал');
INSERT INTO type_vagon (type_vagon) VALUES ('Хэтчбэк');
INSERT INTO type_vagon (type_vagon) VALUES ('Минивэн');
INSERT INTO type_vagon (type_vagon) VALUES ('Купе');
INSERT INTO type_vagon (type_vagon) VALUES ('Пикап');
INSERT INTO type_vagon (type_vagon) VALUES ('Смарт');

INSERT INTO city (city) VALUES ('Красноярск');
INSERT INTO city (city) VALUES ('Абакан');
INSERT INTO city (city) VALUES ('Иркутск');
INSERT INTO city (city) VALUES ('Новосибирск');
INSERT INTO city (city) VALUES ('Кемерово');
INSERT INTO city (city) VALUES ('Новокузнецк');


INSERT INTO auto (trademark_id, model_id, type_vagon_id, year_produce, mileage, engine_capacity, engine_power, city_id, price, features)
 VALUES (2, 1, 2, 2012, 147800, 1.6, 98, 1, 285000, 'ОТС');
SET FOREIGN_KEY_CHECKS = 1;








