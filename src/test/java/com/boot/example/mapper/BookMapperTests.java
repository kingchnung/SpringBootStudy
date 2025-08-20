package com.boot.example.mapper;

import com.boot.example.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BookMapperTests {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void bookListTest(){
        bookMapper.bookList().stream().forEach((book) -> log.info(book.toString()));
    }

    @Test
    public void testBookInsert() {
        Book book = Book.builder()
                .title("왕찬웅 전기")
                .author("왕찬웅")
                .publisher("왕가네 식구들")
                .publishDate("2025-08-18")
                .price(145568465).build();
        int result = bookMapper.bookInsert(book);
        log.info("적용된 행의 수 : {}", result);
    }

    @Test
    public void testBookDelete() {
        Book book = Book.builder().bookId(24).build();
        int result = bookMapper.bookDelete(book);
        log.info("삭제된 행의 수 : {}", result);

    }

    @Test
    public void testBookUpdate() {
        Book book = Book.builder().title("왕찬웅 수정").author("왕찬웅")
                .publisher("왕가네식구들").publishDate("25-08-18")
                .price(157654821).build();
        int result = bookMapper.bookUpdate(book);
        log.info("수정된 행의 수 : {}", result);
    }
}
