package ru.boyarshinov.MyFourthSpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.boyarshinov.MyFourthSpringBootApp.dao.DisciplineDAO;
import ru.boyarshinov.MyFourthSpringBootApp.entity.Discipline;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DisciplineServiceImpl implements DisciplineService{
    @Autowired
    private DisciplineDAO disciplineDAO;

    @Override
    @Transactional
    public List<Discipline> getAllDisciplines(){
        return disciplineDAO.getAllDisciplines();
    }

    @Override
    @Transactional
    public Discipline getDiscipline(int disid) { return disciplineDAO.getDiscipline(disid); }

    @Override
    @Transactional
    public Discipline saveDiscipline(Discipline discipline){
        return disciplineDAO.saveDiscipline(discipline);
    }

    @Override
    @Transactional
    public void deleteDiscipline(int disid) { disciplineDAO.deleteDiscipline(disid); }
}
