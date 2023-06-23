package java_OOP.OOP_HW.Sem_5;

import java_OOP.OOP_HW.Sem_5.models.TableModel;
import java_OOP.OOP_HW.Sem_5.presenters.BookingPresenter;
import java_OOP.OOP_HW.Sem_5.views.BookingView;

import java.util.ArrayList;
import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  Метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 103, "Станислав");

        bookingView.changeReservationTable(9001, new Date(), 104, "Станислав");
        
    }

}
