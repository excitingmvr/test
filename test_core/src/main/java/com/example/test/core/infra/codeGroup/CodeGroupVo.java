package com.example.test.core.infra.codeGroup;

import com.example.test.core.common.base.BaseVo;
import lombok.Data;

@Data
public class CodeGroupVo extends BaseVo {
    private String codeGroupSeq;

    public String getCodeGroupSeq() {
        return codeGroupSeq;
    }

    public void setCodeGroupSeq(String codeGroupSeq) {
        this.codeGroupSeq = codeGroupSeq;
    }
}
