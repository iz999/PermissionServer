package pmserver.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper //mapper 인터페이스를 등록한다. mapper xml 과 연결된다.
public interface CommonMapper {
	public String selectPlatformPermission(@Param("requestParam") HashMap<String, String> requestParam); //xml 에서 사용할 파라미터명을 지정할수 있다.
}
