package com.neuedu.dao;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginDao {
    public Integer isusernamexists(@Param("username") String username);
}
