package com.example.test.core.infra.codeGroup;

import com.example.test.core.base.BaseController;
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
}