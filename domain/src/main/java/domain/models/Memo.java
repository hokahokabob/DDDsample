package domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor// コンストラクタを付与してる
@Getter
public class Memo {

    private long memoId;

    private boolean isTugituku;

    private String title;

    private String content;

//    private Date created_at;//この辺は今ドメインモデルとして関心がないので不要

    /**
     * domainのルールをこんな感じで記述する
     * @return
     */
    public boolean isTugituku() {
        return this.isTugituku;
    }
}
