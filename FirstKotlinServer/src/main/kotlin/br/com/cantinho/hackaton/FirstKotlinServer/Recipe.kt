package br.com.cantinho.hackaton.FirstKotlinServer

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Recipe (val id: Int, val name: String = "", val author: String = "", val email: String = "")