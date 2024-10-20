package com.example.streamlit_integration.repository;

import com.example.streamlit_integration.dto.UserDto;
import com.example.streamlit_integration.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByUser(UserDto userdto);  // 특정 사용자의 질문들 찾기
}
