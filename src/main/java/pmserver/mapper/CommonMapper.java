package pmserver.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper //mapper �������̽��� ����Ѵ�. mapper xml �� ����ȴ�.
public interface CommonMapper {
	public String selectPlatformPermission(@Param("requestParam") HashMap<String, String> requestParam); //xml ���� ����� �Ķ���͸��� �����Ҽ� �ִ�.
}
