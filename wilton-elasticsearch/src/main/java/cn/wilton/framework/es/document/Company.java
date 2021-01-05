package cn.wilton.framework.es.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
* @Description
* @Author: Ranger
* @Date: 2020/12/22 10:12
* @Email: wilton.icp@gmail.com
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Company {
    @Field(type = FieldType.Keyword, analyzer = "ik_max_word")
    private String name;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String address;

    @Field(type = FieldType.Keyword, analyzer = "ik_max_word")
    private String mobile;

    @Field(type = FieldType.Keyword, analyzer = "ik_max_word")
    private String email;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String nature;

    @Field(type = FieldType.Text)
    private String website;
}
