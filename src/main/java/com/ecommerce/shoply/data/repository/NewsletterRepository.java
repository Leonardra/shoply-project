package com.ecommerce.shoply.data.repository;

import com.ecommerce.shoply.data.model.NewsLetter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsletterRepository extends JpaRepository<NewsLetter, String> {
}
