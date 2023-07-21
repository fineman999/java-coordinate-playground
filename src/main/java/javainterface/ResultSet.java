package javainterface;

import java.sql.SQLException;

public interface ResultSet {
    int getInt(int columnIndex) throws SQLException;

    String getString(String columnLabel) throws SQLException;

    // [...] // 자바가 지원하는 데이터 타입에 대한 메소드 존재함.

    boolean isFirst() throws SQLException;

    boolean isLast() throws SQLException;
}
