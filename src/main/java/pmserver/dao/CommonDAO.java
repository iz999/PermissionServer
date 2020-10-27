package pmserver.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommonDAO {
	public String selectPlatformPermission(@Param("requestParam") HashMap<String, String> requestParam);
}
