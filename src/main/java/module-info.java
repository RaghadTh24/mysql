module com.mycompany.mysql {
requires javafx.controls;
requires org.hibernate.orm.core;
requires java.naming;
requires java.persistence;
requires java.sql;
opens com.mycompany.mysql to org.hibernate.orm.core;
exports com.mycompany.mysql;
}
