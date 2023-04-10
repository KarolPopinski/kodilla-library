package com.kodillalibrary.library;

import com.kodillalibrary.library.domain.Book;
import com.kodillalibrary.library.domain.CopyOfTheBook;
import com.kodillalibrary.library.repository.LibraryRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LibraryRepositoryTestSuite {

    @Autowired
    private LibraryRepository libraryRepository;
    private Long id = null;
    private Long id2 = null;

    private Book book = Book.builder()
            .title("Komnata strachu")
            .author("Jan Testowy")
            .yearOfPublication(1992)
            .build();

    private Book book2 = Book.builder()
            .title("Gra roku")
            .author("Marian Testowy")
            .yearOfPublication(2023)
            .build();

    @BeforeEach
    public void before() {
        libraryRepository.save(book);
        libraryRepository.save(book2);
        id = book.getId();
        id2 = book2.getId();
    }
    @AfterEach
    public void after() {
        if (libraryRepository.existsById(id)) {
            libraryRepository.deleteById(id);
        }
        if (libraryRepository.existsById(id2)) {
            libraryRepository.deleteById(id2);
        }
    }

    @Test
    void testLibraryRepositorySave() {
        Optional<Book> checkBook = libraryRepository.findById(id);
        assertTrue(checkBook.isPresent());
    }
    @Test
    void testLibraryRepositorySaveWithCopies() {
        final List<CopyOfTheBook> bookCopies = new ArrayList<>();

        CopyOfTheBook copyOfTheBook = CopyOfTheBook.builder()
                .copyStatus("free")
                .book(book)
                .build();

        bookCopies.add(copyOfTheBook);
        book.setBookCopy(bookCopies);

        libraryRepository.save(book);

        id = book.getId();
        Assertions.assertNotEquals(0, id);
    }
    @Test
    void testLibraryRepositoryFindById() {
        Optional<Book> checkBook = libraryRepository.findById(id);

        assertEquals(checkBook.get().getId(), id);
    }
    @Test
    void testLibraryReposiotryFindAll() {
        List<Book> allBooks = libraryRepository.findAll();

        assertEquals(allBooks.size(), 2);
    }
    @Test
    void testLibraryRepositoryDeleteById() {

        libraryRepository.deleteById(id);

        List<Book> allBooks = libraryRepository.findAll();
        assertEquals(allBooks.size(), 1);
    }
}
