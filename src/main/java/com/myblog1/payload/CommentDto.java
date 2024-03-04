package com.myblog1.payload;

import com.myblog1.entity.Post;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {
    private long id;

    @NotEmpty
    @Size(min = 2, message = "Name should be at least 2 characters")
    private String name;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 5, message ="message should be at least 5 characters")
    private String body;

}
