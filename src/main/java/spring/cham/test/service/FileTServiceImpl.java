package spring.cham.test.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import spring.cham.test.dao.FileTDao;
import spring.cham.test.model.FileT;

@Service
public class FileTServiceImpl implements FileTService {
	@Inject
	private FileTDao dao;

	@Override
	public List<FileT> selectService() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("service impl");
		return dao.select();
	}
}
