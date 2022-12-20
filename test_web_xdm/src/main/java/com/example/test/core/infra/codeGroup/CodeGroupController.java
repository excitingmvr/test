package com.example.test.core.infra.codeGroup;

import com.example.test.core.base.BaseController;
import com.example.test.infra.codeGroup.CodeGroup;
import com.example.test.infra.codeGroup.CodeGroupDTO;
import com.example.test.infra.codeGroup.CodeGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class CodeGroupController extends BaseController {
    private final CodeGroupService codeGroupService;
    @RequestMapping(value = "/list")
    public String CodeGroupList(Model model) throws Exception{
            model.addAttribute("list", codeGroupService.selectList());
        return "codeGroupList";

    }
    @RequestMapping(value= "/insert")
    public String CodeGroupInst(CodeGroup dto) throws  Exception {
        codeGroupService.insert(dto);
        return "codeGroupList";
    }
    @RequestMapping(value= "/form")
    public String CodeGroupForm(Model model) throws  Exception {
        model.addAttribute("form", new CodeGroupDTO());
        return "codeGroupForm";
    }
}