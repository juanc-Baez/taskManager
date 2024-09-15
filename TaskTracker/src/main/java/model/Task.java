package model;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Task {

    private int id;
    private String desc;
    private TaskStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
