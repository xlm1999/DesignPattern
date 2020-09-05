package com.meng.test;

public class MyTest {
    String s = "SELECT  " +
            " t2.fld_u_00005, " +
            " t2.fld_u_00006, " +
            " t2.Fld_U_00014 " +
            "FROM " +
            " T_WF28_WF28 T " +
            "LEFT JOIN TB_CONTRACT_INDICATOR t1 ON t1.CONTRACT_ID = T . ID " +
            "LEFT JOIN T_WF28_EXT t2 ON t2.objectid = T . ID " +
            "WHERE " +
            " T1. ID = '414e20a3-3e52-4bf2-8f47-a5c7cc1cf8c6'";
}
