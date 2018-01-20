package cn.lwj.bridge;

/**
 * Created by Administrator on 2018-01-20.
 */
interface DbRead {
    String read();
}

class MySQLDbRead implements DbRead {

    @Override
    public String read() {
        return "MySQL Data";
    }
}

class OracleDbRead implements DbRead {

    @Override
    public String read() {
        return "Oracle Data";
    }
}

class SQLServerDbRead implements DbRead {

    @Override
    public String read() {
        return "SQLServer Data";
    }
}