package generalizationss;

public class Words<T extends String> {
    private T[] wordses;

    public Words(T... wordses) {
            this.wordses = wordses;
        }

        public T[] getNumbers() {
          for (T element : wordses) ;
          for (int i = 0; i < wordses.length; i++) ;
          return wordses;
      }

      // реверс элементов в массиве
      public T[] reverse() {
            for (T element :wordses) {
                for (int i = 0; i < wordses.length; i++) {
                    T rev = wordses[0];
                    wordses[0] = wordses[1];
                    wordses[1] = rev;
                }
            }
            return wordses;
        }
    }

