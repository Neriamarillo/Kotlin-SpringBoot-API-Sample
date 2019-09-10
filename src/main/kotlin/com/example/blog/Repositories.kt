package com.example.blog

import org.springframework.data.repository.CrudRepository

/**
 * Created by Jorge Nieves on Aug 12, 2019.
 */

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User
}