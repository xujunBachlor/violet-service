package xujun.violet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import xujun.violet.bean.Lover;

@Service
public interface LoverService {

	List<Lover> getLovers();
}
