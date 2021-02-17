package geomex.mappers;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import geomex.models.AccountVO;

@Mapper("accountMapper")
public interface AccountMapper {
    public void insert(AccountVO user);
    public AccountVO select(AccountVO user);
}
