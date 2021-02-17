package geomex.impls;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import geomex.mappers.UserMapper;
import geomex.models.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;
    
    @Override
    public void create(UserVO user) {
        userMapper.create(user);
    }

    @Override
    public UserVO updateName(String id, String newName) {
        UserVO user = new UserVO();
        user.setId(id);
        user.setName(newName);
        
        return userMapper.update(user);
    }

    @Override
    public void delete(String id) {
        userMapper.delete(id);
    }

    @Override
    public UserVO select(UserVO user) throws Exception {
        UserVO ret = null;
        if (user.id != null)
            ret = userMapper.selectById(user.id);
        else if (user.name != null)
            ret = userMapper.selectByName(user.name);
        else
            throw new Exception("매개변수 user의 id 또는 name 중 하나는 찾고자하는 대상으로 설정이 되어있어야 합니다.");
        
        return ret;
    }
}