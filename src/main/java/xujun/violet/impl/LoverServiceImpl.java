package xujun.violet.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xujun.violet.bean.Lover;
import xujun.violet.dao.LoverRepository;
import xujun.violet.service.LoverService;

@Service
public class LoverServiceImpl implements LoverService {

	@Autowired
	private LoverRepository loverRepository;

	@Override
	public List<Lover> getLovers() {
		return loverRepository.getLovers();
	}
}
