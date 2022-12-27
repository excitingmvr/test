package com.example.test.codegroup;

import com.example.test.core.infra.codeGroup.CodeGroup;
import com.example.test.core.infra.codeGroup.CodeGroupService;
import com.example.test.core.infra.codeGroup.CodeGroupVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/codegroup")
public class CodeGroupController {

    private final CodeGroupService codeGroupService;
    @RequestMapping(value = "/list")
    public String CodeGroupList(Model model, @ModelAttribute("vo") CodeGroupVo vo) throws Exception{
            vo.setParamsPaging(codeGroupService.selectOneCount(vo));

            List<CodeGroup> list = codeGroupService.selectList(vo);
            model.addAttribute("list", list);
        return "infra/codegroup/codeGroupList";
    }
    @RequestMapping(value= "/insert")

    public String CodeGroupInst(CodeGroup dto) throws  Exception {
            codeGroupService.insert(dto);
        return "redirect:/codegroup/list";
    }
    @RequestMapping(value= "/update")
    public String CodeGroupUpdt(CodeGroup dto) throws  Exception {
            codeGroupService.update(dto);
        return "redirect:/codegroup/list";
    }
    @RequestMapping(value= "/delete")
    public String CodeGroupDele(CodeGroupVo vo) throws  Exception {
        codeGroupService.delete(vo);
        return "redirect:/codegroup/list";
    }
    @RequestMapping(value= "/form")
    public String CodeGroupForm(CodeGroupVo vo, Model model) throws  Exception {
        model.addAttribute("item", codeGroupService.selectOne(vo));
        return "infra/codegroup/codeGroupForm";
    }
}