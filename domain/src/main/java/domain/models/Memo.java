package domain.models;

@NoArgsConstuctor
@AllArgsConstructor// コンストラクタを付与してる
public class Memo {

    private long memoId;

    private boolean isTugituku;

    private String title;

    private String content;
}
