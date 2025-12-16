package com.CarproSaas.myfirstproject.controller;

import com.CarproSaas.myfirstproject.Service.JournalService;
import com.CarproSaas.myfirstproject.entity.JournalEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class JournalController {

    private final JournalService journalService;

    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }

    //Create
    @PostMapping("/AddRec")
    public ResponseEntity<JournalEntity> addRecords(@RequestBody JournalEntity journalEntity) {
            return  new ResponseEntity<>(journalService.addRecords(journalEntity), HttpStatus.CREATED);
    }


    @GetMapping("/GetAll")
    public List<JournalEntity> GetAllRecords(){
        return journalService.GetAllRecords();
    }
    @GetMapping("/{R_id}")
    public JournalEntity GetRecordById(@PathVariable int R_id){
        return journalService.GetRecordById(R_id);
    }

    @DeleteMapping("/{id}")
    public String DeleteRecord(@PathVariable int id ){

      return   journalService.DeleteRecord(id);

    }
    @PutMapping("/{Id}")
    public JournalEntity UpdateRecords(@PathVariable int Id,@RequestBody JournalEntity journalEntity){
       return journalService.UpdateRecords(Id,journalEntity);

    }
}
