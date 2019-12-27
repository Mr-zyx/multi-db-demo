create database demo_primary;

use demo_primary;

CREATE TABLE `books`
(
    `id`   BIGINT UNSIGNED     NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) UNIQUE NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY `uniq_books_by_name` (`name`)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8
    COLLATE = utf8_unicode_ci;


INSERT INTO books(`id`, `name`)
values (1, 'hamlet');


create database demo_secondary;

use demo_secondary;

CREATE TABLE `users`
(
    `id`           BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `account_name` VARCHAR(255)    NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY `uniq_users_by_account_name` (`account_name`)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8
    COLLATE = utf8_unicode_ci;

INSERT INTO users (id, account_name)
VALUES (1, 'xiaoming'),
       (2, 'xiaohong');