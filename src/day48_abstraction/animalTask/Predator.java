package day48_abstraction.animalTask;

public interface Predator { //interface: known as 100% abstraction.
                            // Access modifier: public(cannot use other access modifier other than public); method: by default is abstract.

      void  hunt();        // so it is not necessary to give public (access modifier) and abstract key word.

      boolean isWiled=true;
}
