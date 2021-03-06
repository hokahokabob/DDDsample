package memo.dao;

import domain.models.Memo;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DAO = Data Access Object
 */
public class MemoDao {

    /**
     * 技術的な詳細中の詳細
     * ・ユーザ視点、実業務にとって全くどうでもいい
     * ・容易に別の技術(NoSQLデータベース等)に入れ替えることができる
     * @param userId
     * @param favoriteFlg
     * @return
     * @throws SQLException
     */
    public Memo findByUserIdAndFavoriteFLg(long userId, boolean favoriteFlg) throws SQLException {
        String searchSQL = "SELECT * FROM memo" +
                " WHERE user_id = ? AND favorite_flg = ?" +
                " LEFT JOIN user " ;
        Connection conn = null;
        PreparedStatement ps = conn.prepareStatement(searchSQL);
        ResultSet rs = ps.executeQuery();
        return new Memo(
                rs.getInt(1),
                rs.getBoolean(2),
                rs.getString(3),
                rs.getString(4)
        );

    }
}
