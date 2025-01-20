package ru.boyarshinov.MyFourthSpringBootApp.dao;

import org.springframework.stereotype.Repository;
import ru.boyarshinov.MyFourthSpringBootApp.entity.Discipline;

import java.util.List;

@Repository
public interface  DisciplineDAO {
    List<Discipline> getAllDisciplines();
    Discipline saveDiscipline(Discipline discipline);
    Discipline getDiscipline(int disid);
    void deleteDiscipline(int disid);
}
