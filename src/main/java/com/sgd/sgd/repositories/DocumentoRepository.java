package com.sgd.sgd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgd.sgd.entities.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
