package behavioralPatterns.iterator.example1.iterators;

import behavioralPatterns.iterator.example1.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}