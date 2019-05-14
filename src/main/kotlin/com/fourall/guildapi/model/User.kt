package com.fourall.guildapi.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @JsonIgnore
        val id: Long = 0,
        val name: String = "",
        val cpf: String = "",
        val description: String = "",
        val photo: ByteArray? = null,
        val email: String = "",
        var password: String = ""
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (id != other.id) return false
        if (name != other.name) return false
        if (cpf != other.cpf) return false
        if (description != other.description) return false
        if (photo != null) {
            if (other.photo == null) return false
            if (!photo.contentEquals(other.photo)) return false
        } else if (other.photo != null) return false
        if (email != other.email) return false
        if (password != other.password) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + cpf.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + (photo?.contentHashCode() ?: 0)
        result = 31 * result + email.hashCode()
        result = 31 * result + password.hashCode()
        return result
    }

}