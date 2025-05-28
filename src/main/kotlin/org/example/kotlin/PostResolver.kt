package org.example.kotlin

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import java.util.UUID

@Controller
class PostResolver {
@QueryMapping
    fun getPosts() : List<PostDto>{
return listOf(
    PostDto(
    id = UUID.randomUUID(),
    name  = "dharani",
        description = "hello dear"
))
    }

    data class PostDto(val id:UUID, val name:String, val description:String?=null )


}