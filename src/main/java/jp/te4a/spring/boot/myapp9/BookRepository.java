package jp.te4a.spring.boot.myapp9;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface BookRepository extends JpaRepository<BookBean, Integer> {
  
  @Query("SELECT X FROM BookBean X ORDER BY X.title")
  List<BookBean> findAllOrderByTitle();
}