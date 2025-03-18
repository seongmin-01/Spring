package kr.co.ch07.repository.board;

import kr.co.ch07.entity.board.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {   // 두번 째 인자값으로 해당 entity의 id속성 자료형

}
