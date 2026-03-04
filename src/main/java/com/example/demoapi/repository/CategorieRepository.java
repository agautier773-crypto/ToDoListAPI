package com.example.demoapi.repository;

import com.example.demoapi.entity.Categorie;
import com.example.demoapi.entity.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
