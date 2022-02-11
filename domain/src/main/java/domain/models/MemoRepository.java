package domain.models;
//リポジトリもドメインモデルの一つである

import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public interface MemoRepository {

    /**
     * ユーザが次つくだけを閲覧したい業務想定を
     * データアクセスをうまく行いながら実現
     * ここで、「SQLを発行してMySQLデータベースのXXテーブルに、、」
     * という技術的な知識は
     * ユーザからみて関係ないことであり、分離されている
     * （上記内容はMemoRepositoryImplに書かれている）
     *
     * キーワード：依存関係逆転の法則　抽象に依存すべき　←大事
     */
    Memo loadTugitukus(long userId) ;
}

