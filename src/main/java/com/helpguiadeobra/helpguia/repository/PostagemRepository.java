package com.helpguiadeobra.helpguia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.helpguiadeobra.helpguia.model.PostagemModel;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {
	public List<PostagemModel>findAllByTitleContainingIgnoreCase (Long title);

	

}
