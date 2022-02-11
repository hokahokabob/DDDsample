package rest.api;

import application.MemoApplicationService;
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
    @GetMapping("/yout/memo/{userId}/list")
    public MemoResponse list(@PathValiable long userId) {
        MemoResponse response = memoApplicationService.loadFavorites(userId);
        return response;
    }

//    @GetMapping("/wallet/history/{userId}/mohthly")
}
