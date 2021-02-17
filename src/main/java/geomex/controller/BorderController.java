package geomex.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import geomex.impls.ArticleService;
import geomex.models.*;


@Controller
@SessionAttributes({ "article" })
public class BorderController {
    
    private static final String Home = "home/home";

    Logger logger = LoggerFactory.getLogger(BorderController.class);

    @Resource(name = "articleService")
    private ArticleService articleService;

    @RequestMapping(value = "/articleList.do", method = RequestMethod.GET)
    public String articleView(@ModelAttribute("article") ArticleVO view, Model model) throws Exception {
        logger.debug(">>>>>>>>>>>>>>>" + view.toString());

        List<ArticleVO> articleVO = articleService.selectRecentArticles(10);
        if(articleVO != null){
            model.addAttribute("article",articleVO);
            return Home;
        }
        return Home;       
    }

}
