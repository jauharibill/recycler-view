package id.technologue.jauharibill.technologue;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jauharibill on 7/2/2018.
 */

public class NewsData {


    public static String[][] dataNews = new String[][]{
            {"Setelah Fortnite, Ini Game yang Terancam Gagal Cross-Play Karena Sony", "Ulwan Fakhri Noviadhista", "July 2, 2018", "https://technologue.id/wp-content/uploads/2018/07/Fallout-76-source-YouTube-Bethesda-Softworks-324x160.jpg"},
            {"Setelah Fortnite, Ini Game yang Terancam Gagal Cross-Play Karena Sony", "Ulwan Fakhri Noviadhista", "July 2, 2018", "https://technologue.id/wp-content/uploads/2018/07/Fallout-76-source-YouTube-Bethesda-Softworks-324x160.jpg"},
            {"Setelah Fortnite, Ini Game yang Terancam Gagal Cross-Play Karena Sony", "Ulwan Fakhri Noviadhista", "July 2, 2018", "https://technologue.id/wp-content/uploads/2018/07/Fallout-76-source-YouTube-Bethesda-Softworks-324x160.jpg"},
            {"Setelah Fortnite, Ini Game yang Terancam Gagal Cross-Play Karena Sony", "Ulwan Fakhri Noviadhista", "July 2, 2018", "https://technologue.id/wp-content/uploads/2018/07/Fallout-76-source-YouTube-Bethesda-Softworks-324x160.jpg"},
            {"Setelah Fortnite, Ini Game yang Terancam Gagal Cross-Play Karena Sony", "Ulwan Fakhri Noviadhista", "July 2, 2018", "https://technologue.id/wp-content/uploads/2018/07/Fallout-76-source-YouTube-Bethesda-Softworks-324x160.jpg"},
            {"Setelah Fortnite, Ini Game yang Terancam Gagal Cross-Play Karena Sony", "Ulwan Fakhri Noviadhista", "July 2, 2018", "https://technologue.id/wp-content/uploads/2018/07/Fallout-76-source-YouTube-Bethesda-Softworks-324x160.jpg"},
    };

    public static ArrayList<News> getListData(){
        News news = null;

        ArrayList<News> list = new ArrayList<>();
        for (int i=0;i<dataNews.length;i++){
            news = new News();
            news.setTitle(dataNews[i][0]);
            news.setAuthor(dataNews[i][1]);
            news.setDate(dataNews[i][2]);
            news.setPhoto(dataNews[i][3]);

            list.add(news);
        }

        return list;
    }

}