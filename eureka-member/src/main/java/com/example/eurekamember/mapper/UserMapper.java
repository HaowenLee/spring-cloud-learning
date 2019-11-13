package com.example.eurekamember.mapper;

import com.example.eurekamember.entity.Beauty;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from beauty where _id = #{_id} limit 1")
    Beauty getBeauty(@Param("_id") String _id);

    @Insert("insert into beauty(type,_desc) values(#{type},#{_desc})")
    void insertBeauty(@Param("type") String type, @Param("_desc") String _desc);
}
