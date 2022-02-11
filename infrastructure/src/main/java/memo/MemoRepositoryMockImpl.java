package memo;

import domain.models.Memo;
import domain.models.MemoRepository;

/**
 * DBの技術が決まってない時、
 * DBの実装ができていない中でテストする時、
 * このようにMockの実装に切り替える選択を取ることがある
 */
public class MemoRepositoryMockImpl implements MemoRepository {
    @Override
    public Memo loadTugitukus(long userId) {
        return new Memo(
                100,
                false,
                "title",
                "content");
    }
}
