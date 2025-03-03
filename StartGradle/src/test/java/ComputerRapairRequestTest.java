import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerRapairRequestTest {
    @Test
    @DisplayName("Test for ComputerRepairRequest")
    public void testComputerRepairRequest() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest(
                1,
                "John",
                "New York",
                "1234567890",
                "Dell",
                "2021-10-10",
                "Problem");
        assertEquals(1, computerRepairRequest.getID());
        assertEquals("John", computerRepairRequest.getOwnerName());
        assertEquals("New York", computerRepairRequest.getOwnerAddress());
        assertEquals("1234567890", computerRepairRequest.getPhoneNumber());
        assertEquals("Dell", computerRepairRequest.getModel());
        assertEquals("2021-10-10", computerRepairRequest.getDate());
        assertEquals("Problem", computerRepairRequest.getProblemDescription());
    }

    @Test
    @DisplayName("Test 2=2")
    public void test2() {
        assertEquals(2, 2, "numbers are not equal");
    }
}
