package geomex.impls;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import geomex.mappers.ArticleMapper;
import geomex.mappers.CommentMapper;
import geomex.models.ArticleVO;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Resource(name = "articleMapper")
    private ArticleMapper mapper;

    @Override
    public List<ArticleVO> selectRecentArticles(int count) {
        return mapper.selectByCount(count);
    }

    @Override
    public ArticleVO selectArticle(int articleId) throws Exception {
        return mapper.selectById(articleId);
    }

    @Override
    public void delete(int articleId) throws Exception {
        mapper.delete(articleId);
    }

    @Override
    public void create(ArticleVO article) throws Exception {
        mapper.create(article);
    }

    @Override
    public void update(ArticleVO article) throws Exception {
        mapper.update(article);
    }

}
