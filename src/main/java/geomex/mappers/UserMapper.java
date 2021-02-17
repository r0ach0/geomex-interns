package geomex.mappers;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import geomex.models.UserVO;

@Mapper("userMapper")
public interface UserMapper {
    public void create(UserVO user);
    public void delete(String id);
    public UserVO update(UserVO user);
    public UserVO selectById(String id);
    public UserVO selectByName(String name);
}
