package memo;

import memo.dao.MemoDao;

/**
 * 技術的な詳細中の詳細
 * ・ユーザ視点、実業務にとって全くどうでもいい部分なのでinftrastructureに隔離している
 * ・容易に別の技術(NoSQLデータベース等)に入れ替えることができる
 *
 * ※ここではDBアクセスのソースを例に出したが、
 * 外部API（ツイート取得とかとか）の詳細な実装などもこれと同じ階層に作られる
 */
public class MemoRepositoryImpl implements MemoRepository {

    /**
     * 「SQLを行使」して「Oracle DBから」データを持ってくるという内容
     */
    @Autowired
    private MemoDao memoDao;

    @Override
    public Memo loadTugitukus(long userId) {
        memoDao.findByUserIdAndFavoriteFLg(
                userId,
                true
        );
    }

}
