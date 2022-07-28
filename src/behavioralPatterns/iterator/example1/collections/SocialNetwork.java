package behavioralPatterns.iterator.example1.collections;

import behavioralPatterns.iterator.example1.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}