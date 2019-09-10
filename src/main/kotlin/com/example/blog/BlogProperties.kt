package com.example.blog

import org.springframework.boot.context.properties.ConfigurationProperties


/**
 * Created by Jorge Nieves on Aug 12, 2019.
 */

@ConfigurationProperties("blog")
class BlogProperties {

    lateinit var title: String
    val banner = Banner()

    class Banner {
        var title: String? = null
        lateinit var content: String
    }
}