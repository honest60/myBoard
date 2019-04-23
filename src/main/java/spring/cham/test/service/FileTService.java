package spring.cham.test.service;

import java.util.List;

import spring.cham.test.model.FileT;

// 필요한 연산은 Service에서 한다.
public interface FileTService {
	public List<FileT> selectService() throws Exception;
}
