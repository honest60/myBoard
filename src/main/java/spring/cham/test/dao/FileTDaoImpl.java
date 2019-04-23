package spring.cham.test.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import spring.cham.test.model.FileT;

//Dao를 스프링에 인식 시킴
@Repository
public class FileTDaoImpl implements FileTDao {
	//사용할 Mapper.xml의 namepspace
	private static final String ns = "spring.cham.test.model.myBoard";
	
	//DB  커넥션과 클로즈를 자동으로 해주는 SqlSession
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<FileT> select() throws Exception {
		// TODO Auto-generated method stub
													   // Mapper.xml 쿼리문의 id
		List<FileT> list = sqlSession.selectList(ns + ".fileT");
/*		for(int i=0; i<list.size(); i++) {
			System.out.println("file_num의 값: " + list.get(i).getFile_num());
			System.out.println("file_name의 값: " + list.get(i).getFile_name());
		} */
		for(FileT data : list) {
			System.out.println("file_num의 값: " + data.getFile_num());
			System.out.println("file_name의 값: " + data.getFile_name());
		}
		return list;
	}
}
