package nl.workingtalent.wtlibrary.dto;

import java.time.LocalDate;

public class ReservationDto {

    private long id;
    
    private LocalDate reservationDate;

	private String reservationStatus;

	private String UserFirstName;

	private String UserLastName;

	private String BookTitle;

//	private int copyNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReservationStatus(){
		return reservationStatus;
	}

	public LocalDate getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}

	public void setReservationStatus(String reservationStatus){
		this.reservationStatus = reservationStatus;
	}

    public String getUserFirstName() {
        return UserFirstName;
    }

    public void setUserFirstName(String UserFirstName) {
        this.UserFirstName = UserFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String UserLastName) {
        this.UserLastName = UserLastName;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String BookTitle) {
        this.BookTitle = BookTitle;
    }

//    public int getCopyNumber() {
//        return copyNumber;
//    }
//
//    public void setCopyNumber(int copyNumber) {
//        this.copyNumber = copyNumber;
//    }

}
