package com.example.test.core.infra.codeGroup;

import lombok.Data;

@Data
public class CodeGroupVo {
    private String codeGroupSeq;

    public String getCodeGroupSeq() {
        return codeGroupSeq;
    }

    public void setCodeGroupSeq(String codeGroupSeq) {
        this.codeGroupSeq = codeGroupSeq;
    }
}
