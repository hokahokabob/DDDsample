package memo;

import domain.models.Memo;
import domain.models.MemoRepository;
import memo.dao.MemoMongoDao;
import org.springframework.beans.factory.annotation.Autowired;

public class MemoRepositoryMongoDBImpl implements MemoRepository {

    /**
     * 「MongoDBスクリプト？を行使」して「MongoDBから」データを持ってくるという内容
     */
    @Autowired
    private MemoMongoDao memoMongoDao;

    @Override
    public Memo loadTugitukus(long userId) {
        return memoMongoDao.findByUserIdAndFavoriteFLg(
                userId,
                true
        );
    }
}
