package application;

import domain.models.Memo;
import domain.service.MemoDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import view.models.MemoResponse;

@Service
public class MemoApplicationService {

    @Autowired
    private MemoDomainService memoDomainService;

    /**
     * applicationとしての処理。
     * ドメインモデルとドメインサービスを駆使しつつアプリケーションの責任を実行する。
     * ・ユーザのお気に入り（とアプリ内で定義しているもの）を持ってきてください、と指示
     * ・ドメインモデルが返された時、そのままの形式ではなくユーザ画面に表示する用の形式に載せ替える責務
     * @param userId
     * @return
     */
    public MemoResponse loadFavorites(long userId) {
        Memo memo = memoDomainService.findFavorites(userId);
        return MemoResponse.of(memo);
    }

}
