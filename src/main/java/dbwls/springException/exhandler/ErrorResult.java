package dbwls.springException.exhandler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data

public class ErrorResult {

    private String code;
    private String message;

    @Builder
    public ErrorResult(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
