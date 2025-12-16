package com.CarproSaas.myfirstproject.Service;

import com.CarproSaas.myfirstproject.controller.IjournalService;
import com.CarproSaas.myfirstproject.entity.JournalEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class JournalService implements IjournalService {

    HashMap<Integer,JournalEntity> journalmap=new HashMap<>();
    @Override
    public List<JournalEntity> GetAllRecords() {
        return  new ArrayList<>(journalmap.values());
    }

    @Override
    public JournalEntity GetRecordById(int id) {
        return journalmap.get(id);
    }

    @Override
    public JournalEntity addRecords(JournalEntity journalEntity) {
        journalmap.put(journalEntity.getId(), journalEntity);
        return journalEntity;
    }

    @Override
    public String DeleteRecord(int id) {
        journalmap.remove(id);
        return "deleted suceesfully";
    }

    @Override
    public JournalEntity UpdateRecords(int id, JournalEntity journalEntity) {
        if(journalmap.containsKey(id)){
            journalEntity.setId(id);

            journalmap.put(id,journalEntity);
        }
        return journalmap.get(id);
    }
}
