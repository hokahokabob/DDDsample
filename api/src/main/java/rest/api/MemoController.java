package rest.api;

import application.MemoApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import view.models.MemoResponse;

@RestController
public class MemoController {

    @Autowired
    MemoApplicationService memoApplicationService;

    /**
     * アプリケーションサービスにプロキシするだけ
     * なので基本的に行数は少ない
     * （実際にはエラーハンドリングでtry-catchを書くことが多く、
     * そっちのがよっぽど長くなるイメージ。）
     *
     * 必要だけどDDDの主眼というわけでもないかな
     */
    @GetMapping("/yout/memo/{userId}/list_favorites")
    public MemoResponse list(@PathVariable long userId) {
        MemoResponse response = memoApplicationService.loadFavorites(userId);
        return response;
    }

}
