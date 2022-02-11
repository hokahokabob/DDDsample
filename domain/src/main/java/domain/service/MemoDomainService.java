package domain.service;

import domain.models.Memo;
import domain.models.MemoRepository;

@Service
public class MemoDomainService {

    @Autowired
    private MemoRepository memoRepository;

    /**
     * ユーザが次つくだけを取得、閲覧したい業務想定を
     * 実現するメソッド
     */
    public Memo findFavorites(long userId) {
        return memoRepository.loadTugitukus(userId);
    }

}
