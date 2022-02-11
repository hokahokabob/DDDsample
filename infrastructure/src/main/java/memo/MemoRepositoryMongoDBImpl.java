package memo;

import memo.dao.MemoMongoDao;

public class MemoRepositoryMongoDBImpl implements MemoRepository {

    /**
     * 「MongoDBスクリプト？を行使」して「MongoDBから」データを持ってくるという内容
     */
    @Autowired
    private MemoMongoDao memoMongoDao;

    @Override
    public Memo loadTugitukus(long userId) {
        memoMongoDao.findByUserIdAndFavoriteFLg(
                userId,
                true
        );
    }
}
