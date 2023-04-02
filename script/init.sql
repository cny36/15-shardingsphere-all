-- 数据库：ordermaster0 ordermaster1 orderslave0 orderslave1  表：t_order0 t_order1
CREATE TABLE t_order0
(
    id          bigint(6) NOT NULL,
    sale_id     bigint(6) DEFAULT NULL,
    title       varchar(255) DEFAULT NULL,
    total_price bigint(10) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE t_order1
(
    id          bigint(6) NOT NULL,
    sale_id     bigint(6) DEFAULT NULL,
    title       varchar(255) DEFAULT NULL,
    total_price bigint(10) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;





-- 数据库：zengzhi1 zengzhi2  表：t_order0 t_order1

CREATE TABLE product
(
    id    bigint(20) NOT NULL,
    name  varchar(64)    DEFAULT NULL,
    price decimal(10, 2) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE product_detail
(
    id          bigint(20) NOT NULL,
    pid         bigint(20) DEFAULT NULL,
    description varchar(64) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE t_user_level
(
    id         bigint(20) NOT NULL AUTO_INCREMENT,
    user_level int(10) DEFAULT NULL,
    name       varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=848344576933494787 DEFAULT CHARSET=utf8mb4;

-- 数据加解密
CREATE TABLE t_user
(
    id         bigint(20) NOT NULL AUTO_INCREMENT,
    username   varchar(255) DEFAULT NULL,
    pwd_plain  varchar(255) DEFAULT NULL,
    pwd_cipher varchar(255) DEFAULT NULL,
    phone      varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;