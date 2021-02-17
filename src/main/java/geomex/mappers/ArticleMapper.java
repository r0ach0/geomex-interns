package geomex.mappers;

import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import geomex.models.ArticleVO;

@Mapper("articleMapper")
public interface ArticleMapper {
    public void create(ArticleVO article);
    public void update(ArticleVO article);
    public void delete(int id);
    public ArticleVO selectById(int id);
    public List<ArticleVO> selectByCount(int count);
}
