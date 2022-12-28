package com.example.test.core.infra.codeGroup;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface CodeGroupDao {
    List<CodeGroup> selectList(CodeGroupVo vo);
    int insert(CodeGroup dto);
    int update(CodeGroup dto);
    CodeGroup selectOne(CodeGroupVo vo);
    int delete(CodeGroupVo vo);
    int selectOneCount(CodeGroupVo vo);
    int uelete(CodeGroup dto);
}
