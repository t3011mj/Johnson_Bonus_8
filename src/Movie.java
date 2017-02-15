import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by mpjoh on 2/14/2017.
 */

public class Movie {

        private int index;
        private String title;
        private String category;

        public Movie(int index, String title, String category) {

            this.index = index;
            this.title = title;
            this.category = category;

        }

        public int getIndex() {
            return index;
        }

        public int setIndex()
        {
            return index;
        }

        public String geTitle() {
            return title;
        }

        public String setTitle()
        {
            return title;
        }

        public String getCategory()
        {
            return category;
        }

        public String setCategory()
        {
            return category;
        }
        @Override
        public String toString() {
            // return index + "\t" + "\t" + title + "\t" + category;
            return String.format("%1$5d %2$30s %3$30s", index, title, category);
        }
    }
