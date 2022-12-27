package com.example.test.core.infra.codeGroup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CodeGroupService {
    private final CodeGroupDao codeGroupDao;
    public List<CodeGroup> selectList(CodeGroupVo vo) {
        return codeGroupDao.selectList(vo);
    }
    public int insert(CodeGroup dto) {
        return codeGroupDao.insert(dto);
    }
    public int update(CodeGroup dto) {
        return codeGroupDao.update(dto);
    }
    public CodeGroup selectOne(CodeGroupVo vo) {
        return codeGroupDao.selectOne(vo);
    }
    public int delete(CodeGroupVo vo) { return codeGroupDao.delete(vo); }
    public int selectOneCount(CodeGroupVo vo) { return codeGroupDao.selectOneCount(vo); }
}
