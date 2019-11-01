package com.knoldus.cafeteriamgmt.config

import java.sql.{Connection, DriverManager}

object JdbcConn {

  val url = "jdbc:mysql://localhost:3306"
    val driver = "com.mysql.jdbc.Driver"
    val username = "root"
    val password = "Kaushik1$"
    var connection:Connection = _

    def getDbConnection(): Connection = DriverManager.getConnection(url, username, password)

  }
