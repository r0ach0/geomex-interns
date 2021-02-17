package geomex.impls;

import java.util.List;

import geomex.models.CommentVO;

public interface CommentService {
    public List<CommentVO> select(int articleId);
    public void create(CommentVO comment);
    public void delete(int commentId);
    public void delete(CommentVO comment);
    public void update(CommentVO comment);
}
