package com.example.phonebook.users

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int>