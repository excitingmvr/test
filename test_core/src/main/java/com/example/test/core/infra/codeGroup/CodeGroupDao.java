package com.example.test.core.infra.codeGroup;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface CodeGroupDao {
    List<CodeGroup> selectList();
    int insert();
}
