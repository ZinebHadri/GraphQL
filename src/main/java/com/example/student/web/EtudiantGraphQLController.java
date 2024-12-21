package com.example.student.web;

import com.example.student.dto.EtudiantDTO;
import com.example.student.service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;
@Controller
@AllArgsConstructor
public class EtudiantGraphQLController {

    private EtudiantService etudiantService ;

    @MutationMapping
    public EtudiantDTO saveEtudiant(@Argument EtudiantDTO  etudiant){
        return etudiantService.saveEtudiant(etudiant);
    }

    @MutationMapping
    public Boolean deleteEtudiant(@Argument Long id){
        return etudiantService.deleteEtudiant(id);
    }


    @QueryMapping
    public List<EtudiantDTO> getEtudiantByDateNaissance(@Argument Date DateN){
        return  etudiantService.getEtudiantByDateNaissance(DateN);
    }


}


