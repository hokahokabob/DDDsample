package view.models;

import java.util.Objects;

@NoArgsConstuctor
@AllArgsConstructor// コンストラクタを付与してる
@Builder
public class MemoResponse {

    private long memoId;

    private boolean isTugituku;

    private String title;

    private String content;
Kechakechakechadon2000
    //domainオブジェクトを、ユーザに表示する用の形式に整形する
    public static MemoResponse of(Memo memo) {
        return new MemoResponse.builder()
                .memoId(memo.getMemoId())
                .isTugituku(memo.getTugituku())
                .title(Objects.nonNull(memo.getTitle()) ? memo.getTitle() : "No Title")
                .content(memo.getContent())
                .build();
    }
}
