package com.bootcamp.demo2403;

import java.time.LocalDate;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString 
@EqualsAndHashCode
@Builder
@Getter
@Setter

public class Staff {
  private String name;
  private LocalDate joinDate;

  }
 

