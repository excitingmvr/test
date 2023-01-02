package com.example.test.codegroup;

import com.example.test.core.infra.codeGroup.CodeGroup;
import com.example.test.core.infra.codeGroup.CodeGroupService;
import com.example.test.core.infra.codeGroup.CodeGroupVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String CodeGroupInst(@ModelAttribute("vo") CodeGroupVo vo,CodeGroup dto, RedirectAttributes redirectAttributes) throws  Exception {
            codeGroupService.insert(dto);
            vo.setCodeGroupSeq(dto.getCodeGroupSeq());
            redirectAttributes.addFlashAttribute("vo", vo);
        return "redirect:/codegroup/form";
    }
    @RequestMapping(value= "/update")
    public String CodeGroupUpdt(@ModelAttribute("vo") CodeGroupVo vo, CodeGroup dto, RedirectAttributes redirectAttributes) throws Exception {
            codeGroupService.update(dto);
            vo.setCodeGroupSeq(dto.getCodeGroupSeq());
            redirectAttributes.addFlashAttribute("vo", vo);
        return "redirect:/codegroup/form";
    }
    @RequestMapping(value= "/uelete")
    public String CodeGroupUele(CodeGroup dto) throws  Exception {
        codeGroupService.uelete(dto);
        return "redirect:/codegroup/list";
    }
    @RequestMapping(value= "/delete")
    public String CodeGroupDele(CodeGroupVo vo) throws  Exception {
        codeGroupService.delete(vo);
        return "redirect:/codegroup/list";
    }
    @RequestMapping(value= "/form")
    public String CodeGroupForm(@ModelAttribute("vo") CodeGroupVo vo, Model model) throws  Exception {
        model.addAttribute("item", codeGroupService.selectOne(vo));
        return "infra/codegroup/codeGroupForm";
    }
    @RequestMapping(value = "codeGroupMultiDele")
    public String codeGroupMultiDele(CodeGroupVo vo) throws Exception {
        for (String checkboxSeq : vo.getCheckboxSeqArray()) {
            vo.setCodeGroupSeq(checkboxSeq);
            codeGroupService.delete(vo);
        }
        return "redirect:/codegroup/list";
    }
    @RequestMapping(value = "codeGroupMultiUele")
    public String codeGroupMultiUele(CodeGroup dto, CodeGroupVo vo) throws Exception {
        for (String checkboxSeq : vo.getCheckboxSeqArray()) {
            dto.setCodeGroupSeq(checkboxSeq);
            codeGroupService.uelete(dto);
        }
        return "redirect:/codegroup/list";
    }
}