package org.example.kotlin

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.Arguments
import org.springframework.graphql.data.method.annotation.MutationMapping
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

    @MutationMapping
    fun createRequest(@Argument name :String,@Argument description: String): PostDto{
  return PostDto(
      id = UUID.randomUUID(),
      name = name,
      description = description
  )
    }

    data class PostDto(val id:UUID, val name:String, val description:String?=null )


}