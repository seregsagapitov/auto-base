SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS auto;
DROP TABLE IF EXISTS trademark;
DROP TABLE IF EXISTS model;
DROP TABLE IF EXISTS type_vagon;
DROP TABLE IF EXISTS city;

CREATE TABLE auto (
                      id_auto INT(11) NOT NULL AUTO_INCREMENT,
                      trademark_id INT(11) NOT NULL,
                      model_id INT(11) NOT NULL,
                      type_vagon_id INT(11)NOT NULL,
                      year_produce INT(11) NOT NULL,
                      mileage INT(11) NOT NULL,
                      engine_capacity DECIMAL(5,2) NOT NULL,
                      engine_power DECIMAL(5,2) NOT NULL,
                      city_id INT(11) NOT NULL,
                      price INT(11) NOT NULL,
                      features VARCHAR(5000) DEFAULT NULL,
                      PRIMARY KEY(id_auto)
) ENGINE=InnoDB CHARSET=utf8mb4;


CREATE TABLE trademark (
                           id_trademark INT(11) NOT NULL AUTO_INCREMENT,
                           title_trademark VARCHAR(100) NOT NULL,
                           PRIMARY KEY(id_trademark)
)  ENGINE=InnoDB CHARSET=utf8mb4;


CREATE TABLE model (
                       id_model INT(11) NOT NULL AUTO_INCREMENT,
                       title_model VARCHAR(100) NOT NULL,
                       PRIMARY KEY(id_model)
) ENGINE=InnoDB CHARSET=utf8mb4;


CREATE TABLE type_vagon (
                            id_type_vagon INT(11) NOT NULL AUTO_INCREMENT,
                            title_type_vagon VARCHAR(100) NOT NULL,
                            PRIMARY KEY(id_type_vagon)
) ENGINE=InnoDB CHARSET=utf8mb4;


CREATE TABLE city (
                      id_city INT(11) NOT NULL AUTO_INCREMENT,
                      title_city VARCHAR(100) NOT NULL,
                      PRIMARY KEY(id_city)
) ENGINE=InnoDB CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO trademark (title_trademark) VALUES ('УАЗ');
INSERT INTO trademark (title_trademark) VALUES ('LADA');
INSERT INTO trademark (title_trademark) VALUES ('Renault');
INSERT INTO trademark (title_trademark) VALUES ('TOYOTA');
INSERT INTO trademark (title_trademark) VALUES ('NISSAN');

INSERT INTO model (title_model) VALUES ('Priora');
INSERT INTO model (title_model) VALUES ('Vesta');
INSERT INTO model (title_model) VALUES ('Kalina');
INSERT INTO model (title_model) VALUES ('Granta');
INSERT INTO model (title_model) VALUES ('X-Ray');
INSERT INTO model (title_model) VALUES ('Патриот');
INSERT INTO model (title_model) VALUES ('Kaptur');
INSERT INTO model (title_model) VALUES ('Logan');
INSERT INTO model (title_model) VALUES ('Land Cruiser');
INSERT INTO model (title_model) VALUES ('Navara');
INSERT INTO model (title_model) VALUES ('Sandero');
INSERT INTO model (title_model) VALUES ('Land Cruiser Prado');
INSERT INTO model (title_model) VALUES ('Teana');
INSERT INTO model (title_model) VALUES ('Camry');

INSERT INTO type_vagon (title_type_vagon) VALUES ('Седан');
INSERT INTO type_vagon (title_type_vagon) VALUES ('Универсал');
INSERT INTO type_vagon (title_type_vagon) VALUES ('Хэтчбэк');
INSERT INTO type_vagon (title_type_vagon) VALUES ('Минивэн');
INSERT INTO type_vagon (title_type_vagon) VALUES ('Купе');
INSERT INTO type_vagon (title_type_vagon) VALUES ('Пикап');
INSERT INTO type_vagon (title_type_vagon) VALUES ('Смарт');

INSERT INTO city (title_city) VALUES ('Красноярск');
INSERT INTO city (title_city) VALUES ('Абакан');
INSERT INTO city (title_city) VALUES ('Иркутск');
INSERT INTO city (title_city) VALUES ('Новосибирск');
INSERT INTO city (title_city) VALUES ('Кемерово');
INSERT INTO city (title_city) VALUES ('Новокузнецк');


INSERT INTO auto (trademark_id, model_id, type_vagon_id, year_produce, mileage, engine_capacity, engine_power, city_id, price, features)
VALUES (2, 1, 2, 2012, 147800, 1.6, 98, 1, 285000, 'ОТС');
