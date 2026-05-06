package ar.edu.unlp.info.oo1.objetos2.Ejer20BaseDeDatos;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private AuthDataBase authDataBase;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.authDataBase = new AuthDataBase(database, "SECRET");
    }

    @Test
    void testGetSearchResults() {
    	assertEquals(Collections.emptyList(), this.authDataBase.getSearchResults("select * from comics where id=1"));
    	assertFalse(this.authDataBase.authDataBase("INCORRECT"));
    	assertTrue(this.authDataBase.authDataBase("SECRET"));
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.authDataBase.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.authDataBase.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
    	assertEquals(-1, this.authDataBase.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    	assertTrue(this.authDataBase.authDataBase("SECRET"));
        assertEquals(3, this.authDataBase.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.authDataBase.getSearchResults("select * from comics where id=3"));
    }
}