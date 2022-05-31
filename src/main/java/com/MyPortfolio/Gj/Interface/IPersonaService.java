package com.MyPortfolio.Gj.Interface;

import com.MyPortfolio.Gj.Entity.Persona;
import java.util.List;


public interface IPersonaService {

    public List<Persona> getPersona();
    
    public void savePersona (Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(long id);
    
}
