package behavioralPatterns.iterator.example1.spammer;

import behavioralPatterns.iterator.example1.collections.SocialNetwork;
import behavioralPatterns.iterator.example1.iterators.ProfileIterator;
import behavioralPatterns.iterator.example1.profile.Profile;

public class Client_SocialSpammer {
    public SocialNetwork collection;
    public ProfileIterator iterator;

    public Client_SocialSpammer(SocialNetwork network) {
        this.collection = network;
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nIterating over friends...\n");
        iterator = collection.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("\nIterating over coworkers...\n");
        iterator = collection.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}

