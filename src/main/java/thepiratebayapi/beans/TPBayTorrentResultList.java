package thepiratebayapi.beans;

import org.jsoup.nodes.Element;

import java.util.ArrayList;

/**
 * Created by Romain on 01/02/2018.
 */
public class TPBayTorrentResultList extends ArrayList<TPBayTorrentResult> {
    private static String TORRENT_RESULTS_SELECTOR = "#searchResult tbody tr";

    public TPBayTorrentResultList(TPBayPage page) {
        for (Element el : page.getFields(TORRENT_RESULTS_SELECTOR)) {
            add(new TPBayTorrentResult(el));
        }
    }
}
