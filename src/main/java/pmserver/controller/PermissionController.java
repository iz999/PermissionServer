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
	
	@Autowired //�ش� ���� ã�Ƽ� �������ش�.
	private PermissionServerService permissionServerService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/platformPermission") //Restfull API ���
    public @ResponseBody PermissionServerResponse setSendData(@RequestBody HashMap<String, String> requestParam) { // �Է��� ���� VO�� ������ �ʰ� HashMap ���� �޴´�.
		
		
		HashMap<String, String> platfromPermission = new HashMap<String, String>();
		
		List<String> errors = new ArrayList<>();
		
		try {
			
			logger.debug(new ObjectMapper().writeValueAsString(requestParam)); //�α� ������� Object �� json ���·� ���
			
        	platfromPermission.put("permission", permissionServerService.getPlatfromPermission(requestParam)); // ���񽺸� Ȱ���ؼ� ����� ������ �����´�.
        } 
        catch (Exception e) {
        	
            errors.add(e.getMessage());
            
            e.printStackTrace();
        }
        
        
        return CommonAdapter.getPermissionServerResponse(platfromPermission, errors); // Response�� ���� ����
    }

}
