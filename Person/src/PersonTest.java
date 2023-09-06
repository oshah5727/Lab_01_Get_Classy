import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3, p4, p5;

    @BeforeEach
    void setUp() {
        p1 = new Person("000001", "Bilbo", "Baggins", "Esq.", 1941);
        p2 = new Person("000002", "Frodo", "Baggins", "Dr.", 1945);
        p3 = new Person("000003", "Samwise", "Gamgee", "Mr.", 1950);
        p4 = new Person("000004", "Peregrin", "Took", "Mrs.", 1975);
        p5 = new Person("000005", "Meridoc", "Brandybuck", "Ms.", 2000);
    }

    @Test
    void setID() {
        p1.setID("000005");
        assertEquals("000005", p1.getID());

        p2.setID("000004");
        assertEquals("000004", p2.getID());

        p3.setID("000003");
        assertEquals("000003", p3.getID());

        p4.setID("000002");
        assertEquals("000002", p4.getID());

        p5.setID("000001");
        assertEquals("000001", p5.getID());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Meridoc");
        assertEquals("Meridoc", p1.getFirstName());

        p2.setFirstName("Peregrin");
        assertEquals("Peregrin", p2.getFirstName());

        p3.setFirstName("Samwise");
        assertEquals("Samwise", p3.getFirstName());

        p4.setFirstName("Frodo");
        assertEquals("Frodo", p4.getFirstName());

        p5.setFirstName("Bilbo");
        assertEquals("Bilbo", p5.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("Brandybuck");
        assertEquals("Brandybuck", p1.getLastName());

        p2.setLastName("Took");
        assertEquals("Took", p2.getLastName());

        p3.setLastName("Gamgee");
        assertEquals("Gamgee", p3.getLastName());

        p4.setLastName("Baggins");
        assertEquals("Baggins", p4.getLastName());

        p5.setLastName("Baggins");
        assertEquals("Baggins", p5.getLastName());
    }

    @Test
    void setTitle() {
        p1.setTitle("Ms.");
        assertEquals("Ms.", p1.getTitle());

        p2.setTitle("Mrs.");
        assertEquals("Mrs.", p2.getTitle());

        p3.setTitle("Mr.");
        assertEquals("Mr.", p3.getTitle());

        p4.setTitle("Dr.");
        assertEquals("Dr.", p4.getTitle());

        p5.setTitle("Esq.");
        assertEquals("Esq.", p5.getTitle());
    }

    @Test
    void setYOB() {

        p1.setYOB(2000);
        assertEquals(2000, p1.getYOB());

        p2.setYOB(1975);
        assertEquals(1975, p2.getYOB());

        p3.setYOB(1950);
        assertEquals(1950, p3.getYOB());

        p4.setYOB(1945);
        assertEquals(1945, p4.getYOB());

        p5.setYOB(1941);
        assertEquals(1941, p5.getYOB());
    }

    @Test
    void fullName() {
        assertEquals("Bilbo Baggins", p1.fullName());
        assertEquals("Frodo Baggins", p2.fullName());
        assertEquals("Samwise Gamgee", p3.fullName());
        assertEquals("Peregrin Took", p4.fullName());
        assertEquals("Meridoc Brandybuck", p5.fullName());
    }

    @Test
    void formalName() {
        assertEquals("Esq. Bilbo Baggins", p1.formalName());
        assertEquals("Dr. Frodo Baggins", p2.formalName());
        assertEquals("Mr. Samwise Gamgee", p3.formalName());
        assertEquals("Mrs. Peregrin Took", p4.formalName());
        assertEquals("Ms. Meridoc Brandybuck", p5.formalName());
    }

    @Test
    void getAge() {
        assertEquals("82", p1.getAge());
        assertEquals("78", p2.getAge());
        assertEquals("73", p3.getAge());
        assertEquals("48", p4.getAge());
        assertEquals("23", p5.getAge());
    }

    @Test
    void testGetAge() {
      assertEquals("77", p1.getAge(2018));
      assertEquals("74", p2.getAge(2019));
      assertEquals("70", p3.getAge(2020));
      assertEquals("46", p4.getAge(2021));
      assertEquals("22", p5.getAge(2022));
    }

    @Test
    void toCSVDataRecord() {
      assertEquals("000001, Bilbo, Baggins, Esq., 1941", p1.toCSVDataRecord());
      assertEquals("000002, Frodo, Baggins, Dr., 1945", p2.toCSVDataRecord());
      assertEquals("000003, Samwise, Gamgee, Mr., 1950", p3.toCSVDataRecord());
      assertEquals("000004, Peregrin, Took, Mrs., 1975", p4.toCSVDataRecord());
      assertEquals("000005, Meridoc, Brandybuck, Ms., 2000", p5.toCSVDataRecord());
    }

    @Test
    void testToString() {
     assertEquals("Person{ID='000001', firstName='Bilbo', lastName='Baggins', title='Esq.', YOB=1941}", p1.toString());
     assertEquals("Person{ID='000002', firstName='Frodo', lastName='Baggins', title='Dr.', YOB=1945}", p2.toString());
     assertEquals("Person{ID='000003', firstName='Samwise', lastName='Gamgee', title='Mr.', YOB=1950}", p3.toString());
     assertEquals("Person{ID='000004', firstName='Peregrin', lastName='Took', title='Mrs.', YOB=1975}", p4.toString());
     assertEquals("Person{ID='000005', firstName='Meridoc', lastName='Brandybuck', title='Ms.', YOB=2000}", p5.toString());
    }
}
