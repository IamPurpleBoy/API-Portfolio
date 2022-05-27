
package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Skill;
import com.testSpring.apiTest.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{

@Autowired
public SkillRepository skillRepo;
    
    @Override
    public List<Skill> verSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill skl) {
        skillRepo.save(skl);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public Skill modificarSkill(Skill skl) {
        return skillRepo.save(skl);
    }
    
}
