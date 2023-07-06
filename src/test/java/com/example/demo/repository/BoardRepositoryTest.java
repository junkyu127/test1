package com.example.demo.repository;

import com.example.demo.domain.Board;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Log4j2
public class BoardRepositoryTest {
    public static BoardRepository boardRepository; // 테스트 할 놈 가져오기
    // save 메서드
    @Test
    public void saveTest() {
        Board board = Board.builder()
                .title("test")
                .contents("contents")
                .writer("writer")
                .date("2023-06-29")
                .build();
        log.info(board);
    }
    // delete 메서드
    @Test
    public void deleteTest() {
        int id=1;
        boardRepository.delete(id);
    }

    // edit 메서드
    @Test
    public void editTest() {
        int id = 1;
        Board board = Board.builder()
                .title("test")
                .contents("test")
                .writer("test")
                .date("2023-06-29")
                .build();
        List<Board> result = boardRepository.edit(1, board);
        log.info(result);
    }

    // findAll 메서드
    @Test
    public void findAllTest() {
        int id = 1;
        List<Board> result = boardRepository.findAll();
        log.info(result);
    }

    // findById 메서드
    @Test
    public void findByIdTest() {
        int id = 1;
//        Board result = boardRepository.findById(id);
//        log.info(result);
    }
}
