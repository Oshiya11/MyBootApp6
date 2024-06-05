package jp.te4a.spring.boot.myapp10;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
public class BookForm {
  @Id
    private Integer id;
  @Column(nullable = false)
  private String title;
  private String writter;
  private String publisher;
  private Integer price;
}

