package domain.models;

@NoArgsConstuctor
@AllArgsConstructor// コンストラクタを付与してる
public class Memo {

    private long memoId;

    private boolean isTugituku;

    private String title;

    private String content;

//    private Date insert_at;//この辺は今ドメインモデルとして関心がないので不要

    /**
     * domainのルールをこんな感じで記述する
     * @return
     */
    boolean isTugituku() {
        return this.isTugituku;
    }
}
