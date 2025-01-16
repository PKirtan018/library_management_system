package Model;

public class User {
    String libUser;
    int libraryCardNo;

    public User(String libUser, int libraryCardNo) {
        this.libUser = libUser;
        this.libraryCardNo = libraryCardNo;
    }

    public String getLibUser() {
        return libUser;
    }

    public void setLibUser(String libUser) {
        this.libUser = libUser;
    }

    public int getLibraryCardNo() {
        return libraryCardNo;
    }

    public void setLibraryCardNo(int libraryCardNo) {
        this.libraryCardNo = libraryCardNo;
    }
}
