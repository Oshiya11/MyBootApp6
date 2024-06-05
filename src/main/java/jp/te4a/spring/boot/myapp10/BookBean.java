package jp.te4a.spring.boot.myapp10;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBean {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id ;
  private String title;
  @Column(nullable = false)
  private String writter;
  private String publisher;
  private Integer price;
}
