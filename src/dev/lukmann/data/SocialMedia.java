package dev.lukmann.data;

class SocialMedia {
    String name;
}

//final class Facebook extends SocialMedia {}
class Facebook extends SocialMedia {
    final void login(String username, String password) {
//        body
    }
}

// Error
//class FakeFacebook extends Facebook {}
class FakeFacebook extends Facebook {
//    error
//    void login(String username, String password) {
//
//    }
}