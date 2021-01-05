package cn.wilton.framework.es.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDate;

/**
 * @Description es人员信息
 * @Author: Ranger
 * @Date: 2020/12/21 17:04
 * @Email: wilton.icp@gmail.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Document(indexName = "user",type = "docs",shards = 1,replicas = 0)
public class User {
    private static final long serialVersionUID = -1L;
    @Id
    private Long id;

    @Field(type = FieldType.Keyword, analyzer = "ik_max_word")
    private String name;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String address;

    @Field(type = FieldType.Keyword, analyzer = "ik_max_word")
    private String mobile;

    @Field(type = FieldType.Keyword, analyzer = "ik_max_word")
    private String email;

    @Field(type = FieldType.Date, format = DateFormat.date)
    private LocalDate birthday;

    @Field(type = FieldType.Keyword)
    private String idCard;

    @Field
    private Company company;
}
