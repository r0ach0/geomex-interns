package geomex.impls;

import geomex.models.UserVO;

public interface UserService {
    public void create(UserVO user);
    public void delete(String userId);
    public UserVO updateName(String userId, String newName);
    public UserVO select(UserVO user) throws Exception; // Id 또는 Name 둘 중 하나로 검색
}