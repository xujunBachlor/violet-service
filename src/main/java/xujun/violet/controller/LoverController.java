package xujun.violet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;
import xujun.violet.bean.Lover;
import xujun.violet.service.LoverService;

@RestController
@CrossOrigin
public class LoverController {

	@Autowired
	private LoverService loverService;
	
	@RequestMapping("/violet")
	public JSONObject getLovers() {
		JSONObject json = new JSONObject();
		List<Lover> list = loverService.getLovers();
		json.put("violet", list);
		return json;
	}
}
