package geomex.impls;

import java.util.List;

import geomex.models.ArticleVO;

public interface ArticleService {
    // 찾은 결과 값이 0일 경우 null 반환
    public List<ArticleVO> selectRecentArticles(int count);
    
    // 아래 메소드들은 id 없을 시 Exception 발생
    public ArticleVO selectArticle(int articleId) throws Exception;
    public void delete(int articleId) throws Exception;
    public void create(ArticleVO article) throws Exception;
    
    // 업데이트는 id가 기존, title과 content는 수정된 내용으로 넘겨주면 됨
    public void update(ArticleVO article) throws Exception;
}
