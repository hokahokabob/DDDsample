package memo.dto;

import java.util.Date;

/**
 * DTO:テーブルの１レコードをそのまま写した構造を取る
 * Data Transfer Object
 */
@Getter
@RequiredArgsConstructor
public class MemoDto {

    private long memoId;

    private boolean isTugituku;

    private String title;

    private String content;

    private Date created_at;//ドメインモデルには含まれない（ことが多い）。DB的な管理を主眼としているため

    private Date updated_at;//ドメインモデルには含まれない（ことが多い）。DB的な管理を主眼としているため

    /**
     * (これが唯一の正解ではないと思うが、)
     * とりあえずDTOで全部とってきておいて、
     * ドメインとして必要とする要素だけドメインオブジェクトに再構成して返す
     * @return
     */
    private Memo toDomainModel() {
        return new Memo(memoId, isTugituku, title, content);
    }
}
