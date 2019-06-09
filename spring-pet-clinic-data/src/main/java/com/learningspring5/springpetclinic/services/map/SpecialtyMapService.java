package com.learningspring5.springpetclinic.services.map;

import com.learningspring5.springpetclinic.model.Specialty;
import com.learningspring5.springpetclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty,Long> implements SpecialtiesService {
    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Specialty Object) {
        super.delete(Object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
