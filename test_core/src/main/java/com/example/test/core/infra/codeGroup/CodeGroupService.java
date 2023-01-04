package com.example.test.core.infra.codeGroup;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CodeGroupService {

    private final CodeGroupDao codeGroupDao;

    @Cacheable("codeGroupList")
    public List<CodeGroup> selectList(CodeGroupVo vo) {
        return codeGroupDao.selectList(vo);
    }

    @Cacheable("codeGroupInsert")
    public int insert(CodeGroup dto) {
        return codeGroupDao.insert(dto);
    }

    @CachePut("codeGroupPut")
    public int update(CodeGroup dto) {
        return codeGroupDao.update(dto);
    }

    @Cacheable("codeGroupById")
    public CodeGroup selectOne(CodeGroupVo vo) {
        return codeGroupDao.selectOne(vo);
    }

    @CacheEvict("codeGroupDelete")
    public int delete(CodeGroupVo vo) { return codeGroupDao.delete(vo); }

/*    @Cacheable("codeGroupOneCount")*/
    public int selectOneCount(CodeGroupVo vo) { return codeGroupDao.selectOneCount(vo); }
    public int uelete(CodeGroup dto) { return codeGroupDao.uelete(dto); }

//    @Transactional
//    public int deleteAllByIds(Set<String> ids) {
//        return codeGroupDao.deleteAllByIds(ids);
//    }

}
