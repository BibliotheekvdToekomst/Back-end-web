package nl.workingtalent.wtlibrary.dto;

import java.time.LocalDateTime;

public class BorrowedBookDto {

    private long id;
    private long userId;
    private long bookCopyId;
    private long copyNumber;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String bookTitle;
    private LocalDateTime borrowDate;
    private LocalDateTime returnedDate;

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getBookCopyId() {
        return bookCopyId;
    }

    public void setBookCopyId(long bookCopyId) {
        this.bookCopyId = bookCopyId;
    }
    

    public long getCopyNumber() {
		return copyNumber;
	}

	public void setCopyNumber(long copyNumber) {
		this.copyNumber = copyNumber;
	}

	public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDateTime getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(LocalDateTime returnedDate) {
        this.returnedDate = returnedDate;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
    
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

}
