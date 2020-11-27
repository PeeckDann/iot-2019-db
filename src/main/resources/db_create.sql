CREATE DATABASE IF NOT EXISTS office_tech;
USE office_tech;

DROP TABLE IF EXISTS worker_has_office;
DROP TABLE IF EXISTS worker_has_workspace;
DROP TABLE IF EXISTS desktop;
DROP TABLE IF EXISTS printer;
DROP TABLE IF EXISTS ip_phone;
DROP TABLE IF EXISTS monitor;
DROP TABLE IF EXISTS workspace;
DROP TABLE IF EXISTS laptop;
DROP TABLE IF EXISTS hardware;
DROP TABLE IF EXISTS worker;
DROP TABLE IF EXISTS router;
DROP TABLE IF EXISTS office;
DROP TABLE IF EXISTS location;

CREATE TABLE location (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
building_number INT NOT NULL,
street VARCHAR(45) NOT NULL,
city VARCHAR(45) NOT NULL,
country VARCHAR(45) NOT NULL,
INDEX country_idx (country),
INDEX city_idx (city)
) ENGINE = INNODB;

CREATE TABLE office (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(45) NOT NULL,
location_id BIGINT NOT NULL,
INDEX name_idx (name),
INDEX location_id_idx (location_id)
) ENGINE = INNODB;

CREATE TABLE workspace (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
cabinet_number INT NOT NULL,
office_id BIGINT NOT NULL,
INDEX cabinet_number_idx (cabinet_number),
INDEX workspace_office_id_idx (office_id)
) ENGINE = INNODB;

CREATE TABLE worker (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(45) NOT NULL,
surname VARCHAR(45) NOT NULL,
position VARCHAR(45) NOT NULL,
INDEX surname_idx (surname),
INDEX position_idx (position)
) ENGINE = INNODB;

CREATE TABLE hardware (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
processor VARCHAR(45) NOT NULL,
motherboard VARCHAR(45) NOT NULL,
RAM VARCHAR(45) NOT NULL,
hard_drive VARCHAR(45) NOT NULL,
video_card VARCHAR(45) NOT NULL,
power_supply VARCHAR(45) NOT NULL,
INDEX processor_idx (processor),
INDEX video_card_idx (video_card)
) ENGINE = INNODB;

CREATE TABLE desktop (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(45) NOT NULL,
hardware_id BIGINT NOT NULL,
workspace_id BIGINT NOT NULL,
INDEX desktop_hardware_id_idx (hardware_id),
INDEX desktop_workspace_id_idx (workspace_id)
) ENGINE = INNODB;

CREATE TABLE worker_has_office (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
worker_id BIGINT NOT NULL,
office_id BIGINT NOT NULL,
INDEX office_worker_id_idx (worker_id),
INDEX worker_office_id_idx (office_id)
) ENGINE = INNODB;

CREATE TABLE worker_has_workspace (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
worker_id BIGINT NOT NULL,
workspace_id BIGINT NOT NULL,
INDEX workspace_worker_id_idx (worker_id),
INDEX worker_workspace_id_idx (workspace_id)
) ENGINE = INNODB;

CREATE TABLE monitor (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(45) NOT NULL,
size VARCHAR(45) NOT NULL,
resolution VARCHAR(45) NOT NULL,
refresh_rate VARCHAR(45) NOT NULL,
workspace_id BIGINT NOT NULL,
INDEX size_idx (size),
INDEX resolution_idx (resolution)
) ENGINE = INNODB;

CREATE TABLE printer (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(45) NOT NULL,
format VARCHAR(45) NOT NULL,
design VARCHAR(45) NOT NULL,
workspace_id BIGINT NOT NULL,
INDEX format_inx (format),
INDEX design_idx (design)
) ENGINE = INNODB;

CREATE TABLE router (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(45) NOT NULL,
frequency_range VARCHAR(45) NOT NULL,
WAN VARCHAR(45) NOT NULL,
office_id BIGINT NOT NULL,
INDEX frequency_range_idx (frequency_range),
INDEX router_office_id_idx (office_id)
) ENGINE = INNODB;

CREATE TABLE laptop (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(45) NOT NULL,
hardware_id BIGINT NOT NULL,
worker_id BIGINT NOT NULL,
INDEX laptop_hardware_id_idx (hardware_id),
INDEX laptop_worker_id_idx (worker_id)
) ENGINE = INNODB;

CREATE TABLE ip_phone (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(45) NOT NULL,
number VARCHAR(45) NOT NULL,
workspace_id BIGINT NOT NULL,
INDEX number_idx (number),
INDEX ip_phone_workspace_id_idx (workspace_id)
) ENGINE = INNODB;

ALTER TABLE office
ADD CONSTRAINT fk_office_location
FOREIGN KEY (location_id)
REFERENCES location (id);

ALTER TABLE router
ADD CONSTRAINT fk_router_office
FOREIGN KEY (office_id)
REFERENCES office (id);

ALTER TABLE worker_has_office
ADD CONSTRAINT fk_worker_has_office_worker
FOREIGN KEY (worker_id)
REFERENCES worker (id),
ADD CONSTRAINT fk_worker_has_office_office
FOREIGN KEY (office_id)
REFERENCES office (id);

ALTER TABLE worker_has_workspace
ADD CONSTRAINT fk_worker_has_workspace_worker
FOREIGN KEY (worker_id)
REFERENCES worker (id),
ADD CONSTRAINT fk_worker_has_workspace_workspace
FOREIGN KEY (workspace_id)
REFERENCES workspace (id);

ALTER TABLE workspace
ADD CONSTRAINT fk_workspace_office
FOREIGN KEY (office_id)
REFERENCES office (id);

ALTER TABLE laptop
ADD CONSTRAINT fk_laptop_hardware
FOREIGN KEY (hardware_id)
REFERENCES hardware (id),
ADD CONSTRAINT fk_laptop_worker
FOREIGN KEY (worker_id)
REFERENCES worker (id);

ALTER TABLE desktop
ADD CONSTRAINT fk_desktop_hardware
FOREIGN KEY (hardware_id)
REFERENCES hardware (id),
ADD CONSTRAINT fk_desktop_workspace
FOREIGN KEY (workspace_id)
REFERENCES workspace (id);

ALTER TABLE printer
ADD CONSTRAINT fk_printer_workspace
FOREIGN KEY (workspace_id)
REFERENCES workspace (id);

ALTER TABLE ip_phone
ADD CONSTRAINT fk_ip_phone_workspace
FOREIGN KEY (workspace_id)
REFERENCES workspace (id);

ALTER TABLE monitor
ADD CONSTRAINT fk_monitor_workspace
FOREIGN KEY (workspace_id)
REFERENCES workspace (id);

INSERT INTO location (building_number, street, city, country) VALUES
(12, 'Bandery', 'Lviv', 'Ukrain'),
(23, 'Shevchenka', 'Lviv', 'Ukrain'),
(34, 'Doroshenka', 'Lviv', 'Ukrain'),
(45, 'Grushevskogo', 'Lviv', 'Ukrain'),
(56, 'Petlury', 'Lviv', 'Ukrain'),
(67, 'Lubinska', 'Lviv', 'Ukrain'),
(78, 'Patona', 'Lviv', 'Ukrain'),
(89, 'Gorodotska', 'Lviv', 'Ukrain'),
(90, 'Sudova', 'Lviv', 'Ukrain'),
(21, 'Sadova', 'Lviv', 'Ukrain');

INSERT INTO office (name, location_id) VALUES
('Main', 1),
('First', 2),
('Second', 3),
('Third', 4),
('Fourth', 5),
('Fifth', 6),
('Sixth', 7),
('Seventh', 8),
('Eighth', 9),
('Ninth', 10);

INSERT INTO router (name, frequency_range, WAN, office_id) VALUE
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 1),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 1),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 2),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 2),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 3),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 3),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 4),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 4),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 5),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 5),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 6),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 6),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 7),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 7),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 8),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 8),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 9),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 9),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 10),
('Xiaomi Mi AIoT Router AC2350', '5 GHz', 'Ethernet', 10);

INSERT INTO workspace (cabinet_number, office_id) VALUE
(123, 1),
(234, 2),
(345, 3),
(456, 4),
(567, 5),
(678, 6),
(789, 7),
(890, 8),
(321, 9),
(432, 10);

INSERT INTO worker (name, surname, position) VALUE
('Pavlo', 'Osadchuk', 'Developer'),
('Danylo', 'Hrydovyi', 'Developer'),
('Vlad', 'Dorofeev', 'Developer'),
('Maryan', 'Kit', 'Developer'),
('Roman', 'Marchuk', 'Developer'),
('Markiyan', 'Topolevskyi', 'Developer'),
('Dmytro', 'Matei', 'Developer'),
('Yuryi', 'Syvak', 'Developer'),
('Viktor', 'Korop', 'Developer'),
('Taras', 'Geleta', 'Developer');

INSERT INTO hardware (processor, motherboard, RAM, hard_drive, video_card, power_supply) VALUE
('Intel Core i5', 'Acer SE7230NH1 MB.R1808.001 MBR1808001', '4 GB', '320 GB', 'NVIDIA GeForce GTX 1080 SLI', 'Acer Aspire 5253 AC Adapter'),
('Intel Core i5', 'Acer SE7230NH1 MB.R1808.001 MBR1808001', '4 GB', '500 GB', 'NVIDIA GeForce GTX 1080 SLI', 'Acer Aspire 5253 AC Adapter'),
('Intel Core i5', 'Acer SE7230NH1 MB.R1808.001 MBR1808001', '8 GB', '320 GB', 'NVIDIA GeForce GTX 1080 SLI', 'Acer Aspire 5253 AC Adapter'),
('Intel Core i5', 'Acer SE7230NH1 MB.R1808.001 MBR1808001', '8 GB', '500 GB', 'NVIDIA GeForce GTX 1080 SLI', 'Acer Aspire 5253 AC Adapter'),
('Intel Core i5', 'Acer SE7230NH1 MB.R1808.001 MBR1808001', '16 GB', '500 GB', 'NVIDIA GeForce GTX 1080 SLI', 'Acer Aspire 5253 AC Adapter'),
('Intel Core i7', 'Supermicro MBD-X11DPI-N-O', '8 GB', '500 GB', 'NVIDIA GeForce RTX 2080 Super 8GB GDDR6 PCI', 'Corsair CV550'),
('Intel Core i7', 'Supermicro MBD-X11DPI-N-O', '8 GB', '1 TB', 'NVIDIA GeForce RTX 2080 Super 8GB GDDR6 PCI', 'Corsair CV550'),
('Intel Core i7', 'Supermicro MBD-X11DPI-N-O', '16 GB', '500 GB', 'NVIDIA GeForce RTX 2080 Super 8GB GDDR6 PCI', 'Corsair CV550'),
('Intel Core i7', 'Supermicro MBD-X11DPI-N-O', '16 GB', '1 TB', 'NVIDIA GeForce RTX 2080 Super 8GB GDDR6 PCI', 'Corsair CV550'),
('Intel Core i7', 'Supermicro MBD-X11DPI-N-O', '32 GB', '2 TB', 'NVIDIA GeForce RTX 2080 Super 8GB GDDR6 PCI', 'Corsair CV550');

INSERT INTO laptop (name, hardware_id, worker_id) VALUE
('Acer', 1, 1),
('Acer', 1, 2),
('Acer', 2, 3),
('Acer', 2, 4),
('Acer', 3, 5),
('Acer', 3, 6),
('Acer', 4, 7),
('Acer', 4, 8),
('Acer', 5, 9),
('Acer', 6, 10);

INSERT INTO desktop (name, hardware_id, workspace_id) VALUE
('Dell', 6, 1),
('Dell', 6, 2),
('Dell', 7, 3),
('Dell', 7, 4),
('Dell', 8, 5),
('Dell', 8, 6),
('Dell', 9, 7),
('Dell', 9, 8),
('Dell', 10, 9),
('Dell', 10, 10);

INSERT INTO printer (name, format, design, workspace_id) VALUE
('Epson L1110', 'A4', 'ink-jet', 1),
('Epson L1110', 'A4', 'ink-jet', 2),
('Epson L1110', 'A4', 'ink-jet', 3),
('Epson L1110', 'A4', 'ink-jet', 4),
('Epson L1110', 'A4', 'ink-jet', 5),
('Epson L1110', 'A4', 'ink-jet', 6),
('Epson L1110', 'A4', 'ink-jet', 7),
('Epson L1110', 'A4', 'ink-jet', 8),
('Epson L1110', 'A4', 'ink-jet', 9),
('Epson L1110', 'A4', 'ink-jet', 10);

INSERT INTO ip_phone (name, number, workspace_id) VALUE
('Polycom VVX 600', '+1 631-791-8370', 1),
('Polycom VVX 600', '+1 631-791-8371', 2),
('Polycom VVX 600', '+1 631-791-8372', 3),
('Polycom VVX 600', '+1 631-791-8373', 4),
('Polycom VVX 600', '+1 631-791-8374', 5),
('Polycom VVX 600', '+1 631-791-8375', 6),
('Polycom VVX 600', '+1 631-791-8376', 7),
('Polycom VVX 600', '+1 631-791-8377', 8),
('Polycom VVX 600', '+1 631-791-8378', 9),
('Polycom VVX 600', '+1 631-791-8379', 10);

INSERT INTO monitor (name, size, resolution, refresh_rate, workspace_id) VALUE
('Dell', '24 Inches', '2048x1080', '120 Hz', 1),
('Dell', '24 Inches', '2048x1080', '60 Hz', 1),
('Dell', '24 Inches', '2048x1080', '120 Hz', 2),
('Dell', '24 Inches', '2048x1080', '60 Hz', 2),
('Dell', '24 Inches', '2048x1080', '120 Hz', 3),
('Dell', '24 Inches', '2048x1080', '60 Hz', 3),
('Dell', '24 Inches', '2048x1080', '120 Hz', 4),
('Dell', '24 Inches', '2048x1080', '60 Hz', 4),
('Dell', '24 Inches', '2048x1080', '120 Hz', 5),
('Dell', '24 Inches', '2048x1080', '60 Hz', 5),
('Dell', '24 Inches', '2048x1080', '120 Hz', 6),
('Dell', '24 Inches', '2048x1080', '60 Hz', 6),
('Dell', '24 Inches', '2048x1080', '120 Hz', 7),
('Dell', '24 Inches', '2048x1080', '60 Hz', 7),
('Dell', '24 Inches', '2048x1080', '120 Hz', 8),
('Dell', '24 Inches', '2048x1080', '60 Hz', 8),
('Dell', '24 Inches', '2048x1080', '120 Hz', 9),
('Dell', '24 Inches', '2048x1080', '60 Hz', 9),
('Dell', '24 Inches', '2048x1080', '120 Hz', 10),
('Dell', '24 Inches', '2048x1080', '60 Hz', 10);

INSERT INTO worker_has_office (worker_id, office_id) VALUE
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);

INSERT INTO worker_has_workspace (worker_id, workspace_id) VALUE
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);