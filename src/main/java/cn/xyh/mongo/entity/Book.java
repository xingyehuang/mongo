package cn.xyh.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants
@Document(collection = "t_book")
public class Book {
	@Id
	private String id;
	private String name;
	private Double price;
}
