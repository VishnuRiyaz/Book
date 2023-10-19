package com.Project.Book.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.Book.model.Bookshop;





@Repository
public interface BookRepo extends JpaRepository<Bookshop,Integer>
{
}