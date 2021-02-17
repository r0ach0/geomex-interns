package geomex.impls;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import geomex.mappers.CommentMapper;
import geomex.mappers.UserMapper;
import geomex.models.CommentVO;

@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Resource(name = "commentMapper")
    private CommentMapper mapper;

    @Override
    public List<CommentVO> select(int articleId) {
        
    }

    @Override
    public void create(CommentVO comment) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(int commentId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(CommentVO comment) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(CommentVO comment) {
        // TODO Auto-generated method stub
        
    }

}
