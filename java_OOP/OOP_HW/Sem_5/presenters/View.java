package java_OOP.OOP_HW.Sem_5.presenters;

import java_OOP.OOP_HW.Sem_5.models.Table;

import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTablesView(Collection<Table> tables);

    void updateReservationTableResult(int reservationNo);

}
