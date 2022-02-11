package domain.service;

import domain.models.Memo;
import domain.models.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemoDomainService {

    @Autowired
    private MemoRepository memoRepository;

    /**
     * ユーザが次つくだけを取得、閲覧したい業務想定を
     * 実現するメソッド
     */
    public Memo findFavorites(long userId)  {
        try {
            return memoRepository.loadTugitukus(userId);
        } catch(Exception e) {
            return null;
        }
    }

}
