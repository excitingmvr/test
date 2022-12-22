package com.example.test.codegroup;

import com.example.test.core.infra.codeGroup.CodeGroup;
import com.example.test.core.infra.codeGroup.CodeGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class CodeGroupController {
    private final CodeGroupService codeGroupService;
    @RequestMapping(value = "/list")
    public String CodeGroupList(Model model) throws Exception{
            model.addAttribute("list", codeGroupService.selectList());
        return "infra/codegroup/codeGroupList";

    }
    @RequestMapping(value= "/insert")
    public String CodeGroupInst(CodeGroup dto) throws  Exception {
        codeGroupService.insert(dto);
        return "infra/codegroup/codeGroupList";
    }
    @RequestMapping(value= "/form")
    public String CodeGroupForm(Model model) throws  Exception {
        return "infra/codegroup/codeGroupForm";
    }
}