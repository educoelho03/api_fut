CREATE TABLE CAMPEONATO (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    quantidade_clubes INT,
    tabela_id BIGINT,
    temporada VARCHAR(255)
);