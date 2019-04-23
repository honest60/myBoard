package spring.cham.test.dao;

import java.util.List;

import spring.cham.test.model.FileT;

// DB 입출력을 담당
public interface FileTDao {
	public List<FileT> select() throws Exception;
}
