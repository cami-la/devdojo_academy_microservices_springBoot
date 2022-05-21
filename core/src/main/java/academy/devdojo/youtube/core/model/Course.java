package academy.devdojo.youtube.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements AbstractEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotNull(message = "The field 'title' is mandatory")
  @Column(nullable = false)
  private String title;
}
