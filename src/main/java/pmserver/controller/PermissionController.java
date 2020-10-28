package pmserver.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import pmserver.response.CommonAdapter;
import pmserver.response.PermissionServerResponse;
import pmserver.service.PermissionServerService;

@RestController
@RequestMapping("/")
public class PermissionController {
	
	private static final Logger logger = LoggerFactory.getLogger(PermissionController.class);
	
	@Autowired //해당 빈을 찾아서 연결해준다.
	private PermissionServerService permissionServerService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/platformPermission") //Restfull API 경로
    public @ResponseBody PermissionServerResponse setSendData(@RequestBody HashMap<String, String> requestParam) { // 입력은 따로 VO를 만들지 않고 HashMap 으로 받는다.
		
		
		HashMap<String, String> platfromPermission = new HashMap<String, String>();
		
		List<String> errors = new ArrayList<>();
		
		try {
			
			logger.debug(new ObjectMapper().writeValueAsString(requestParam)); //로그 출력으로 Object 를 json 형태로 출력
			
        	platfromPermission.put("permission", permissionServerService.getPlatfromPermission(requestParam)); // 서비스를 활용해서 결과를 권한을 가져온다.
        } 
        catch (Exception e) {
        	
            errors.add(e.getMessage());
            
            e.printStackTrace();
        }
        
        
        return CommonAdapter.getPermissionServerResponse(platfromPermission, errors); // Response를 만들어서 리턴
    }

}
