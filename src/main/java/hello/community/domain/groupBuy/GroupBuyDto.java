package hello.community.domain.groupBuy;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GroupBuyDto {

    @Builder
    @Data
    @Schema(description = "모집글에 등록되어야할 정보")
    public static class GroupBuyInfo {
        private String title;
        private String content;
        private Double latitude;
        private Double longitude;
        private String Category;
        private Long headCount;
        private String address;
        private String spotName;
    }


    @Builder
    @Data
    @Schema(description = "모집글에서 보여줄 정보")
    public static class viewGroupBuyInfo {
        private String writerName;
        private String writerImg;
        private String address;
        private String spotName;

        private String title;
        private String img;
        private String content;
        private String Category;
        private LocalDateTime createdAt;
        private Long headCount;
        private Long currentCount;
        private boolean isWriter;
        private boolean isLiked;

        private Double latitude;
        private Double longitude;

        private Long view;
        private Long likes;

        private boolean isCompleted; // 모집 완료 여부 필드 추가
    }

    @Builder
    @Data
    @Schema(description = "리스트로 모집글 보여줄때 필요한 정보")
    public static class viewGroupBuyListInfo {
        private Long id;
        private String title;
        private String img;
        private String Category;
        private LocalDateTime createdAt;
        private Long headCount;
        private Long currentCount;
        private Long likes;
        private boolean isLiked;
    }
}
