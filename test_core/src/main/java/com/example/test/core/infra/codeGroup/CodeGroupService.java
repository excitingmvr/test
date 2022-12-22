package com.example.test.core.infra.codeGroup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Component
@RequiredArgsConstructor
public class CodeGroupService {
    private final CodeGroupDao codeGroupDao;
    public List<CodeGroup> selectList() {
        return codeGroupDao.selectList();
    }
    public int insert(CodeGroup dto) { return codeGroupDao.insert(); }
}