package geomex.impls;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import geomex.mappers.AccountMapper;
import geomex.models.AccountVO;

@Service("accountService")
public class AccountServiceImpl {
    @Resource(name = "accountMapper")
    private AccountMapper mapper;
    
    public void create(AccountVO user) {
        mapper.insert(user);
    }
    
    public boolean isAvailableAccount(AccountVO user) {
        return mapper.select(user) != null;
    }
}
