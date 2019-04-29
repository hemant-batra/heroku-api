package app.jpa.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ElementDTO {
    private String elementId;
    private String ipAddress;
    private Timestamp createdOn;
    private String content;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd MMM yyyy HH:mm:ss zzz", timezone = "Asia/Kolkata")
    private Timestamp displayCreatedOn;
}
