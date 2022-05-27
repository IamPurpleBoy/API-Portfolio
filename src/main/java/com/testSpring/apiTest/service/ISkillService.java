
package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Skill;
import java.util.List;


public interface ISkillService {

    public List<Skill> verSkill();
    public void crearSkill (Skill skl);
    public void borrarSkill (Long id);
    public Skill buscarSkill (Long id);   
    public Skill modificarSkill(Skill skl);
}
