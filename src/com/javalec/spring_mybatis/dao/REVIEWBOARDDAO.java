package com.javalec.spring_mybatis.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import com.javalec.spring_mybatis.dto.Criteria;
import com.javalec.spring_mybatis.dto.RBOARDCOMMENTDTO;
import com.javalec.spring_mybatis.dto.RBOARDDTO;
import com.javalec.spring_mybatis.dto.RBOARDLIKEDTO;
import com.javalec.spring_mybatis.dto.REVIEWBOARDDTO;
import com.javalec.spring_mybatis.dto.SearchCriteria;
import com.javalec.spring_mybatis.dto.uploadFileDTO;


@Repository
public interface REVIEWBOARDDAO {



public List<RBOARDCOMMENTDTO> RAllList(int reviewboardno);


//select?�� xml?��?�� resulttype?�� getter,setter만든 DTO로설?��?���? (반환?��)
//insert update delete?�� parameterType ?���? DTO�? ?��?��?��?��. 


//?��체선?��
public List<REVIEWBOARDDTO> RselectAll();
//�??��?��
public void Rinsert(REVIEWBOARDDTO dto);
//?��?��보기
public REVIEWBOARDDTO RselectOne(int reviewboardno); 
//?��?��
public int Rdelete(int reviewboardno);
//?��체삭?��
public int RmultiDelete(String[] seq);
//?��?��

public void Rrboard_update(REVIEWBOARDDTO dto);


//조회?�� ?��?��?��?��
public int RupdateReadcount(int readcount, int reviewboardno);
//?���??�� ?��?��?��?��
public int RupdateComment(int reviewboardno);

//?��?��?��로드
public void RuploadFile(HashMap<String, Object> hm);

//board_detail?��?�� ?��로드?�� ?��?�� 보기
public List<uploadFileDTO> RgetFileList(int reviewboardno);





//rboard진입
public List<REVIEWBOARDDTO> RlistRboard(Criteria cri);

//게시�? �? �??��
public int RlistCount();

//조회?�� ?��???�� ?��?��
public List<REVIEWBOARDDTO> Rorderbyreadcount(Criteria cri);
//?���??�� 많�??�� ?��?��
public List<REVIEWBOARDDTO> Rorderbycommentcount(Criteria bs);




//�??�� 조건?�� 맞게
public List<REVIEWBOARDDTO> RlistSearch(SearchCriteria bs);


//�??��?�� 게시�? �? �??��
public int RcountSearch(SearchCriteria bs);

//조회?�� ?��???�� ?��?��
public List<REVIEWBOARDDTO> Rsearchorderbyreadcount(SearchCriteria cri);
//?���??�� 많�??�� ?��?��
public List<REVIEWBOARDDTO> Rsearchorderbycommentcount(SearchCriteria bs);






//조회?��
public int RboardHit(int reviewboardno);

//좋아?��
public int RlikeCheck(Map<String, Object> m);

//좋아?�� 개수
public int RlikeCount(int reviewboardno);

public void RinsertBoardLike(RBOARDLIKEDTO dto);

public void RdeleteBoardLike(RBOARDLIKEDTO dto);






//?��?�� ?��?��?���? ?��?��?�� �?
public List<REVIEWBOARDDTO> Rmadeby(String id);


}
