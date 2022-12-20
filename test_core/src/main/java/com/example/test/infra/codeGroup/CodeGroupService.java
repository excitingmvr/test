package com.example.test.infra.codeGroup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CodeGroupService {
    private final CodeGroupDao codeGroupDao;
    public List<CodeGroup> selectList() {
        return codeGroupDao.selectList();
    }
}
